
public class reverseWords {
	public static String areverseWords(String s) {
		
		String[] splitArray = s.split(" ");
		String result = "";
		for(String currentString : splitArray) {
			StringBuilder sb = new StringBuilder();
			sb.append(currentString);
			result += sb.reverse() + " ";
		}
		result = result.substring(0, result.length()-1);
		return result;
	}
	
	public static void main (String[] args) {
		System.out.println(areverseWords("Let's take LeetCode contest"));
	}
}
