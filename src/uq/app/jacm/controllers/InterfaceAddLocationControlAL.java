package uq.app.jacm.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import uq.app.jacm.interfaces.InterfaceAddLocation;
import uq.app.jacm.modells.Location;
import uq.app.jacm.tools.Generic;

public class InterfaceAddLocationControlAL implements ActionListener{
	private InterfaceAddLocation interfaceAddLocation;
	
	public InterfaceAddLocationControlAL(InterfaceAddLocation interfaceAddLocation){
		this.interfaceAddLocation = interfaceAddLocation;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceAddLocation.getBtnAddLocation()) {
			String namePosition = this.interfaceAddLocation.getTextFieldNamePosition().getText();
			String numberRows = this.interfaceAddLocation.getTextFieldNumberRows().getText();
			String numberColumns = this.interfaceAddLocation.getTextFieldNumberColumns().getText();
			if(namePosition.isEmpty() || numberColumns.isEmpty() || numberRows.isEmpty()) {
				JOptionPane.showMessageDialog(interfaceAddLocation, "Please make sure to fill in all the required fields.");
			} else if(!Generic.isNumber(numberColumns)){
				JOptionPane.showMessageDialog(interfaceAddLocation, "Invalid number of columns. Please check and try again.");
			} else if(!Generic.isNumber(numberRows)) {
				JOptionPane.showMessageDialog(interfaceAddLocation, "Invalid number of rows. Please check and try again.");
			} else {
				Location location = new Location(namePosition, Integer.parseInt(numberRows), Integer.parseInt(numberColumns));
				try {
					if(this.interfaceAddLocation.getInterfaceAdmin().getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().addLocations(location)) {
						Object[] options = {"Ok"};
						JOptionPane.showOptionDialog(interfaceAddLocation, "Location saved successfully", "Successfully", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
						cleanFields();
					} else {
						JOptionPane.showMessageDialog(interfaceAddLocation, "Location already exists. Please try logging in or use a different email to create a new account.");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceAddLocation.getBtnCancel()) {
			this.interfaceAddLocation.dispose();
		}
	}
	
	/**
	 * 
	 */
	public void cleanFields() {
		this.interfaceAddLocation.getTextFieldNamePosition().setText(null);
		this.interfaceAddLocation.getTextFieldNumberColumns().setText(null);
		this.interfaceAddLocation.getTextFieldNumberRows().setText(null);
	}

}
