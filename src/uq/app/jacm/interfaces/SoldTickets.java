package uq.app.jacm.interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import uq.app.jacm.tools.Generic;

public class SoldTickets {
    private static final int PORT = Generic.port;
    private static final int MAX_USERS = 3;
    private static int usersCount = 0;
    private static InterfaceGoTicketNow interfaceGoTicketNow;
    private static int index;
    
    public SoldTickets(InterfaceGoTicketNow interfaceGoTicketNow, int index) {
    	this.interfaceGoTicketNow = interfaceGoTicketNow;
    	this.index = index;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(MAX_USERS);
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                if (usersCount < MAX_USERS) {
                    executor.execute(new ClientHandler(clientSocket, interfaceGoTicketNow, index));
                    usersCount++;
                } else {
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    out.println("Server busy. Please try again later.");
                    clientSocket.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            executor.shutdown();
        }
    }
}