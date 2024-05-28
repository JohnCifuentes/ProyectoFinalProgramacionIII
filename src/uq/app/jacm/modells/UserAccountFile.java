package uq.app.jacm.modells;

import java.time.LocalDate;

import uq.app.jacm.tools.Generic;

public class UserAccountFile implements FormatFile<UserAccount>{

	@Override
	public String getStringFromObject(UserAccount object) {
		return Generic.lpad(String.valueOf(object.getId()), 3, '0') + "¬" + object.getName() + "¬" + object.getLastName() + "¬" + 
			object.getDocumentNumber()  + "¬" + (object.isAdmin()?"1":"0") + "¬" + object.getEmail() + "¬" 
				+ object.getNumber() + "¬" + object.getBirthday();
	}

	@Override
	public UserAccount getObjectFromString(String text) {
		String[] userAccountString = text.split("¬");
		UserAccount userAccount = new UserAccount(userAccountString[1], userAccountString[2], userAccountString[3], (userAccountString[4].equals("0")?false:true), 
				userAccountString[5], userAccountString[6], LocalDate.parse(userAccountString[7], Generic.formatter));
		userAccount.setId(Integer.parseInt(userAccountString[0]));
		return userAccount;
	}

}