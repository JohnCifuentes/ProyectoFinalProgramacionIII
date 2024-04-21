package uq.app.jacm.modells;

public class Spot {
	private int row;
	private int column;
	private TicketCategory ticketCategory;
	private boolean available;
	
	public Spot(int row, int column, TicketCategory ticketCategory, boolean available) {
		super();
		this.row = row;
		this.column = column;
		this.ticketCategory = ticketCategory;
		this.available = available;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public TicketCategory getTicketCategory() {
		return ticketCategory;
	}

	public void setTicketCategory(TicketCategory ticketCategory) {
		this.ticketCategory = ticketCategory;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}