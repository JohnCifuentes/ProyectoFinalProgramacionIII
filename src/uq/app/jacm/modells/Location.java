package uq.app.jacm.modells;

public class Location{
	private static int nextID = 0;
	private int id;
	private String name;
	private int numRows;
	private int numColumns;
	
	public Location(String name, int numRows, int numColumns) {
		this.id = ++Location.nextID;
		this.name = name;
		this.numRows = numRows;
		this.numColumns = numColumns;
	}
	
	public static void updateNextID(int nextID) {
		Location.nextID = nextID; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumRows() {
		return numRows;
	}

	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}

	public int getNumColumns() {
		return numColumns;
	}

	public void setNumColumns(int numColumns) {
		this.numColumns = numColumns;
	}

}