package uq.app.jacm.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import uq.app.jacm.interfaces.InterfaceSignUp;
import uq.app.jacm.modells.UserAccount;
import uq.app.jacm.tools.Generic;

public class InterfaceSignUpControlAL implements ActionListener{
	private InterfaceSignUp interfaceSignUp;
	
	public InterfaceSignUpControlAL(InterfaceSignUp interfaceSignUp){
		this.interfaceSignUp = interfaceSignUp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceSignUp.getBtnSingUp()) {
			String firstName = this.interfaceSignUp.getTextFirstName().getText();
			String lastName = this.interfaceSignUp.getTextLastName().getText();
			String identifyDocument = this.interfaceSignUp.getTextIdentifyDocument().getText();
			String emailAdress = this.interfaceSignUp.getTextEmailAdress().getText();
			String phoneNumber = this.interfaceSignUp.getTextPhoneNumber().getText();
			String birthDate = this.interfaceSignUp.getTextBirthDate().getText();
			
			if(firstName.isEmpty() || lastName.isEmpty() || identifyDocument.isEmpty() || emailAdress.isEmpty() || phoneNumber.isEmpty() || birthDate.isEmpty()){
				JOptionPane.showMessageDialog(interfaceSignUp, "Please make sure to fill in all the required fields.");
			} else if(!Generic.isEmailAdress(emailAdress)){
				JOptionPane.showMessageDialog(interfaceSignUp, "Invalid email address. Please check and try again.");
			} else if(!Generic.isNumber(phoneNumber)) {
				JOptionPane.showMessageDialog(interfaceSignUp, "Invalid phone number. Please check and try again.");
			} else if(!Generic.isDate(birthDate)) {
				JOptionPane.showMessageDialog(interfaceSignUp, "Invalid birthdate. Please check and try again.");
			} else {
				UserAccount userAccount = new UserAccount(firstName, lastName, identifyDocument, false, emailAdress, phoneNumber, LocalDate.parse(birthDate, Generic.formatter));
				try {
					if(this.interfaceSignUp.getInterfaceGoTicketNow().getGoTicketNow().addAccountUser(userAccount)) {
						this.interfaceSignUp.getInterfaceGoTicketNow().logIn(userAccount);
						this.interfaceSignUp.dispose();
					} else {
						JOptionPane.showMessageDialog(interfaceSignUp, "Account already exists. Please try logging in or use a different email to create a new account.");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}				 
			}
		}
		/**
		 * 
		 */
		if(e.getSource() == this.interfaceSignUp.getBtnCancel()) {
			this.interfaceSignUp.dispose();
		}
	}
	
}