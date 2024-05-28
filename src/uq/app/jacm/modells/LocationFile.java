package uq.app.jacm.modells;

import uq.app.jacm.tools.Generic;

public class LocationFile implements FormatFile<Location>{
	@Override
	public String getStringFromObject(Location object) {
		return Generic.lpad(String.valueOf(object.getId()), 3, '0') + "¬" + object.getName() + "¬" + object.getNumRows() + "¬" + object.getNumColumns();
	}

	@Override
	public Location getObjectFromString(String text) {
		String[] locationString = text.split("¬");
		Location location = new Location(locationString[1], Integer.parseInt(locationString[2]), Integer.parseInt(locationString[3]));
		location.setId(Integer.parseInt(locationString[0]));
		return location;
	}
}
