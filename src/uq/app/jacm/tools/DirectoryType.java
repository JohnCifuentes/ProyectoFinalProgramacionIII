package uq.app.jacm.tools;

public enum DirectoryType {
	ACCOUNT_USER("src/GoTicketNow/accounts/userAccount.txt"),
	ACCOUNT_ARTIST("src/GoTicketNow/accounts/artistAccount.txt"),
	LOCATION("src/GoTicketNow/locations/location.txt"),
	EVENT("src/GoTicketNow/events/"),
	TICKET("src/GoTicketNow/tickets/");
	
	private String path;

	private DirectoryType(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}
	
}