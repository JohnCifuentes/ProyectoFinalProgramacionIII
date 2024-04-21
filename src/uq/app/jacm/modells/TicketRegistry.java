package uq.app.jacm.modells;

import java.util.ArrayList;

public class TicketRegistry implements StringFormatter{
	private static int nextID = 1;
	private int id;
	private Event event;
	private ArrayList<Ticket> tickets;
	
	public TicketRegistry() {
		this.id = TicketRegistry.nextID++;
	}
	
	public TicketRegistry(Event event, ArrayList<Ticket> tickets) {
		super();
		this.event = event;
		this.tickets = tickets;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNextID() {
		return nextID;
	}

	public static void setNextID(int nextID) {
		TicketRegistry.nextID = nextID;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

}
