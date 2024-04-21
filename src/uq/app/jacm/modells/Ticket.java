package uq.app.jacm.modells;

public class Ticket implements StringFormatter{
	private Account user;
	private Spot spot;
	
	public Ticket(Account user, Spot spot) {
		super();
		this.user = user;
		this.spot = spot;
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

	public Account getUser() {
		return user;
	}

	public void setUser(Account user) {
		this.user = user;
	}

	public Spot getSpot() {
		return spot;
	}

	public void setSpot(Spot spot) {
		this.spot = spot;
	}
	
}