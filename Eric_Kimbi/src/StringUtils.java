
public class StringUtils {
	 public  String concatenate(String str1, String str2) {
	      return str1 + str2;
	  }

	  public  String reverse(String str) {
	      char[] charArray = str.toCharArray();
	      int n = charArray.length;
	      for (int i = 0; i < n / 2; i++) {
	          char temp = charArray[i];
	          charArray[i] = charArray[n - i - 1];
	          charArray[n - i - 1] = temp;
	      }
	      return new String(charArray);
	  }

	  public String toUpperCase(String str) {
	      return str.toUpperCase();
	  }

	  public static String trim(String str) {
	      return str.trim();
	  }
}
