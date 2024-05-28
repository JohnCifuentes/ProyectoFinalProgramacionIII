package uq.app.jacm.modells;

public interface FormatFile<T> {
	//Method to create a specific type of string with a defined structure
	String getStringFromObject(T object);
	
	//Method to create a specific type of string with a defined structure
	T getObjectFromString(String text);
}
