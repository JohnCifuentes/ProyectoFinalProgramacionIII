package uq.app.jacm.interfaces;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import uq.app.jacm.controllers.InterfaceSoldShowControlAL;
import uq.app.jacm.controllers.InterfaceSoldShowControlWL;
import uq.app.jacm.modells.Account;
import uq.app.jacm.modells.Event;
import uq.app.jacm.modells.Spot;
import uq.app.jacm.modells.TicketCategory;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;

public class InterfaceSoldShow extends JFrame{
	private InterfaceGoTicketNow interfaceGoTicketNow;
	private Account userAccount;
	private Event event;
	private ArrayList<Spot> spots;
	private ArrayList<JButton> btnSpotsSelect = new ArrayList<>();
	private JButton[] btnNewButtons;
	private GridBagConstraints[] gbcBtnNewButtons;
	
	/**
	 *
	 */
	private InterfaceSoldShowControlAL interfaceSoldShowControlAL = new InterfaceSoldShowControlAL(this);
	private InterfaceSoldShowControlWL interfaceSoldShowControlWL = new InterfaceSoldShowControlWL(this);
	private JButton btnCancel;
	private JButton btnBuy;
	
	
	public InterfaceSoldShow(InterfaceGoTicketNow interfaceGoTicketNow, Account userAccount, Event event){
		this.interfaceGoTicketNow = interfaceGoTicketNow;
		this.userAccount = userAccount;
		this.event = event;
		this.spots = this.event.getSpots();
		/*
		 * 
		 */
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 20, 0};
		gridBagLayout.rowHeights = new int[]{30, 100, 20, 0, 30, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{20, 0, 0, 100, 0, 100, 20, 0};
		gbl_panel_1.rowHeights = new int[]{15, 70, 15, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Buy Tickets!");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
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
		gbc_btnCancel.gridx = 3;
		gbc_btnCancel.gridy = 1;
		panel_1.add(btnCancel, gbc_btnCancel);
		
		btnBuy = new JButton("Buy");
		btnBuy.setBorderPainted(false);
		btnBuy.setBackground(SystemColor.activeCaption);
		btnBuy.setForeground(new Color(255, 255, 255));
		btnBuy.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_btnBuy = new GridBagConstraints();
		gbc_btnBuy.fill = GridBagConstraints.BOTH;
		gbc_btnBuy.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuy.gridx = 5;
		gbc_btnBuy.gridy = 1;
		panel_1.add(btnBuy, gbc_btnBuy);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		this.btnNewButtons = loadJButtons();
		this.gbcBtnNewButtons = loadGbcBtnPuestos();
		for(int i = 0; i < btnNewButtons.length; i++)
			panel.add(btnNewButtons[i], gbcBtnNewButtons[i]);
		
		/**
		 * 
		 */
		this.addWindowListener(interfaceSoldShowControlWL);
		this.btnCancel.addActionListener(interfaceSoldShowControlAL);
		this.btnBuy.addActionListener(interfaceSoldShowControlAL);
		for(int i = 0; i < this.btnNewButtons.length; i++) {
			this.btnNewButtons[i].addActionListener(interfaceSoldShowControlAL);
		}
	}
	
	public InterfaceGoTicketNow getInterfaceGoTicketNow() {
		return interfaceGoTicketNow;
	}

	public void setInterfaceGoTicketNow(InterfaceGoTicketNow interfaceGoTicketNow) {
		this.interfaceGoTicketNow = interfaceGoTicketNow;
	}

	public Account getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(Account userAccount) {
		this.userAccount = userAccount;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public ArrayList<Spot> getSpots() {
		return spots;
	}

	public void setSpots(ArrayList<Spot> spots) {
		this.spots = spots;
	}

	
	public ArrayList<JButton> getBtnSpotsSelect() {
		return btnSpotsSelect;
	}

	public void setBtnSpotsSelect(ArrayList<JButton> btnSpotsSelect) {
		this.btnSpotsSelect = btnSpotsSelect;
	}
	
	public void addBtnSpotSelect(JButton jButonSpotSelect) {
		this.btnSpotsSelect.add(jButonSpotSelect);
	}
	
	public JButton[] getBtnNewButtons() {
		return btnNewButtons;
	}

	public void setBtnNewButtons(JButton[] btnNewButtons) {
		this.btnNewButtons = btnNewButtons;
	}
	
	public GridBagConstraints[] getGbcBtnNewButtons() {
		return gbcBtnNewButtons;
	}
	
	public void setGbcBtnNewButtons(GridBagConstraints[] gbcBtnNewButtons) {
		this.gbcBtnNewButtons = gbcBtnNewButtons;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	public JButton getBtnBuy() {
		return btnBuy;
	}

	public void setBtnBuy(JButton btnBuy) {
		this.btnBuy = btnBuy;
	}

	public JButton[] loadJButtons() {
		JButton[] btnSpots = new JButton[this.spots.size()];
		for(int i = 0; i < this.spots.size(); i++) {
			JButton btnSpot = new JButton(this.spots.get(i).getTicketSpot());
			btnSpot.setForeground(new Color(255, 255, 255));
			btnSpot.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
			if(this.spots.get(i).isAvailable()) {
				btnSpot.setBackground(Color.GREEN);
			} else {
				btnSpot.setBackground(Color.RED);
			}
			btnSpots[i] = btnSpot;
		}
		return btnSpots;
	}
	
	public GridBagConstraints[] loadGbcBtnPuestos() {
		GridBagConstraints[] gbcBtnSpots = new GridBagConstraints[this.spots.size()];
		for(int i = 0; i < this.spots.size(); i++) {
			GridBagConstraints gbcBtnSpot = new GridBagConstraints();
			gbcBtnSpot.fill = GridBagConstraints.BOTH;
			gbcBtnSpot.insets = new Insets(0, 0, 5, 5);
			gbcBtnSpot.gridx = this.spots.get(i).getColumn();
			gbcBtnSpot.gridy = this.spots.get(i).getRow();
			gbcBtnSpots[i] = gbcBtnSpot;
		}
		return gbcBtnSpots;
	}
		
}