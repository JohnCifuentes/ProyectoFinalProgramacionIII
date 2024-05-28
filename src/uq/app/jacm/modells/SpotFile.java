package uq.app.jacm.modells;

public class SpotFile implements FormatFile<Spot>{

	@Override
	public String getStringFromObject(Spot object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spot getObjectFromString(String text) {
		String[] spotString = text.split("¬");
		Spot spot = new Spot(Integer.parseInt(spotString[1]), Integer.parseInt(spotString[2]), null, spotString[4].equals("1"));
		return spot;
	}

}
