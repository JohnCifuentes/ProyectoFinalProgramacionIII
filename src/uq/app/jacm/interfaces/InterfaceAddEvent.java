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

import uq.app.jacm.controllers.InterfaceAddEventControlAL;
import uq.app.jacm.controllers.InterfaceAddEventControlWL;
import uq.app.jacm.modells.Event;
import uq.app.jacm.modells.Location;

import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class InterfaceAddEvent extends JFrame {
	private InterfaceAdmin interfaceAdmin;
	private JTextField textEventName;
	private JTextField textEventDate;
	private JTextField textEventPrice;
	private JTextField textEventGuest;
	private JComboBox comboBoxEventLocation;
	private JCheckBox checkAgeRestriction;
	
	/*
	 *
	 */
	private InterfaceAddEventControlAL interfaceAddEventControlAL = new InterfaceAddEventControlAL(this);
	private InterfaceAddEventControlWL interfaceAddEventControlWL = new InterfaceAddEventControlWL(this);
	private JButton btnCancel;
	private JButton btnAddEvent;
	
	public InterfaceAddEvent(InterfaceAdmin interfaceAdmin){
		this.interfaceAdmin = interfaceAdmin; 
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
		gbl_panel.rowHeights = new int[]{70, 120, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
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
		gbl_panel_1.rowHeights = new int[]{15, 0, 15, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Add Event");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.BOTH;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 1;
		panel_1.add(btnCancel, gbc_btnCancel);
		
		btnAddEvent = new JButton("Add");
		btnAddEvent.setForeground(new Color(255, 255, 255));
		btnAddEvent.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnAddEvent.setBorderPainted(false);
		btnAddEvent.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnAddEvent = new GridBagConstraints();
		gbc_btnAddEvent.fill = GridBagConstraints.BOTH;
		gbc_btnAddEvent.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddEvent.gridx = 3;
		gbc_btnAddEvent.gridy = 1;
		panel_1.add(btnAddEvent, gbc_btnAddEvent);
		
		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{20, 0, 20, 0, 20, 0, 20, 0};
		gbl_panel_2.rowHeights = new int[]{15, 40, 40, 15, 40, 40, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 1;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textEventName = new JTextField();
		GridBagConstraints gbc_textEventName = new GridBagConstraints();
		gbc_textEventName.insets = new Insets(0, 0, 5, 5);
		gbc_textEventName.fill = GridBagConstraints.BOTH;
		gbc_textEventName.gridx = 1;
		gbc_textEventName.gridy = 2;
		panel_2.add(textEventName, gbc_textEventName);
		textEventName.setColumns(10);
		
		textEventDate = new JTextField();
		textEventDate.setText("dd/mm/yyyy hh:24mm");
		textEventDate.setForeground(Color.GRAY);
		GridBagConstraints gbc_textEventDate = new GridBagConstraints();
		gbc_textEventDate.insets = new Insets(0, 0, 5, 5);
		gbc_textEventDate.fill = GridBagConstraints.BOTH;
		gbc_textEventDate.gridx = 3;
		gbc_textEventDate.gridy = 2;
		panel_2.add(textEventDate, gbc_textEventDate);
		textEventDate.setColumns(10);
		
		textEventPrice = new JTextField();
		GridBagConstraints gbc_textEventPrice = new GridBagConstraints();
		gbc_textEventPrice.insets = new Insets(0, 0, 5, 5);
		gbc_textEventPrice.fill = GridBagConstraints.BOTH;
		gbc_textEventPrice.gridx = 5;
		gbc_textEventPrice.gridy = 2;
		panel_2.add(textEventPrice, gbc_textEventPrice);
		textEventPrice.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Guest(s)");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 4;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Location");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 4;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		checkAgeRestriction = new JCheckBox("Age Restriction");
		checkAgeRestriction.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_checkAgeRestriction = new GridBagConstraints();
		gbc_checkAgeRestriction.fill = GridBagConstraints.VERTICAL;
		gbc_checkAgeRestriction.anchor = GridBagConstraints.WEST;
		gbc_checkAgeRestriction.gridheight = 2;
		gbc_checkAgeRestriction.insets = new Insets(0, 0, 5, 5);
		gbc_checkAgeRestriction.gridx = 5;
		gbc_checkAgeRestriction.gridy = 4;
		panel_2.add(checkAgeRestriction, gbc_checkAgeRestriction);
		
		textEventGuest = new JTextField();
		GridBagConstraints gbc_textEventGuest = new GridBagConstraints();
		gbc_textEventGuest.insets = new Insets(0, 0, 5, 5);
		gbc_textEventGuest.fill = GridBagConstraints.BOTH;
		gbc_textEventGuest.gridx = 1;
		gbc_textEventGuest.gridy = 5;
		panel_2.add(textEventGuest, gbc_textEventGuest);
		textEventGuest.setColumns(10);
		
		
		String[] options = new String[this.interfaceAdmin.getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().getLocations().size()];
		int i = 0;
		for(Location loc: this.interfaceAdmin.getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().getLocations()) {
			options[i] = loc.getName();
			i++;
		}
		comboBoxEventLocation = new JComboBox(options);
		GridBagConstraints gbc_comboBoxEventLocation = new GridBagConstraints();
		gbc_comboBoxEventLocation.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxEventLocation.fill = GridBagConstraints.BOTH;
		gbc_comboBoxEventLocation.gridx = 3;
		gbc_comboBoxEventLocation.gridy = 5;
		panel_2.add(comboBoxEventLocation, gbc_comboBoxEventLocation);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 2;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{20, 0, 20, 0};
		gbl_panel_3.rowHeights = new int[]{15, 0, 0, 15, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Events");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 1;
		panel_3.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		panel_3.add(scrollPane, gbc_scrollPane);

		/**
		 * 
		 */
		String[] tableHeaderName = {"No.", "Name Event", "Scheduled Time", "Price", "Location", "Age Restriction"};
		String[][] tableBodyData = new String[this.interfaceAdmin.getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().getEvents().size()][tableHeaderName.length];
		int numberOfRow = 0;
		for(Event e: this.interfaceAdmin.getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().getEvents()) {
			tableBodyData[numberOfRow][0] = String.valueOf(e.getId());
			tableBodyData[numberOfRow][1] = e.getName();
			tableBodyData[numberOfRow][2] = e.getScheduledTime();
			tableBodyData[numberOfRow][3] = String.valueOf(e.getPriceTicket());
			tableBodyData[numberOfRow][4] = e.getLocation().getName();
			tableBodyData[numberOfRow][5] = e.isAgeRestriction()?"Yes":"No";
			numberOfRow++;
		}
		JTable table = new JTable(tableBodyData, tableHeaderName);
		scrollPane.setViewportView(table);
		
		this.addWindowListener(interfaceAddEventControlWL);
		this.btnCancel.addActionListener(interfaceAddEventControlAL);
		this.btnAddEvent.addActionListener(interfaceAddEventControlAL);
	}
	
	public InterfaceAdmin getInterfaceAdmin() {
		return interfaceAdmin;
	}

	public JTextField getTextEventName() {
		return textEventName;
	}

	public void setTextEventName(JTextField textEventName) {
		this.textEventName = textEventName;
	}

	public JTextField getTextEventDate() {
		return textEventDate;
	}

	public void setTextEventDate(JTextField textEventDate) {
		this.textEventDate = textEventDate;
	}

	public JTextField getTextEventPrice() {
		return textEventPrice;
	}

	public void setTextEventPrice(JTextField textEventPrice) {
		this.textEventPrice = textEventPrice;
	}

	public JTextField getTextEventGuest() {
		return textEventGuest;
	}

	public void setTextEventGuest(JTextField textEventGuest) {
		this.textEventGuest = textEventGuest;
	}

	public JComboBox getComboBoxEventLocation() {
		return comboBoxEventLocation;
	}

	public void setComboBoxEventLocation(JComboBox comboBoxEventLocation) {
		this.comboBoxEventLocation = comboBoxEventLocation;
	}

	public JCheckBox getCheckAgeRestriction() {
		return checkAgeRestriction;
	}

	public void setCheckAgeRestriction(JCheckBox checkAgeRestriction) {
		this.checkAgeRestriction = checkAgeRestriction;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	public JButton getBtnAddEvent() {
		return btnAddEvent;
	}

	public void setBtnAddEvent(JButton btnAddEvent) {
		this.btnAddEvent = btnAddEvent;
	}

}