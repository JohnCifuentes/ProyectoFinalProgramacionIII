package uq.app.jacm.controllers;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import uq.app.jacm.interfaces.InterfaceAddEvent;

public class InterfaceAddEventControlWL implements WindowListener{
	private InterfaceAddEvent interfaceAddEvent;
	
	public InterfaceAddEventControlWL(InterfaceAddEvent interfaceAddEvent){
		this.interfaceAddEvent = interfaceAddEvent;
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
		this.interfaceAddEvent.getInterfaceAdmin().setVisible(true);
		
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
