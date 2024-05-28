package uq.app.jacm.interfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import uq.app.jacm.controllers.InterfaceGoTicketNowControlAL;
import uq.app.jacm.modells.Event;
import uq.app.jacm.modells.GoTicketNow;
import uq.app.jacm.modells.UserAccount;
import uq.app.jacm.tools.Generic;

import java.awt.SystemColor;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;

public class InterfaceGoTicketNow extends JFrame{
	private GoTicketNow goTicketNow;
	private ArrayList<Event> events = new ArrayList<>();
	private JButton btnLogin;
	private JButton btnSignUp;
	private JButton btnLogOut;
	private JLabel lblTitleMain;
	private JLabel lblFirstShowName;
	private JLabel lblFirstShowLocation;
	private JLabel lblFirstShowScheduled;
	private JButton btnFirstButton;
	private JLabel lblSecondShowName;
	private JLabel lblSecondShowLocation;
	private JLabel lblSecondShowScheduled;
	private JButton btnSecondButton;
	private JLabel lblThirdShowName;
	private JLabel lblThirdShowLocation;
	private JLabel lblThirdShowScheduled;
	/**
	 * 
	 */
	private InterfaceGoTicketNowControlAL interfaceGoTicketNowControlAL = new InterfaceGoTicketNowControlAL(this);
	private JButton btnThirdButton;
	/**
	 * 
	 */
	public InterfaceGoTicketNow(GoTicketNow goTicketNow) {
		this.goTicketNow = goTicketNow;
		updateListFirstShows();
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{30, 0, 30, 0};
		gbl_panel.rowHeights = new int[]{15, 70, 15, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.textHighlight);
		panel_3.setForeground(Color.WHITE);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 1;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{20, 0, 100, 0, 100, 0, 100, 20, 0};
		gbl_panel_3.rowHeights = new int[]{15, 40, 15, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		lblTitleMain = new JLabel("GoTicketNow");
		lblTitleMain.setForeground(new Color(255, 255, 255));
		lblTitleMain.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GridBagConstraints gbc_lblTitleMain = new GridBagConstraints();
		gbc_lblTitleMain.anchor = GridBagConstraints.WEST;
		gbc_lblTitleMain.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitleMain.gridx = 1;
		gbc_lblTitleMain.gridy = 1;
		panel_3.add(lblTitleMain, gbc_lblTitleMain);
		
		btnLogin = new JButton("Login");
		btnLogin.setBorderPainted(false);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnLogin.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.BOTH;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 4;
		gbc_btnLogin.gridy = 1;
		panel_3.add(btnLogin, gbc_btnLogin);
		
		btnSignUp = new JButton("Sign Up");
		if(!this.goTicketNow.existsUserAccountLogin()) {
			btnSignUp.setVisible(true);
		} else {
			btnSignUp.setVisible(false);
		}
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnSignUp.setBorderPainted(false);
		btnSignUp.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnSignUp = new GridBagConstraints();
		gbc_btnSignUp.insets = new Insets(0, 0, 5, 5);
		gbc_btnSignUp.fill = GridBagConstraints.BOTH;
		gbc_btnSignUp.gridx = 6;
		gbc_btnSignUp.gridy = 1;
		panel_3.add(btnSignUp, gbc_btnSignUp);
		
		btnLogOut = new JButton("Log Out");
		if(!this.goTicketNow.existsUserAccountLogin()) {
			btnLogOut.setVisible(false);
		} else {
			btnLogOut.setVisible(true);
		}
		btnLogOut.setForeground(new Color(255, 255, 255));
		btnLogOut.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnLogOut.setBackground(SystemColor.activeCaption);
		btnLogOut.setBorderPainted(false);
		GridBagConstraints gbc_btnLogOut = new GridBagConstraints();
		gbc_btnLogOut.fill = GridBagConstraints.BOTH;
		gbc_btnLogOut.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogOut.gridx = 6;
		gbc_btnLogOut.gridy = 1;
		panel_3.add(btnLogOut, gbc_btnLogOut);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{40, 0, 40, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 15, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 1;
		panel_1.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(128, 0, 128));
		panel_5.setBackground(SystemColor.textHighlight);
		panel_5.setBorder(UIManager.getBorder("ToolTip.border"));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 0, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 0;
		panel_2.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0};
		gbl_panel_5.rowHeights = new int[]{15, 0, 0, 0, 40, 15, 0};
		gbl_panel_5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		lblFirstShowName = new JLabel();
		lblFirstShowName.setBackground(new Color(255, 255, 255));
		lblFirstShowName.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblFirstShowName.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblFirstShowName = new GridBagConstraints();
		gbc_lblFirstShowName.insets = new Insets(0, 0, 5, 0);
		gbc_lblFirstShowName.gridx = 0;
		gbc_lblFirstShowName.gridy = 1;
		panel_5.add(lblFirstShowName, gbc_lblFirstShowName);
		
		lblFirstShowLocation = new JLabel();
		lblFirstShowLocation.setBackground(new Color(255, 255, 255));
		lblFirstShowLocation.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblFirstShowLocation.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblFirstShowLocation = new GridBagConstraints();
		gbc_lblFirstShowLocation.insets = new Insets(0, 0, 5, 0);
		gbc_lblFirstShowLocation.gridx = 0;
		gbc_lblFirstShowLocation.gridy = 2;
		panel_5.add(lblFirstShowLocation, gbc_lblFirstShowLocation);
		
		lblFirstShowScheduled = new JLabel();
		lblFirstShowScheduled.setBackground(new Color(255, 255, 255));
		lblFirstShowScheduled.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblFirstShowScheduled.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblFirstShowScheduled = new GridBagConstraints();
		gbc_lblFirstShowScheduled.insets = new Insets(0, 0, 5, 0);
		gbc_lblFirstShowScheduled.gridx = 0;
		gbc_lblFirstShowScheduled.gridy = 3;
		panel_5.add(lblFirstShowScheduled, gbc_lblFirstShowScheduled);
		
		btnFirstButton = new JButton("Buy!");
		btnFirstButton.setForeground(new Color(255, 255, 255));
		btnFirstButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnFirstButton.setBorderPainted(false);
		btnFirstButton.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnFirstButton = new GridBagConstraints();
		gbc_btnFirstButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnFirstButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnFirstButton.gridx = 0;
		gbc_btnFirstButton.gridy = 4;
		panel_5.add(btnFirstButton, gbc_btnFirstButton);
		
		if(this.events.size() > 0) {
			panel_5.setVisible(true);
			updateFirstShow();
		} else {
			panel_5.setVisible(false);
		}
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(255, 0, 255));
		panel_6.setBackground(SystemColor.textHighlight);
		panel_6.setBorder(UIManager.getBorder("ToolTip.border"));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 1;
		gbc_panel_6.gridy = 0;
		panel_2.add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0};
		gbl_panel_6.rowHeights = new int[]{15, 0, 0, 0, 40, 15, 0};
		gbl_panel_6.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		lblSecondShowName = new JLabel();
		lblSecondShowName.setBackground(new Color(255, 255, 255));
		lblSecondShowName.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblSecondShowName.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblSecondShowName = new GridBagConstraints();
		gbc_lblSecondShowName.insets = new Insets(0, 0, 5, 0);
		gbc_lblSecondShowName.gridx = 0;
		gbc_lblSecondShowName.gridy = 1;
		panel_6.add(lblSecondShowName, gbc_lblSecondShowName);
		
		lblSecondShowLocation = new JLabel();
		lblSecondShowLocation.setBackground(new Color(255, 255, 255));
		lblSecondShowLocation.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblSecondShowLocation.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblSecondShowLocation = new GridBagConstraints();
		gbc_lblSecondShowLocation.insets = new Insets(0, 0, 5, 0);
		gbc_lblSecondShowLocation.gridx = 0;
		gbc_lblSecondShowLocation.gridy = 2;
		panel_6.add(lblSecondShowLocation, gbc_lblSecondShowLocation);
		
		lblSecondShowScheduled = new JLabel();
		lblSecondShowScheduled.setBackground(new Color(255, 255, 255));
		lblSecondShowScheduled.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblSecondShowScheduled.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblSecondShowScheduled = new GridBagConstraints();
		gbc_lblSecondShowScheduled.insets = new Insets(0, 0, 5, 0);
		gbc_lblSecondShowScheduled.gridx = 0;
		gbc_lblSecondShowScheduled.gridy = 3;
		panel_6.add(lblSecondShowScheduled, gbc_lblSecondShowScheduled);
		
		btnSecondButton = new JButton("Buy!");
		btnSecondButton.setForeground(new Color(255, 255, 255));
		btnSecondButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnSecondButton.setBorderPainted(false);
		btnSecondButton.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnSecondButton = new GridBagConstraints();
		gbc_btnSecondButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnSecondButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnSecondButton.gridx = 0;
		gbc_btnSecondButton.gridy = 4;
		panel_6.add(btnSecondButton, gbc_btnSecondButton);
		
		if(this.events.size() > 1) {
			panel_6.setVisible(true);
			updateSecondShow();
		} else {
			panel_6.setVisible(false);
		}
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.textHighlight);
		panel_4.setBorder(UIManager.getBorder("ToolTip.border"));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 2;
		gbc_panel_4.gridy = 0;
		panel_2.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0};
		gbl_panel_4.rowHeights = new int[]{15, 0, 0, 0, 40, 15, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		lblThirdShowName = new JLabel();
		lblThirdShowName.setBackground(new Color(255, 255, 255));
		lblThirdShowName.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblThirdShowName.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblThirdShowName = new GridBagConstraints();
		gbc_lblThirdShowName.insets = new Insets(0, 0, 5, 0);
		gbc_lblThirdShowName.gridx = 0;
		gbc_lblThirdShowName.gridy = 1;
		panel_4.add(lblThirdShowName, gbc_lblThirdShowName);
		
		lblThirdShowLocation = new JLabel();
		lblThirdShowLocation.setBackground(new Color(255, 255, 255));
		lblThirdShowLocation.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblThirdShowLocation.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblThirdShowLocation = new GridBagConstraints();
		gbc_lblThirdShowLocation.insets = new Insets(0, 0, 5, 0);
		gbc_lblThirdShowLocation.gridx = 0;
		gbc_lblThirdShowLocation.gridy = 2;
		panel_4.add(lblThirdShowLocation, gbc_lblThirdShowLocation);
		
		lblThirdShowScheduled = new JLabel();
		lblThirdShowScheduled.setBackground(new Color(255, 255, 255));
		lblThirdShowScheduled.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblThirdShowScheduled.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblThirdShowScheduled = new GridBagConstraints();
		gbc_lblThirdShowScheduled.insets = new Insets(0, 0, 5, 0);
		gbc_lblThirdShowScheduled.gridx = 0;
		gbc_lblThirdShowScheduled.gridy = 3;
		panel_4.add(lblThirdShowScheduled, gbc_lblThirdShowScheduled);
		
		btnThirdButton = new JButton("Buy!");
		btnThirdButton.setForeground(new Color(255, 255, 255));
		btnThirdButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnThirdButton.setBorderPainted(false);
		btnThirdButton.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnThirdButton = new GridBagConstraints();
		gbc_btnThirdButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnThirdButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnThirdButton.gridx = 0;
		gbc_btnThirdButton.gridy = 4;
		panel_4.add(btnThirdButton, gbc_btnThirdButton);

		if(this.events.size() > 2) {
			panel_4.setVisible(true);
			updateThirdShow();
		} else {
			panel_4.setVisible(false);
		}
		
		
		/**
		 * 
		 */
		this.btnLogin.addActionListener(interfaceGoTicketNowControlAL);
		this.btnSignUp.addActionListener(interfaceGoTicketNowControlAL);
		this.btnLogOut.addActionListener(interfaceGoTicketNowControlAL);
		this.btnFirstButton.addActionListener(interfaceGoTicketNowControlAL);
		this.btnSecondButton.addActionListener(interfaceGoTicketNowControlAL);
		this.btnThirdButton.addActionListener(interfaceGoTicketNowControlAL);
	}

	public GoTicketNow getGoTicketNow() {
		return goTicketNow;
	}

	public void setGoTicketNow(GoTicketNow goTicketNow) {
		this.goTicketNow = goTicketNow;
	}
	
	public JLabel getLblTitleMain() {
		return lblTitleMain;
	}

	public void setLblTitleMain(JLabel lblTitleMain) {
		this.lblTitleMain = lblTitleMain;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JButton getBtnSignUp() {
		return btnSignUp;
	}

	public void setBtnSignUp(JButton btnSignUp) {
		this.btnSignUp = btnSignUp;
	}

	public JButton getBtnLogOut() {
		return btnLogOut;
	}

	public void setBtnLogOut(JButton btnLogOut) {
		this.btnLogOut = btnLogOut;
	}
	
	public JButton getBtnFirstButton() {
		return btnFirstButton;
	}

	public void setBtnFirstButton(JButton btnFirstButton) {
		this.btnFirstButton = btnFirstButton;
	}

	public JButton getBtnSecondButton() {
		return btnSecondButton;
	}

	public void setBtnSecondButton(JButton btnSecondButton) {
		this.btnSecondButton = btnSecondButton;
	}

	public JButton getBtnThirdButton() {
		return btnThirdButton;
	}

	public void setBtnThirdButton(JButton btnThirdButton) {
		this.btnThirdButton = btnThirdButton;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	public void logIn(UserAccount userAccount) {
		this.getGoTicketNow().setUserAccountLogin(userAccount);
		this.getBtnSignUp().setVisible(false);
		this.getBtnLogOut().setVisible(true);
		this.getLblTitleMain().setText("GoTicketNow " + userAccount.getName() + " " + userAccount.getLastName());
		JOptionPane.showMessageDialog(this, "Successfully.");
	}
	
	public void logOut() {
		this.getGoTicketNow().setUserAccountLogin(null);
		this.getBtnSignUp().setVisible(true);
		this.getBtnLogOut().setVisible(false);
		this.getLblTitleMain().setText("GoTicketNow");		
	}
	
	public void updateListFirstShows() {
		ArrayList<Event> eventsAux = this.goTicketNow.getEvents();
		Collections.sort(eventsAux);
		for(Event e: eventsAux) {
			if(!(e.getScheduledTimeDate().compareTo(LocalDate.now()) < 0)) {
				Period period = Period.between(LocalDate.now(), e.getScheduledTimeDate());
				int daysBetween = period.getDays() + period.getMonths() * 30 + period.getYears() * 365;
				if(daysBetween <= Generic.daysToOpenSold) {
					this.events.add(e);
				}
			}
		}
	}
	
	public void updateFirstShow() {
		this.lblFirstShowName.setText(this.events.get(0).getName());
		this.lblFirstShowLocation.setText(this.events.get(0).getLocation().getName());
		this.lblFirstShowScheduled.setText(this.events.get(0).getScheduledTime());		
	}
	
	public void updateSecondShow() {
		this.lblSecondShowName.setText(this.events.get(1).getName());
		this.lblSecondShowLocation.setText(this.events.get(1).getLocation().getName());
		this.lblSecondShowScheduled.setText(this.events.get(1).getScheduledTime());
	}

	public void updateThirdShow() {
		this.lblThirdShowName.setText(this.events.get(2).getName());
		this.lblThirdShowLocation.setText(this.events.get(2).getLocation().getName());
		this.lblThirdShowScheduled.setText(this.events.get(2).getScheduledTime());
	}
}