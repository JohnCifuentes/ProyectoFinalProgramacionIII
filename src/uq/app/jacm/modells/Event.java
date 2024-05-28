package uq.app.jacm.modells;

import java.time.LocalDate;
import java.util.ArrayList;

import uq.app.jacm.tools.Generic;

public class Event implements Comparable<Event>{
	private static int nextID = 0;
	private int id;
	private String name;
	private LocalDate scheduledTime;
	private int priceTicket;
	private boolean ageRestriction;
	private Location location;	
	private ArrayList<String> artists;
	private ArrayList<Spot> spots;
	
	public Event() {
	}

	public Event(String name, LocalDate scheduledTime, int priceTicket, boolean ageRestriction, Location location) {
		this.id = ++Event.nextID;
		this.name = name;
		this.scheduledTime = scheduledTime;
		this.priceTicket = priceTicket;
		this.ageRestriction = ageRestriction;
		this.location = location;
		this.artists = new ArrayList<>();
		this.spots = new ArrayList<>();
	}
	
	public static int getNextID() {
		return Event.nextID;
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

	public LocalDate getScheduledTimeDate() {
		return this.scheduledTime;
	}
	
	public String getScheduledTime() {
		return scheduledTime.format(Generic.formatter);
	}

	public void setScheduledTime(LocalDate scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public int getPriceTicket() {
		return priceTicket;
	}

	public void setPriceTicket(int priceTicket) {
		this.priceTicket = priceTicket;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isAgeRestriction() {
		return ageRestriction;
	}

	public void setAgeRestriction(boolean ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	public ArrayList<String> getArtists() {
		return artists;
	}

	public void setArtists(ArrayList<String> artists) {
		this.artists = artists;
	}
	
	public void loadArtists(String eventArtists) {
		String[] artist = eventArtists.split(",");
		for(String a: artist) {
			this.artists.add(a.replaceFirst("^\\s", ""));
		}
	}

	public ArrayList<Spot> getSpots() {
		return spots;
	}

	public void setSpots(ArrayList<Spot> spots) {
		this.spots = spots;
	}
	
	public void addSpot(Spot spot) {
		this.spots.add(spot);
	}
	
	public void loadSpots() {
		int rowGold = Math.round(this.location.getNumRows()*TicketCategory.GOLD.getPercent());
		int rowSilver = Math.round(this.location.getNumRows()*TicketCategory.SILVER.getPercent());
		for(int i = 0; i < this.location.getNumRows(); i++) {	
			for(int j = 0; j < this.location.getNumColumns(); j++) {
				if(i <= rowGold) {
					this.spots.add(new Spot(i, j, TicketCategory.GOLD, true));
				} else if(i > rowGold && i <= rowSilver) {
					this.spots.add(new Spot(i, j, TicketCategory.SILVER, true));
				} else if(i > rowSilver) {
					this.spots.add(new Spot(i, j, TicketCategory.COPPER, true));
				}				
			}
		}
	}
	
	public Spot loadTicketCategorySpot(Spot spot) {
		int rowGold = Math.round(this.location.getNumRows()*TicketCategory.GOLD.getPercent());
		int rowSilver = Math.round(this.location.getNumRows()*TicketCategory.SILVER.getPercent());
		if(spot.getRow() <= rowGold) {
			spot.setTicketCategory(TicketCategory.GOLD);
		} else if(spot.getRow() > rowGold && spot.getRow() <= rowSilver) {
			spot.setTicketCategory(TicketCategory.SILVER);
		} else if(spot.getRow() > rowSilver) {
			spot.setTicketCategory(TicketCategory.COPPER);
		}	
		return spot;
	}

	@Override
	public int compareTo(Event o) {
		return this.scheduledTime.compareTo(o.getScheduledTimeDate());
	}
}