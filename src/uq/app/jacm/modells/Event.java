package uq.app.jacm.modells;

import java.time.LocalDate;

public class Event implements StringFormatter{
	private static int nextID = 1;
	private int id;
	private String name;
	private LocalDate scheduledTime;
	private Location location;
	private EventDetails eventDetail;
	private EventDetailSpots evenDetailSpots;
	private EventDetailArtistAccounts eventDetailArtistAccounts;
	
	public Event() {
		super();
		this.id = Event.nextID++;
	}

	public Event(String name, LocalDate scheduledTime, Location location, EventDetails eventDetail,
			EventDetailSpots evenDetailSpots, EventDetailArtistAccounts eventDetailArtistAccounts) {
		super();
		this.name = name;
		this.scheduledTime = scheduledTime;
		this.location = location;
		this.eventDetail = eventDetail;
		this.evenDetailSpots = evenDetailSpots;
		this.eventDetailArtistAccounts = eventDetailArtistAccounts;
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

	public static int getNextID() {
		return nextID;
	}

	public static void setNextID(int nextID) {
		Event.nextID = nextID;
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

	public LocalDate getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(LocalDate scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public EventDetails getEventDetail() {
		return eventDetail;
	}

	public void setEventDetail(EventDetails eventDetail) {
		this.eventDetail = eventDetail;
	}

	public EventDetailSpots getEvenDetailSpots() {
		return evenDetailSpots;
	}

	public void setEvenDetailSpots(EventDetailSpots evenDetailSpots) {
		this.evenDetailSpots = evenDetailSpots;
	}

	public EventDetailArtistAccounts getEventDetailArtistAccounts() {
		return eventDetailArtistAccounts;
	}

	public void setEventDetailArtistAccounts(EventDetailArtistAccounts eventDetailArtistAccounts) {
		this.eventDetailArtistAccounts = eventDetailArtistAccounts;
	}
	
}