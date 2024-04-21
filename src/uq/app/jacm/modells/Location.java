package uq.app.jacm.modells;

public class Location implements StringFormatter{
	private static int nextID = 1;
	private int id;
	private String name;
	private int numRows;
	private int numColumns;
	
	public Location() {
		this.id = Location.nextID++;
	}
	
	public Location(String name, int numRows, int numColumns) {
		super();
		this.name = name;
		this.numRows = numRows;
		this.numColumns = numColumns;
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

	@Override
	public String formString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeToFile(String data) {
		// TODO Auto-generated method stub
	}

}