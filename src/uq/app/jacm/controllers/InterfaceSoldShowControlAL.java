package uq.app.jacm.controllers;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import uq.app.jacm.interfaces.InterfaceSoldShow;
import uq.app.jacm.modells.Event;
import uq.app.jacm.modells.Spot;
import uq.app.jacm.modells.Ticket;

public class InterfaceSoldShowControlAL implements ActionListener{
	private InterfaceSoldShow interfaceSoldShow;
	
	public InterfaceSoldShowControlAL(InterfaceSoldShow interfaceSoldShow){
		this.interfaceSoldShow = interfaceSoldShow;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		 * 
		 */
		if(e.getSource() != this.interfaceSoldShow.getBtnCancel() && e.getSource() != this.interfaceSoldShow.getBtnBuy()) {
			JButton btnSpotClick = null;
			for(int i = 0; i < this.interfaceSoldShow.getBtnNewButtons().length; i++) {
				if(e.getSource() == this.interfaceSoldShow.getBtnNewButtons()[i]) {
					btnSpotClick = this.interfaceSoldShow.getBtnNewButtons()[i];
				}
			}

			btnSpotClick.setEnabled(false);
			btnSpotClick.setBackground(Color.RED);
			btnSpotClick.setForeground(new Color(255, 255, 255));
			btnSpotClick.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
			
			this.interfaceSoldShow.addBtnSpotSelect(btnSpotClick);
			for(Spot s: this.interfaceSoldShow.getSpots()) {
				if(s.getTicketSpot().equals(btnSpotClick.getText())) {
					s.setAvailable(false);
				}
			}
		}
		
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceSoldShow.getBtnBuy()) {
			if(this.interfaceSoldShow.getBtnSpotsSelect().size() == 0) {
				JOptionPane.showMessageDialog(this.interfaceSoldShow, "Please select at least one spot to proceed.");
			} else {
				Object[] options = {"PSE", "Credit Card", "Bank Transfer"};
				JOptionPane.showOptionDialog(this.interfaceSoldShow, "Please pick an option", "Pick an Option", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
				Ticket ticket = new Ticket(this.interfaceSoldShow.getUserAccount(), this.interfaceSoldShow.getEvent());
				for(JButton j: this.interfaceSoldShow.getBtnSpotsSelect()) {
					ticket.addSpot(this.interfaceSoldShow.getSpots().stream().filter(spot -> (spot.getTicketSpot().equals(j.getText()))).findFirst().get());
				}
				/**
				 *
				 */
				for(int i = 0; i < this.interfaceSoldShow.getInterfaceGoTicketNow().getGoTicketNow().getEvents().size(); i++) {
					if(this.interfaceSoldShow.getInterfaceGoTicketNow().getGoTicketNow().getEvents().get(i).getName().equals(this.interfaceSoldShow.getEvent().getName()) 
							&& this.interfaceSoldShow.getInterfaceGoTicketNow().getGoTicketNow().getEvents().get(i).getLocation().getName().equals(this.interfaceSoldShow.getEvent().getLocation().getName())
							&& this.interfaceSoldShow.getInterfaceGoTicketNow().getGoTicketNow().getEvents().get(i).getScheduledTime().equals(this.interfaceSoldShow.getEvent().getScheduledTime())) {
						this.interfaceSoldShow.getInterfaceGoTicketNow().getGoTicketNow().getEvents().get(i).setSpots(this.interfaceSoldShow.getSpots());
					}
				}
				try {
					this.interfaceSoldShow.getInterfaceGoTicketNow().getGoTicketNow().addTicket(ticket);
					Object[] optionsConfirm = {"Ok"};
					JOptionPane.showOptionDialog(this.interfaceSoldShow, "Ticket saved successfully", "Successfully", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, optionsConfirm, optionsConfirm[0]);
					this.interfaceSoldShow.dispose();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceSoldShow.getBtnCancel()) {
			this.interfaceSoldShow.dispose();
		}
	}
}