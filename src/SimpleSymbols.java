/**
 * Have the function SimpleSymbols(str) take the str parameter being passed and
 * determine if it is an acceptable sequence by either returning the string true
 * or false. The str parameter will be composed of + and = symbols with several
 * letters between them (ie. ++d+===+c++==a) and for the string to be true each
 * letter must be surrounded by a + symbol. So the string to the left would be
 * false. The string will not be empty and will have at least one letter. 
 * 
 * 
 * Sample Test Cases Input:"+d+=3=+s+"
 * 
 * Output:true
 * 
 * 
 * Input:"f++d+"
 * 
 * Output:false
 * 
 * 
 *
 */
public class SimpleSymbols {
	public static String aSimpleSymbols(String str) {
		String result = "true";
		
		if(Character.isLetter(str.charAt(0)) || Character.isLetter(str.charAt(str.length()-1)))
			result = "false";
		
		for(int i = 1; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				if(str.charAt(i-1) != '+' || str.charAt(i+1) != '+')
					result = "false";
			}
		}
		return result;
	}
	public static void main (String[] args) {
		String s = "+d===+a+";
		System.out.println(aSimpleSymbols(s));
	}
}
