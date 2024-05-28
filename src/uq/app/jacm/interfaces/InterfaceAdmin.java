package uq.app.jacm.interfaces;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import uq.app.jacm.controllers.InterfaceAdminControlAL;
import uq.app.jacm.controllers.InterfaceAdminControlWL;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class InterfaceAdmin extends JFrame{
	private InterfaceLogin interfaceLogin;
	private JButton btnCancel;
	private JButton btnAddLocation;
	private JButton btnAddEvent;
	/**
	 * 
	 */
	private InterfaceAdminControlAL interfaceAdminControlAL = new InterfaceAdminControlAL(this);
	private InterfaceAdminControlWL interfaceAdminControlWL = new InterfaceAdminControlWL(this);
	/**
	 * 
	 */
	public InterfaceAdmin (InterfaceLogin interfaceLogin) {
		this.interfaceLogin = interfaceLogin;
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
		gbl_panel.rowHeights = new int[]{70, 120, 0};
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
		gbl_panel_1.columnWidths = new int[]{20, 0, 100, 20, 0};
		gbl_panel_1.rowHeights = new int[]{15, 40, 15, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Options Admin");
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
		btnCancel.setBackground(SystemColor.activeCaption);
		btnCancel.setBorderPainted(false);
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.BOTH;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 1;
		panel_1.add(btnCancel, gbc_btnCancel);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{20, 0, 20, 0, 20, 0};
		gbl_panel_2.rowHeights = new int[]{15, 40, 15, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		btnAddLocation = new JButton("Add Location");
		btnAddLocation.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_btnAddLocation = new GridBagConstraints();
		gbc_btnAddLocation.fill = GridBagConstraints.BOTH;
		gbc_btnAddLocation.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddLocation.gridx = 1;
		gbc_btnAddLocation.gridy = 1;
		panel_2.add(btnAddLocation, gbc_btnAddLocation);
		
		btnAddEvent = new JButton("Add Event");
		btnAddEvent.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_btnAddEvent = new GridBagConstraints();
		gbc_btnAddEvent.fill = GridBagConstraints.BOTH;
		gbc_btnAddEvent.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddEvent.gridx = 3;
		gbc_btnAddEvent.gridy = 1;
		panel_2.add(btnAddEvent, gbc_btnAddEvent);
		
		/**
		 * 
		 */
		this.addWindowListener(interfaceAdminControlWL);
		this.btnCancel.addActionListener(interfaceAdminControlAL);
		this.btnAddLocation.addActionListener(interfaceAdminControlAL);
		this.btnAddEvent.addActionListener(interfaceAdminControlAL);		
	}
	
	public InterfaceLogin getInterfaceLogin() {
		return interfaceLogin;
	}
	
	public void setInterfaceLogin(InterfaceLogin interfaceLogin) {
		this.interfaceLogin = interfaceLogin;
	}
	
	public JButton getBtnCancel() {
		return btnCancel;
	}
	
	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}
	
	public JButton getBtnAddLocation() {
		return btnAddLocation;
	}
	
	public void setBtnAddLocation(JButton btnAddLocation) {
		this.btnAddLocation = btnAddLocation;
	}
	
	public JButton getBtnAddEvent() {
		return btnAddEvent;
	}
	
	public void setBtnAddEvent(JButton btnAddEvent) {
		this.btnAddEvent = btnAddEvent;
	}
	
}