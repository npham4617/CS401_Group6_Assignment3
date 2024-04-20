package project;

public class StringUtils {
	
	public String concate(String firstString, String secondString) {
		if(firstString == null) {firstString = "";}
		if(secondString == null) {secondString = "";}
		
		return firstString + secondString;
	}
	
	public String reverse(String inputString) {
		if(inputString == null) {return null;}
		
        char[] charHolder = inputString.toCharArray();
        String reverseString = "";
        
        for (int i = charHolder.length - 1; i >= 0; i--)
            reverseString += charHolder[i];
        
        return reverseString;
	}
	
	public String upperString(String inputString) {
		if(inputString == null) {return null;}
		return inputString.toUpperCase();
	}
	
	public String spaceTrim(String inputString) {
		if(inputString == null) {return null;}
		return inputString.trim();
	}

}
