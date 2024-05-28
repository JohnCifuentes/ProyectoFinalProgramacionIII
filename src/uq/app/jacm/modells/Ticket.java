package uq.app.jacm.modells;

import java.util.ArrayList;

public class Ticket{
	public static int nextID = 0;
	private int id;
	private Account user;
	private Event event;
	private ArrayList<Spot> spots;
	
	public Ticket(Account user, Event event) {
		super();
		this.id = ++Ticket.nextID;
		this.user = user;
		this.event = event;
		this.spots = new ArrayList<>();
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

	public Account getUser() {
		return user;
	}

	public void setUser(Account user) {
		this.user = user;
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

	public void setSpot(ArrayList<Spot> spot) {
		this.spots = spot;
	}
	
	public void addSpot(Spot spot) {
		this.spots.add(spot);
	}

}