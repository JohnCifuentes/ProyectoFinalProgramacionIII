package uq.app.jacm.controllers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uq.app.jacm.interfaces.InterfaceAddEvent;
import uq.app.jacm.interfaces.InterfaceAddLocation;
import uq.app.jacm.interfaces.InterfaceAdmin;

public class InterfaceAdminControlAL implements ActionListener{
	private InterfaceAdmin interfaceAdmin;
	
	public InterfaceAdminControlAL(InterfaceAdmin interfaceAdmin){
		this.interfaceAdmin = interfaceAdmin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceAdmin.getBtnAddLocation()) {
			interfaceAddLocation();
		}
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceAdmin.getBtnAddEvent()) {
			interfaceAddEvent();
		}
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceAdmin.getBtnCancel()) {
			this.interfaceAdmin.dispose();
		}
		
	}
	
	/**
	 * 
	 */
	public void interfaceAddLocation() {
		this.interfaceAdmin.setVisible(false);
		InterfaceAddLocation interfaceAddLocation = new InterfaceAddLocation(this.interfaceAdmin);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		interfaceAddLocation.setLocation(screen.width/5, screen.height/3);
		interfaceAddLocation.setSize(800, 400);
		interfaceAddLocation.setVisible(true);
	}

	/**
	 * 
	 */
	public void interfaceAddEvent() {
		this.interfaceAdmin.setVisible(false);
		InterfaceAddEvent interfaceAddEvent = new InterfaceAddEvent(this.interfaceAdmin);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		interfaceAddEvent.setLocation(screen.width/5, screen.height/5);
		interfaceAddEvent.setSize(800, 550);
		interfaceAddEvent.setVisible(true);
	}

}