package uq.app.jacm.tools;

public enum DirectoryType {
	/**
	 * idLocation.txt
	 */
	LOCATION("/locations"),
	/**
	 * idEvent
	 * 	gen.txt
	 *  listArtists.txt
	 *  listSpots.txt 		
	 */
	EVENT("/events"),
	/**
	 * idAccount.txt
	 */
	ACCOUNT("/accounts"),
	ACCOUNT_ARTIST("/artists"),
	ACCOUNT_USER("/users"),
	/**
	 * idTicket
	 * 	general.txt
	 *  listaTickets.txt
	 */
	TICKET("/ticket");
	
	private String path;

	private DirectoryType(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}
	
}