package uq.app.jacm.modells;

public enum TicketCategory {
	GOLD(0.1f),
	SILVER(0.30f),
	COPPER(0.60f);
	
	private float percent;
	
	TicketCategory(float percent){
		this.percent = percent;
	}
	
	public float getPercent() {
		return this.percent;
	}
	
}