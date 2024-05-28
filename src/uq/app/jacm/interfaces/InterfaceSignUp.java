package uq.app.jacm.interfaces;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import uq.app.jacm.controllers.InterfaceSignUpControlAL;
import uq.app.jacm.controllers.InterfaceSignUpControlWL;

import javax.swing.JFormattedTextField;

public class InterfaceSignUp extends JFrame{
	private InterfaceGoTicketNow interfaceGoTicketNow;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textIdentifyDocument;
	private JTextField textEmailAdress;
	private JTextField textPhoneNumber;
	private JTextField textBirthDate;
	private JButton btnCancel;
	private JButton btnSingUp;
	/**
	 * 
	 */
	private InterfaceSignUpControlAL interfaceSignUpControlAL = new InterfaceSignUpControlAL(this);
	private InterfaceSignUpControlWL interfaceSignUpControlWL = new InterfaceSignUpControlWL(this);
	/**
	 * 
	 */
	public InterfaceSignUp(InterfaceGoTicketNow interfaceGoTicketNow) {
		this.interfaceGoTicketNow = interfaceGoTicketNow;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{15, 0, 15, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
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
		gbl_panel.rowHeights = new int[]{70, 195, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
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
		gbl_panel_1.columnWidths = new int[]{20, 0, 100, 100, 20, 0};
		gbl_panel_1.rowHeights = new int[]{15, 40, 15, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnCancel.setBackground(SystemColor.activeCaption);
		btnCancel.setBorderPainted(false);
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.BOTH;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 1;
		panel_1.add(btnCancel, gbc_btnCancel);
		
		btnSingUp = new JButton("Sign Up");
		btnSingUp.setForeground(new Color(255, 255, 255));
		btnSingUp.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnSingUp.setBackground(SystemColor.activeCaption);
		btnSingUp.setBorderPainted(false);
		GridBagConstraints gbc_btnSingUp = new GridBagConstraints();
		gbc_btnSingUp.fill = GridBagConstraints.BOTH;
		gbc_btnSingUp.insets = new Insets(0, 0, 5, 5);
		gbc_btnSingUp.gridx = 3;
		gbc_btnSingUp.gridy = 1;
		panel_1.add(btnSingUp, gbc_btnSingUp);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{20, 0, 20, 0, 20, 0, 20, 0};
		gbl_panel_2.rowHeights = new int[]{15, 40, 40, 15, 40, 40, 15, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Identify Document");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 1;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textFirstName = new JTextField();
		GridBagConstraints gbc_textFirstName = new GridBagConstraints();
		gbc_textFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_textFirstName.fill = GridBagConstraints.BOTH;
		gbc_textFirstName.gridx = 1;
		gbc_textFirstName.gridy = 2;
		panel_2.add(textFirstName, gbc_textFirstName);
		textFirstName.setColumns(10);
		
		textLastName = new JTextField();
		GridBagConstraints gbc_textLastName = new GridBagConstraints();
		gbc_textLastName.insets = new Insets(0, 0, 5, 5);
		gbc_textLastName.fill = GridBagConstraints.BOTH;
		gbc_textLastName.gridx = 3;
		gbc_textLastName.gridy = 2;
		panel_2.add(textLastName, gbc_textLastName);
		textLastName.setColumns(10);
		
		textIdentifyDocument = new JTextField();
		GridBagConstraints gbc_textIdentifyDocument = new GridBagConstraints();
		gbc_textIdentifyDocument.insets = new Insets(0, 0, 5, 5);
		gbc_textIdentifyDocument.fill = GridBagConstraints.BOTH;
		gbc_textIdentifyDocument.gridx = 5;
		gbc_textIdentifyDocument.gridy = 2;
		panel_2.add(textIdentifyDocument, gbc_textIdentifyDocument);
		textIdentifyDocument.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email Address");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 4;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Phone Number");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 4;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("BirthDate");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 5;
		gbc_lblNewLabel_6.gridy = 4;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textEmailAdress = new JTextField();
		GridBagConstraints gbc_textEmailAdress = new GridBagConstraints();
		gbc_textEmailAdress.insets = new Insets(0, 0, 5, 5);
		gbc_textEmailAdress.fill = GridBagConstraints.BOTH;
		gbc_textEmailAdress.gridx = 1;
		gbc_textEmailAdress.gridy = 5;
		panel_2.add(textEmailAdress, gbc_textEmailAdress);
		textEmailAdress.setColumns(10);
		
		textPhoneNumber = new JTextField();
		GridBagConstraints gbc_textPhoneNumber = new GridBagConstraints();
		gbc_textPhoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textPhoneNumber.fill = GridBagConstraints.BOTH;
		gbc_textPhoneNumber.gridx = 3;
		gbc_textPhoneNumber.gridy = 5;
		panel_2.add(textPhoneNumber, gbc_textPhoneNumber);
		textPhoneNumber.setColumns(10);
		
		textBirthDate = new JTextField();
		GridBagConstraints gbc_textBirthDate = new GridBagConstraints();
		gbc_textBirthDate.insets = new Insets(0, 0, 5, 5);
		gbc_textBirthDate.fill = GridBagConstraints.BOTH;
		gbc_textBirthDate.gridx = 5;
		gbc_textBirthDate.gridy = 5;
		panel_2.add(textBirthDate, gbc_textBirthDate);
		textBirthDate.setColumns(10);
		
		/**
		 * 
		 */
		this.addWindowListener(interfaceSignUpControlWL);
		this.btnCancel.addActionListener(interfaceSignUpControlAL);
		this.btnSingUp.addActionListener(interfaceSignUpControlAL);
	}

	public InterfaceGoTicketNow getInterfaceGoTicketNow() {
		return interfaceGoTicketNow;
	}

	public void setInterfaceGoTicketNow(InterfaceGoTicketNow interfaceGoTicketNow) {
		this.interfaceGoTicketNow = interfaceGoTicketNow;
	}

	public JTextField getTextFirstName() {
		return textFirstName;
	}

	public void setTextFirstName(JTextField textFirstName) {
		this.textFirstName = textFirstName;
	}

	public JTextField getTextLastName() {
		return textLastName;
	}

	public void setTextLastName(JTextField textLastName) {
		this.textLastName = textLastName;
	}

	public JTextField getTextIdentifyDocument() {
		return textIdentifyDocument;
	}

	public void setTextdentifyDocument(JTextField texIdentifyDocument) {
		this.textIdentifyDocument = texIdentifyDocument;
	}

	public JTextField getTextEmailAdress() {
		return textEmailAdress;
	}

	public void setTextEmailAdress(JTextField textEmailAdress) {
		this.textEmailAdress = textEmailAdress;
	}

	public JTextField getTextPhoneNumber() {
		return textPhoneNumber;
	}

	public void setTextPhoneNumber(JTextField textPhoneNumber) {
		this.textPhoneNumber = textPhoneNumber;
	}
	
	public JTextField getTextBirthDate() {
		return textBirthDate;
	}

	public void setTextBirthDate(JTextField textBirthDate) {
		this.textBirthDate = textBirthDate;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	public JButton getBtnSingUp() {
		return btnSingUp;
	}

	public void setBtnSingUp(JButton btnSingUp) {
		this.btnSingUp = btnSingUp;
	}
	
}