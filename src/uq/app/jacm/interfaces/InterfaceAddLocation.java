package uq.app.jacm.interfaces;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;

import uq.app.jacm.controllers.InterfaceAddLocationControlAL;
import uq.app.jacm.controllers.InterfaceAddLocationControlWL;
import uq.app.jacm.modells.Location;

import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class InterfaceAddLocation extends JFrame{
	private InterfaceAdmin interfaceAdmin;
	private JButton btnCancel;
	private JTextField textFieldNamePosition;
	private JTextField textFieldNumberRows;
	private JTextField textFieldNumberColumns;
	/*
	 * 
	 */
	private InterfaceAddLocationControlAL interfaceAddLocationControlAL = new InterfaceAddLocationControlAL(this);
	private InterfaceAddLocationControlWL interfaceAddLocationControlWL = new InterfaceAddLocationControlWL(this);
	private JButton btnAddLocation;
	private JTable table;
	/**
	 * 
	 */
	public InterfaceAddLocation(InterfaceAdmin interfaceAdmin){
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
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setForeground(SystemColor.textHighlight);
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
		
		JLabel lblNewLabel = new JLabel("Add Location");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(SystemColor.activeCaption);
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.BOTH;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 1;
		panel_1.add(btnCancel, gbc_btnCancel);
		
		btnAddLocation = new JButton("Add");
		btnAddLocation.setBorderPainted(false);
		btnAddLocation.setBackground(SystemColor.activeCaption);
		btnAddLocation.setForeground(new Color(255, 255, 255));
		btnAddLocation.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_btnAddLocation = new GridBagConstraints();
		gbc_btnAddLocation.fill = GridBagConstraints.BOTH;
		gbc_btnAddLocation.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddLocation.gridx = 3;
		gbc_btnAddLocation.gridy = 1;
		panel_1.add(btnAddLocation, gbc_btnAddLocation);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{20, 0, 20, 0, 20, 0, 20, 0};
		gbl_panel_2.rowHeights = new int[]{15, 40, 40, 15, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Name Location");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Rows");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Columns");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 1;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textFieldNamePosition = new JTextField();
		GridBagConstraints gbc_textFieldNamePosition = new GridBagConstraints();
		gbc_textFieldNamePosition.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNamePosition.fill = GridBagConstraints.BOTH;
		gbc_textFieldNamePosition.gridx = 1;
		gbc_textFieldNamePosition.gridy = 2;
		panel_2.add(textFieldNamePosition, gbc_textFieldNamePosition);
		textFieldNamePosition.setColumns(10);
		
		textFieldNumberRows = new JTextField();
		GridBagConstraints gbc_textFieldNumberRows = new GridBagConstraints();
		gbc_textFieldNumberRows.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNumberRows.fill = GridBagConstraints.BOTH;
		gbc_textFieldNumberRows.gridx = 3;
		gbc_textFieldNumberRows.gridy = 2;
		panel_2.add(textFieldNumberRows, gbc_textFieldNumberRows);
		textFieldNumberRows.setColumns(10);
		
		textFieldNumberColumns = new JTextField();
		GridBagConstraints gbc_textFieldNumberColumns = new GridBagConstraints();
		gbc_textFieldNumberColumns.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNumberColumns.fill = GridBagConstraints.BOTH;
		gbc_textFieldNumberColumns.gridx = 5;
		gbc_textFieldNumberColumns.gridy = 2;
		panel_2.add(textFieldNumberColumns, gbc_textFieldNumberColumns);
		textFieldNumberColumns.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
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
		
		JLabel lblNewLabel_4 = new JLabel("Locations");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 1;
		panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
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
		String[] tableHeaderName = {"No.", "Name Location", "Number of Rows", "Number of Columns"};
		String[][] tableBodyData = new String[this.interfaceAdmin.getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().getLocations().size()][tableHeaderName.length];
		int numberOfRow = 0;
		for(Location l: this.interfaceAdmin.getInterfaceLogin().getInterfaceGoTicketNow().getGoTicketNow().getLocations()) {
			tableBodyData[numberOfRow][0] = String.valueOf(l.getId());
			tableBodyData[numberOfRow][1] = l.getName();
			tableBodyData[numberOfRow][2] = String.valueOf(l.getNumRows());
			tableBodyData[numberOfRow][3] = String.valueOf(l.getNumColumns());
			numberOfRow++;
		}
		table = new JTable(tableBodyData, tableHeaderName);
		table.setRowMargin(2);
		table.setRowHeight(20);
		table.setSelectionBackground(new Color(0, 120, 215));
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		scrollPane.setViewportView(table);
		/**
		 * 
		 */
		this.addWindowListener(interfaceAddLocationControlWL);
		this.btnCancel.addActionListener(interfaceAddLocationControlAL);
		this.btnAddLocation.addActionListener(interfaceAddLocationControlAL);
	}
	
	public InterfaceAdmin getInterfaceAdmin() {
		return interfaceAdmin;
	}
	
	public void setInterfaceAdmin(InterfaceAdmin interfaceAdmin) {
		this.interfaceAdmin = interfaceAdmin;
	}
	
	public JButton getBtnCancel() {
		return btnCancel;
	}
	
	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}
	
	public JTextField getTextFieldNamePosition() {
		return textFieldNamePosition;
	}
	
	public void setTextFieldNamePosition(JTextField textFieldNamePosition) {
		this.textFieldNamePosition = textFieldNamePosition;
	}
	
	public JTextField getTextFieldNumberColumns() {
		return this.textFieldNumberColumns;
	}
	
	public void setTextFieldNumberColumns(JTextField textFieldNumberColumns) {
		this.textFieldNumberRows = textFieldNumberColumns;
	}
	
	public JTextField getTextFieldNumberRows() {
		return this.textFieldNumberRows;
	}
	
	public void setTextFieldNumberRows(JTextField textFieldNumberRows) {
		this.textFieldNumberColumns = textFieldNumberRows;
	}
	
	public JButton getBtnAddLocation() {
		return btnAddLocation;
	}
	
	public void setBtnAddLocation(JButton btnAddLocation) {
		this.btnAddLocation = btnAddLocation;
	}
	
}
