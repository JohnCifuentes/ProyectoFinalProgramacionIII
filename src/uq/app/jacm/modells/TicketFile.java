package uq.app.jacm.modells;

public class TicketFile implements FormatFile<Ticket>{

	@Override
	public String getStringFromObject(Ticket object) {
		String text = "";
		text += "1¬" + object.getUser().getId() + "¬" + object.getEvent().getId() + "\n";
		for(Spot s: object.getSpots()) 
			text += "2¬" + s.getRow() + "¬" + s.getColumn() + "¬¬" + (s.isAvailable()?"1":"0") + "\n";
		return text;
	}

	@Override
	public Ticket getObjectFromString(String text) {
		// TODO Auto-generated method stub
		return null;
	}

}
