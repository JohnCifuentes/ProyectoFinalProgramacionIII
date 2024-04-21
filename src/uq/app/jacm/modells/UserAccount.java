package uq.app.jacm.modells;

import java.time.LocalDate;

public class UserAccount extends Account implements StringFormatter{
	private String email;
	private int number;
	private LocalDate birthday;
	
	public UserAccount(String name, String documentNumber, String email, int number, LocalDate birthday) {
		super(name, documentNumber);
		this.email = email;
		this.number = number;
		this.birthday = birthday;
	}

	@Override
	public String formString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeToFile(String data) {
		// TODO Auto-generated method stub
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

}