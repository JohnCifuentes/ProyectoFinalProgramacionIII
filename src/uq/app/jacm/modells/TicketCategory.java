package uq.app.jacm.modells;

public enum TicketCategory {
	GOLD(10, 0),
	SILVER(30, 0),
	COPPER(60, 0);
	
	private int percent;
	private int price;
	
	TicketCategory(int percent, int price){
		this.percent = percent;
		this.price = price;
	}
	
	public int getPercent() {
		return this.percent;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}