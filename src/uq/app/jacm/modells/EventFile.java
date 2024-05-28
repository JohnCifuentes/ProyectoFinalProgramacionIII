package uq.app.jacm.modells;

import java.time.LocalDate;

import uq.app.jacm.tools.Generic;

public class EventFile implements FormatFile<Event>{

	@Override
	public String getStringFromObject(Event object) {
		String text = "";
		text += "1¬" + Generic.lpad(String.valueOf(object.getId()), 3, '0') + "¬" + object.getName() + "¬" + object.getScheduledTime() + "¬" + object.getPriceTicket() + 
				(object.isAgeRestriction()?"1":"0") + "¬" + object.getLocation().getId() + "\n";
		for(Spot s: object.getSpots()) 
			text += "2¬" + s.getRow() + "¬" + s.getColumn() + "¬¬" + (s.isAvailable()?"1":"0") + "\n";
		text += "3¬";
		for(String s: object.getArtists()) 
			text += s + ",";
		return text;
	}

	@Override
	public Event getObjectFromString(String text) {
		String[] eventString = text.split("¬");
		Event event = new Event(eventString[2], LocalDate.parse(eventString[3], Generic.formatter), Integer.parseInt(eventString[4]), eventString[5].equals("1"), null);
		event.setId(Integer.parseInt(eventString[1]));
		return event;
	}

}