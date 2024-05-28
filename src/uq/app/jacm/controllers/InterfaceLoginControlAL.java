package uq.app.jacm.controllers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

import javax.swing.JOptionPane;

import uq.app.jacm.interfaces.InterfaceAdmin;
import uq.app.jacm.interfaces.InterfaceLogin;
import uq.app.jacm.modells.UserAccount;

public class InterfaceLoginControlAL implements ActionListener{
	private InterfaceLogin interfaceLogin;
	
	public InterfaceLoginControlAL(InterfaceLogin interfaceLogin) {
		this.interfaceLogin = interfaceLogin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * 
		 */
		if(e.getSource() == interfaceLogin.getBtnLogin()) {
			Optional<UserAccount> existUserAccount = this.interfaceLogin.getInterfaceGoTicketNow().getGoTicketNow().getUserAccount(this.interfaceLogin.getTextLoginEmal().getText(), this.interfaceLogin.getTextLoginPassword().getText());
			if(existUserAccount.isPresent()) {
				UserAccount userAccount = existUserAccount.get();
				if(userAccount.isAdmin()) {
					interfaceAdmin();
				} else {
					this.interfaceLogin.getInterfaceGoTicketNow().logIn(userAccount);
					this.interfaceLogin.dispose();
				}
			} else {
				Object[] options = {"Ok"};
				JOptionPane.showOptionDialog(interfaceLogin, "Account does not exist. Please check your credentials or sign up for a new account.", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
			}
		}
		/**
		 * 
		 */
		if(e.getSource() == interfaceLogin.getBtnCancel()) {
			this.interfaceLogin.dispose();			
		}
	}
	
	/**
	 * 
	 */
	public void interfaceAdmin() {
		this.interfaceLogin.setVisible(false);
		InterfaceAdmin interfaceAdmin = new InterfaceAdmin(this.interfaceLogin);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		interfaceAdmin.setLocation(screen.width/5, screen.height/3);
		interfaceAdmin.setSize(800, 300);
		interfaceAdmin.setVisible(true);
	}
}