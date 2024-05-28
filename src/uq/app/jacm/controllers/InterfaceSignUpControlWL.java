package uq.app.jacm.controllers;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import uq.app.jacm.interfaces.InterfaceSignUp;

public class InterfaceSignUpControlWL implements WindowListener{
	private InterfaceSignUp interfaceSignUp;
	
	public InterfaceSignUpControlWL(InterfaceSignUp interfaceSignUp){
		this.interfaceSignUp = interfaceSignUp;
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
		this.interfaceSignUp.getInterfaceGoTicketNow().setVisible(true);
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
