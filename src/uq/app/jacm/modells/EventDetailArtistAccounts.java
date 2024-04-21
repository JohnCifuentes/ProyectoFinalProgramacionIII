package uq.app.jacm.modells;

import java.util.ArrayList;

public class EventDetailArtistAccounts implements StringFormatter{
	private ArrayList<Account> artistAccounts;
	
	public EventDetailArtistAccounts(ArrayList<Account> artistAccounts) {
		super();
		this.artistAccounts = artistAccounts;
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

	public ArrayList<Account> getArtistAccounts() {
		return artistAccounts;
	}

	public void addArtistAccount(Account artistAccount) {
		this.artistAccounts.add(artistAccount);
	}

}