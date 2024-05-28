package uq.app.jacm.controllers;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import uq.app.jacm.interfaces.InterfaceAddLocation;

public class InterfaceAddLocationControlWL implements WindowListener{
	private InterfaceAddLocation interfaceAddLocation;
	
	public InterfaceAddLocationControlWL(InterfaceAddLocation interfaceAddLocation){
		this.interfaceAddLocation = interfaceAddLocation;
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
		this.interfaceAddLocation.getInterfaceAdmin().setVisible(true);
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
