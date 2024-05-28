package uq.app.jacm.controllers;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import uq.app.jacm.interfaces.InterfaceLogin;

public class InterfaceLoginControlWL implements WindowListener{
	private InterfaceLogin interfaceLogin;
	
	public InterfaceLoginControlWL(InterfaceLogin interfaceLogin) {
		super();
		this.interfaceLogin = interfaceLogin;
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
		this.interfaceLogin.getInterfaceGoTicketNow().setVisible(true);
		
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
