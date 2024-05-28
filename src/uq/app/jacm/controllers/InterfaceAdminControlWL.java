package uq.app.jacm.controllers;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import uq.app.jacm.interfaces.InterfaceAdmin;

public class InterfaceAdminControlWL implements WindowListener{
	private InterfaceAdmin interfaceAdmin;
	
	public InterfaceAdminControlWL(InterfaceAdmin interfaceAdmin){
		this.interfaceAdmin = interfaceAdmin;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		this.interfaceAdmin.getInterfaceLogin().getInterfaceGoTicketNow().setVisible(true);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
