package uq.app.jacm.controllers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

import uq.app.jacm.interfaces.InterfaceGoTicketNow;
import uq.app.jacm.interfaces.InterfaceLogin;
import uq.app.jacm.interfaces.InterfaceSignUp;
import uq.app.jacm.interfaces.InterfaceSoldShow;
import uq.app.jacm.tools.Generic;

public class InterfaceGoTicketNowControlAL implements ActionListener{
	private InterfaceGoTicketNow interfaceGoTicketNow;
	
	public InterfaceGoTicketNowControlAL(InterfaceGoTicketNow interfaceGoTicketNow) {
		this.interfaceGoTicketNow = interfaceGoTicketNow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceGoTicketNow.getBtnLogin()) {
			interfaceLogin();
		}
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceGoTicketNow.getBtnSignUp()) {
			interfaceSignUp();			
		}
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceGoTicketNow.getBtnLogOut()) {
			this.interfaceGoTicketNow.logOut();
		}
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceGoTicketNow.getBtnFirstButton()) {
			if(this.interfaceGoTicketNow.getGoTicketNow().getUserAccountLogin() == null) {
				JOptionPane.showMessageDialog(this.interfaceGoTicketNow, "You must log in first to access the main content.");
			} else {
				interfaceSoldShow(0);
			}
		}
		/*
		 * 
		 */
		if(e.getSource() == this.interfaceGoTicketNow.getBtnSecondButton()) {
			if(this.interfaceGoTicketNow.getGoTicketNow().getUserAccountLogin() == null) {
				JOptionPane.showMessageDialog(this.interfaceGoTicketNow, "You must log in first to access the main content.");
			} else {
				interfaceSoldShow(1);
			}			
		}
		/*
		 * 
		 */
		if(e.getSource() == this.interfaceGoTicketNow.getBtnThirdButton()) {
			if(this.interfaceGoTicketNow.getGoTicketNow().getUserAccountLogin() == null) {
				JOptionPane.showMessageDialog(this.interfaceGoTicketNow, "You must log in first to access the main content.");
			} else {
				interfaceSoldShow(2);
			}
		}
		
	}
	
	/**
	 * 
	 */
	public void interfaceLogin() {
		this.interfaceGoTicketNow.setVisible(false);
		InterfaceLogin interfaceLogin = new InterfaceLogin(this.interfaceGoTicketNow);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		interfaceLogin.setLocation(screen.width/5, screen.height/3);
		interfaceLogin.setSize(800, 300);
		interfaceLogin.setVisible(true);
	}
	
	/**
	 * 
	 */
	public void interfaceSignUp() {
		this.interfaceGoTicketNow.setVisible(false);
		InterfaceSignUp interfaceSignUp = new InterfaceSignUp(this.interfaceGoTicketNow);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		interfaceSignUp.setLocation(screen.width/5, screen.height/3);
		interfaceSignUp.setSize(800, 350);
		interfaceSignUp.setVisible(true);		
	}
	
	/*
	 * 
	 */
	public void interfaceSoldShow(int index) {
        try (Socket socket = new Socket("localhost", Generic.port);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))
           ) {
               System.out.println("Connected to SoldTickets server.");
               out.println("Hello from InterfaceGoTicketNowControlAL!");
               String response = in.readLine();
               System.out.println("Server response: " + response);
           } catch (IOException e) {
               e.printStackTrace();
           }
		/*
		this.interfaceGoTicketNow.setVisible(false);
		InterfaceSoldShow interfaceSoldShow = new InterfaceSoldShow(this.interfaceGoTicketNow, this.interfaceGoTicketNow.getGoTicketNow().getUserAccountLogin(), this.interfaceGoTicketNow.getEvents().get(index));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		interfaceSoldShow.setLocation(screen.width/5, screen.height/3);
		interfaceSoldShow.setSize(800, 350);
		interfaceSoldShow.setVisible(true);
		*/
	}
	

}