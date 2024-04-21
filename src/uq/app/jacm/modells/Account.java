package uq.app.jacm.modells;

public class Account {
	private static int nextID = 1;
	private int id;
	private String name;
	private String documentNumber;
	
	public Account(String name, String documentNumber) {
		super();
		this.id = Account.nextID++;
		this.name = name;
		this.documentNumber = documentNumber;
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

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

}