package uq.app.jacm.modells;

public class ArtistAccount extends Account implements StringFormatter{

	public ArtistAccount(String name, String lastName, String documentNumber, boolean isAdmin) {
		super(name, lastName, documentNumber, isAdmin);
	}

	@Override
	public String formString() {
		// TODO Auto-generated method stub
		return null;
	}
}