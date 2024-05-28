package uq.app.jacm.modells;

import java.time.LocalDate;

import uq.app.jacm.tools.Generic;

public class UserAccount extends Account{ 
	private String email;
	private String number;
	private LocalDate birthday;
	
	public UserAccount(String name, String lastName, String documentNumber, boolean isAdmin, String email, String number, LocalDate birthday) {
		super(name, lastName, documentNumber, isAdmin);
		this.email = email;
		this.number = number;
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBirthday() {
		return birthday.format(Generic.formatter);
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

}