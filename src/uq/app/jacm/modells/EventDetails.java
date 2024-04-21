package uq.app.jacm.modells;

public class EventDetails implements StringFormatter{
	private int priceGold;
	private int priceSilver;
	private int priceCopper;
	private int minAge;
	
	public EventDetails(int priceGold, int priceSilver, int priceCopper, int minAge) {
		super();
		this.priceGold = priceGold;
		this.priceSilver = priceSilver;
		this.priceCopper = priceCopper;
		this.minAge = minAge;
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
	
	public int getPriceGold() {
		return priceGold;
	}

	public void setPriceGold(int priceGold) {
		this.priceGold = priceGold;
	}

	public int getPriceSilver() {
		return priceSilver;
	}

	public void setPriceSilver(int priceSilver) {
		this.priceSilver = priceSilver;
	}

	public int getPriceCopper() {
		return priceCopper;
	}

	public void setPriceCopper(int priceCopper) {
		this.priceCopper = priceCopper;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

}