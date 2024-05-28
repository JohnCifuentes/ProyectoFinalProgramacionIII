package uq.app.jacm.interfaces;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;

import uq.app.jacm.controllers.InterfaceLoginControlAL;
import uq.app.jacm.controllers.InterfaceLoginControlWL;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class InterfaceLogin extends JFrame{
	private InterfaceGoTicketNow interfaceGoTicketNow;
	private JButton btnCancel;
	private JButton btnLogin;
	private JTextField textLoginEmal;
	private JTextField textLoginPassword;
	/**
	 * 	 
	 */
	private InterfaceLoginControlAL interfaceLoginControlAL = new InterfaceLoginControlAL(this);
	private InterfaceLoginControlWL interfaceLoginControlWL = new InterfaceLoginControlWL(this); 
	/**
	 * 
	 */
	public InterfaceLogin(InterfaceGoTicketNow interfaceGoTicketNow) {
		this.interfaceGoTicketNow = interfaceGoTicketNow;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{15, 190, 15, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{70, 120, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{20, 0, 100, 0, 100, 20, 0};
		gbl_panel_1.rowHeights = new int[]{15, 40, 15, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(SystemColor.activeCaption);
		btnCancel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.BOTH;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 1;
		panel_1.add(btnCancel, gbc_btnCancel);
		
		btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(SystemColor.activeCaption);
		btnLogin.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.BOTH;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 4;
		gbc_btnLogin.gridy = 1;
		panel_1.add(btnLogin, gbc_btnLogin);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{15, 40, 40, 15, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textLoginEmal = new JTextField();
		GridBagConstraints gbc_textLoginEmal = new GridBagConstraints();
		gbc_textLoginEmal.insets = new Insets(0, 0, 5, 5);
		gbc_textLoginEmal.fill = GridBagConstraints.BOTH;
		gbc_textLoginEmal.gridx = 1;
		gbc_textLoginEmal.gridy = 2;
		panel_2.add(textLoginEmal, gbc_textLoginEmal);
		textLoginEmal.setColumns(10);
		
		textLoginPassword = new JTextField();
		GridBagConstraints gbc_textLoginPassword = new GridBagConstraints();
		gbc_textLoginPassword.insets = new Insets(0, 0, 5, 5);
		gbc_textLoginPassword.fill = GridBagConstraints.BOTH;
		gbc_textLoginPassword.gridx = 3;
		gbc_textLoginPassword.gridy = 2;
		panel_2.add(textLoginPassword, gbc_textLoginPassword);
		textLoginPassword.setColumns(10);
		
		/**
		 * 
		 */
		this.addWindowListener(interfaceLoginControlWL);
		this.btnCancel.addActionListener(interfaceLoginControlAL);
		this.btnLogin.addActionListener(interfaceLoginControlAL);
	}
	
	public InterfaceGoTicketNow getInterfaceGoTicketNow() {
		return interfaceGoTicketNow;
	}
	
	public void setInterfaceGoTicketNow(InterfaceGoTicketNow interfaceGoTicketNow) {
		this.interfaceGoTicketNow = interfaceGoTicketNow;
	}
	
	public JButton getBtnCancel() {
		return btnCancel;
	}
	
	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}
	
	public JButton getBtnLogin() {
		return btnLogin;
	}
	
	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	public JTextField getTextLoginEmal() {
		return textLoginEmal;
	}
	
	public void setTextLoginEmal(JTextField textLoginEmal) {
		this.textLoginEmal = textLoginEmal;
	}
	
	public JTextField getTextLoginPassword() {
		return textLoginPassword;
	}
	
	public void setTextLoginPassword(JTextField textLoginPassword) {
		this.textLoginPassword = textLoginPassword;
	}

}