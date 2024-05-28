package uq.app.jacm.interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import uq.app.jacm.modells.GoTicketNow;
import uq.app.jacm.tools.Generic;

public class Main {
	static GoTicketNow goTicketNow;
	
	public static void main(String[] args) throws IOException {
		
		goTicketNow = new GoTicketNow();
		/**
		 * 
		 */
		InterfaceGoTicketNow interfaceGoTicketNow = new InterfaceGoTicketNow(goTicketNow);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		interfaceGoTicketNow.setLocation(screen.width/6, screen.height/4);
		interfaceGoTicketNow.setSize(1000, 500);
		interfaceGoTicketNow.setVisible(true);

	}
		
}