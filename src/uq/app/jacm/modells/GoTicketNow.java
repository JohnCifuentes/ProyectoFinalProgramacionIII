package uq.app.jacm.modells;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import uq.app.jacm.tools.DirectoryType;
import uq.app.jacm.tools.FileManager;

public class GoTicketNow {
	private ArrayList<Account> accounts = new ArrayList<>();
	private FileManager fileManagerUserAccounts = new FileManager(DirectoryType.ACCOUNT_USER.getPath());
	private ArrayList<Location> locations = new ArrayList<>();
	private FileManager fileManageLocations = new FileManager(DirectoryType.LOCATION.getPath());
	private ArrayList<Event> events = new ArrayList<>();
	private FileManager fileManageEvents = new FileManager(DirectoryType.EVENT.getPath());
	private ArrayList<Ticket> tickets = new ArrayList();
	private FileManager fileManageTicket = new FileManager(DirectoryType.TICKET.getPath());
	private Account userAccountLogin = null;
	
	public GoTicketNow() throws IOException {
		this.loadUserAccount();
		this.loadLocations();
		this.loadEvent();
		this.loadTicket();
	}
	
	/**
	 * 
	 */
	public void loadUserAccount() throws IOException {
		try {
			for(String a: this.fileManagerUserAccounts.readToFile()) {
				if(!a.trim().isEmpty()) {
					this.accounts.add(new UserAccountFile().getObjectFromString(a));
				}
			}
			if(this.accounts.size() != 0)
				Account.updateNextID(this.accounts.get(this.accounts.size() - 1).getId());
		} catch(IOException|IndexOutOfBoundsException e) {
			System.out.println("loadUserAccount " + e.getMessage());
		}
	}
	
	/**
	 * 
	 */
	public boolean addAccountUser(UserAccount userAccount) throws IOException {
		if(this.accounts.stream().noneMatch(account -> account.getDocumentNumber().equals(userAccount.getDocumentNumber()))) {
			this.accounts.add(userAccount);
			this.fileManagerUserAccounts.writeToFile(new UserAccountFile().getStringFromObject(userAccount));
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 */
	public Optional<UserAccount> getUserAccount(String email, String password) {
		return this.accounts.stream()
			.filter(account -> account instanceof UserAccount)
			.map(account -> (UserAccount) account)
			.filter(userAccount -> userAccount.getEmail().equals(email) && userAccount.getDocumentNumber().equals(password))
			.findFirst();		
	}
	
	/**
	 * 
	 */
	public void loadLocations() throws IOException {
		try {
			for(String a: this.fileManageLocations.readToFile()) {
				if(!a.isEmpty()) {
					this.locations.add(new LocationFile().getObjectFromString(a));					
				}
			}
			if(this.locations.size() != 0)
				Location.updateNextID(this.locations.get(this.locations.size() - 1).getId());
		} catch(IOException|IndexOutOfBoundsException e) {
			System.out.println("loadLocations " + e.getMessage());
		} 
	}
	
	/**
	 * 
	 */
	public boolean addLocations(Location location) throws IOException{
		if(this.locations.stream().noneMatch(loc -> loc.getName().toLowerCase().replaceAll(" ", "").equals(location.getName().toLowerCase().replaceAll(" ", "")))) {
			this.locations.add(location);
			this.fileManageLocations.writeToFile(new LocationFile().getStringFromObject(location));
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 */
	public ArrayList<Location> getLocations(){
		return this.locations;
	}
	
	/** 
	 * 
	 */
	public void loadEvent() throws IOException {
		ArrayList<String> listFilesFromDirectory = this.fileManageEvents.listFilesFromDirectory();
		for(String s: listFilesFromDirectory) {
			this.events.add(loadEventDetails(s));
		}
		if(this.events.size() != 0) 
			Event.updateNextID(this.events.get(this.events.size() - 1).getId());
	}
	
	/**
	 * 
	 */
	public Event loadEventDetails(String pathDetails) throws IOException {
		FileManager fileManager = new FileManager(pathDetails);
		Event event = null;
		for(String a: fileManager.readToFile()) {
			if(!a.isEmpty()) {
				if(a.startsWith("1")) {
					event = new EventFile().getObjectFromString(a);
					int idLocation = Integer.parseInt(a.substring(a.length() - 1));
					event.setLocation(this.locations.stream().filter(location -> location.getId() == idLocation).findFirst().get());
				} else if(a.startsWith("2")) {
					event.addSpot(event.loadTicketCategorySpot(new SpotFile().getObjectFromString(a)));
				} else if(a.startsWith("3")) {
					event.loadArtists(a.substring(2));
				}
			}
		}
		return event;
	}
	
	/** 
	 * 
	 */
	public boolean addEvent(Event event) throws IOException {
		if(this.events.stream().noneMatch(ev -> (ev.getScheduledTime().equals(event.getScheduledTime()) && ev.getLocation().getName().equals(event.getLocation().getName())))){
			this.events.add(event);
			FileManager fileManager = new FileManager(DirectoryType.EVENT.getPath() + event.getId() + "Location.txt");
			fileManager.writeToFile(new EventFile().getStringFromObject(event));
			return true;
		} else {
			return false;
		}
	}
	
	/** 
	 * 
	 */
	public void loadTicket() throws IOException {
		ArrayList<String> listFilesFromDirectory = this.fileManageTicket.listFilesFromDirectory();
		for(String s: listFilesFromDirectory) {
			this.tickets.add(loadTicketDetails(s));
		}
		/*
		if(this.tickets.size() != 0) 
			Ticket.updateNextID(this.tickets.get(this.tickets.size() - 1).getId());*/
	}
	
	/**
	 * 
	 */
	public Ticket loadTicketDetails(String pathDetails) throws IOException {
		FileManager fileManager = new FileManager(pathDetails);
		Ticket ticket = null;
		Account account = null;
		Event event = null;
		for(String a: fileManager.readToFile()) {
			if(!a.isEmpty()) {
				if(a.startsWith("1")) {
					String[] text = a.split("¬");
					int idUsuario = Integer.parseInt(text[1]);
					int idEvent = Integer.parseInt(text[2]);
					account = this.accounts.stream().filter(ac -> ac.getId() == idUsuario).findFirst().get();
					event = this.events.stream().filter(ev -> ev.getId() == idEvent).findFirst().get();
					ticket = new Ticket(account, event);
				} else if(a.startsWith("2")) {
					ticket.addSpot(event.loadTicketCategorySpot(new SpotFile().getObjectFromString(a)));
				}
			}
		}
		return ticket;
	}
	
	/**
	 * 
	 */
	public boolean addTicket(Ticket ticket) throws IOException {
		this.tickets.add(ticket);
		FileManager fileManager = new FileManager(DirectoryType.TICKET.getPath() + ticket.getId() + "Ticket.txt");
		fileManager.writeToFile(new TicketFile().getStringFromObject(ticket));		
		return true;
	}
	
	/*
	 *
	 */
	public ArrayList<Event> getEvents(){
		return this.events;
	}
	
	/**
	 * 
	 */
	public boolean existsUserAccountLogin() {
		return this.userAccountLogin!=null?true:false;
	}
	
	/**
	 * 
	 */
	public Account getUserAccountLogin() {
		return this.userAccountLogin;
	}

	/**
	 * 
	 */
	public void setUserAccountLogin(Account userAccountLogin) {
		this.userAccountLogin = userAccountLogin;
	}
	
	/**
	 * 
	 */

}