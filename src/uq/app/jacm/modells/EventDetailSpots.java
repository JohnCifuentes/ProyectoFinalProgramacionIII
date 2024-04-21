package uq.app.jacm.modells;

import java.util.ArrayList;

public class EventDetailSpots implements StringFormatter{
	private ArrayList<Spot> spots;
	
	public EventDetailSpots(ArrayList<Spot> spots) {
		super();
		this.spots = spots;
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

	public ArrayList<Spot> getSpots() {
		return spots;
	}

	public void addSpot(Spot spot) {
		this.spots.add(spot);
	}

}