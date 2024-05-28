package uq.app.jacm.tools;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generic {
	/**
	 * 
	 */
	public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	/**
	 * 
	 */
	public static final int daysToOpenSold = 2;
	/**
	 * 
	 */
	public static final int port = 8080;
	/**
	 * 
	 */
	public static final String lpad(String text, int totalLength, char paddingChar) {
		int currentLength = text.length();
		if(currentLength > totalLength) {
			return text;
		} else {
			StringBuilder newText = new StringBuilder();
			int paddingNeeded = totalLength - currentLength;
			for(int i = 0; i < paddingNeeded; i++) {
				newText.append(paddingChar);
			}
			return newText.toString() + text;
		}
	}
	/**
	 * 
	 */
	public static boolean isNumber(String text) {
		try {
			Integer.parseInt(text);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	/**
	 * 
	 */
	public static boolean isDate(String text) {
		try {
			LocalDate.parse(text, formatter);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	/**
	 * 
	 */
	public static boolean isEmailAdress(String text) {
		String regex = "^[a-zA-Z0-9-_\\.]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		return matcher.matches();
	}
}
