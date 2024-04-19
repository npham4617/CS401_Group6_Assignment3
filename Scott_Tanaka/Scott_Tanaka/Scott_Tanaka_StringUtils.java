package Scott_Tanaka;

import java.util.*;

public class Scott_Tanaka_StringUtils {
	
	public String concatenate(String a, String b) {
			
		return a + b;
	}
		
	public String reverse(String a) {
			
		String s = "";
		char c;
			
		for(int i = 0; i < a.length(); i++) {
			c = a.charAt(i);
			s = c + s;
		}
			
		return s;
	}
		
	public String uppercase(String a) {
			
		return a.toUpperCase();
	}
	
	public String trim(String a) {
			
		return a.trim();
	}


}
