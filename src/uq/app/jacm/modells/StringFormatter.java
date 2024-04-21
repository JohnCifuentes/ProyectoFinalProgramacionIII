package uq.app.jacm.modells;

public interface StringFormatter {
	//Method to create a specific type of string with a defined structure
	String formString();
	
	//Method to write the string to a file
	void writeToFile(String data);
	
}