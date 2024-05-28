package uq.app.jacm.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import uq.app.jacm.interfaces.InterfaceAddEvent;
import uq.app.jacm.modells.Event;
import uq.app.jacm.tools.Generic;

public class InterfaceAddEventControlAL implements ActionListener{
	private InterfaceAddEvent interfaceAddEvent;
	
	public InterfaceAddEventControlAL(InterfaceAddEvent interfaceAddEvent){
		this.interfaceAddEvent = interfaceAddEvent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.interfaceAddEvent.getBtnAddEvent()) {
			String eventName = this.interfaceAddEvent.getTextEventName().getText();
			String eventDate = this.interfaceAddEvent.getTextEventDate().getText();
			String eventPrice = this.interfaceAddEvent.getTextEventPrice().getText();
			String eventGuest = this.interfaceAddEvent.getTextEventGuest().getText();
			int location = this.interfaceAddEvent.getComboBoxEventLocation().getSelectedIndex();
			boolean ageRestriction = this.interfaceAddEvent.getCheckAgeRestriction().isSelected();
			
			if(eventName.isEmpty() || eventDate.isEmpty() || eventPrice.isEmpty() || eventGuest.isEmpty() || location == -1) {
				JOptionPane.showMessageDialog(this.interfaceAddEvent, "Please make sure to fill in all the required fields.");
			} else if(!Generic.isDate(eventDate)) {
				JOptionPane.showMessageDialog(this.interfaceAddEvent, "Invalid date. Please check and try again.");
			} else if(!Generic.isNumber(eventPrice)) {
				JOptionPane.showMessageDialog(this.interfaceAddEvent, "Invalid price. Please check and try again.");
			} else {
				Event event = new Event(eventName, 
						LocalDate.parse(eventDate, Generic.formatter), 
						Integer.parseInt(eventPrice), 
						ageRestriction, 
						this.interfaceAddEvent.getInterfaceAdmin().getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().getLocations().get(location));
				event.loadArtists(eventGuest);
				event.loadSpots();
				try {
					if(this.interfaceAddEvent.getInterfaceAdmin().getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().addEvent(event)) {
						Object[] options = {"Ok"};
						JOptionPane.showOptionDialog(this.interfaceAddEvent, "Event saved successfully", "Successfully", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
						this.interfaceAddEvent.getInterfaceAdmin().getInterfaceLogin().getInterfaceGoTicketNow().updateListFirstShows();
						this.interfaceAddEvent.getInterfaceAdmin().getInterfaceLogin().getInterfaceGoTicketNow().updateFirstShow();
						this.interfaceAddEvent.getInterfaceAdmin().getInterfaceLogin().getInterfaceGoTicketNow().updateSecondShow();
						this.interfaceAddEvent.getInterfaceAdmin().getInterfaceLogin().getInterfaceGoTicketNow().updateThirdShow();
						this.interfaceAddEvent.dispose();
					} else {
						JOptionPane.showMessageDialog(this.interfaceAddEvent, "Event already exists. Please try logging in or use a different email to create a new account.");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource() == this.interfaceAddEvent.getBtnCancel()) {
			this.interfaceAddEvent.dispose();
		}		
	}
}