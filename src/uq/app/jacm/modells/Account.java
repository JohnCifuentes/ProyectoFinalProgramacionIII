package uq.app.jacm.modells;

public class Account {
	public static int nextID = 0;
	private int id;
	private String name;
	private String lastName;
	private String documentNumber;
	private boolean isAdmin;
	
	public Account() {
	}
	
	public Account(String name, String lastName, String documentNumber, boolean isAdmin) {
		this.id = ++Account.nextID;
		this.name = name;
		this.lastName = lastName;
		this.documentNumber = documentNumber;
		this.isAdmin = isAdmin;
	}
	
	public static void updateNextID(int nextID) {
		Account.nextID = nextID; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}