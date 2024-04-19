package Ngoc_Pham;

public class StringUtils {

	public String ConcatenateStrings(String firstname, String lastname) {
		String fullname;
		if (firstname == null && lastname == null) {
			return null;
		}
		if (firstname == null) {
			return lastname;
		}
		if (lastname == null) {
			return firstname;
		}
		fullname = firstname + " " + lastname;
		return fullname;
	}

	public String ReverseStrings(String text) {
		char[] letters = new char[text.length()];
		int index = 0;
		for (int a = text.length() - 1; a >= 0; a--) {
			letters[index] = text.charAt(a);
			index++;
		}
		String reversal = "";
		for (int a = 0; a < text.length(); a++) {
			reversal = reversal + letters[a];
		}
		return reversal;
	}

	public StringBuffer UppercaseStrings(String text) {
		StringBuffer newStr = new StringBuffer(text);
		for (int a = 0; a < text.length(); a++) {
			newStr.setCharAt(a, Character.toUpperCase(text.charAt(a)));
		}
		return newStr;
	}

	public String TrimSpace(String text) {
		return text.trim();
	}
}
