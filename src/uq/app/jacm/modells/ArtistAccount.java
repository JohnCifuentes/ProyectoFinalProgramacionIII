package uq.app.jacm.modells;

public class ArtistAccount extends Account implements StringFormatter{

	public ArtistAccount(String name, String documentNumber) {
		super(name, documentNumber);
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