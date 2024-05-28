package uq.app.jacm.interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private Socket clientSocket;
    private InterfaceGoTicketNow interfaceGoTicketNow;
    int index;

    public ClientHandler(Socket socket, InterfaceGoTicketNow interfaceGoTicketNow, int index) {
        this.clientSocket = socket;
        this.interfaceGoTicketNow = interfaceGoTicketNow;
        this.index = index;
    }

    @Override
    public void run() {
		interfaceGoTicketNow.setVisible(false);
		InterfaceSoldShow interfaceSoldShow = new InterfaceSoldShow(this.interfaceGoTicketNow, this.interfaceGoTicketNow.getGoTicketNow().getUserAccountLogin(), this.interfaceGoTicketNow.getEvents().get(index));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		interfaceSoldShow.setLocation(screen.width/5, screen.height/3);
		interfaceSoldShow.setSize(800, 350);
		interfaceSoldShow.setVisible(true);
    }
}
