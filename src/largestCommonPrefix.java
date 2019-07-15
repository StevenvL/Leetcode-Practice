
public class largestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		String res = "";
		String tempPrefix = "";
		int shortestLength = Integer.MAX_VALUE;
		int indexOfShort = 0;

		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() == 0)
				return "";
			if (strs[i].length() < shortestLength) {
				tempPrefix = strs[i].charAt(0) + "";
				shortestLength = strs[i].length();
				indexOfShort = i;
			}
		}

		if (tempPrefix.equals(""))
			return "";

		for (int i = 0; i <= shortestLength; i++) {
			boolean allSame = true;
			tempPrefix = strs[indexOfShort].substring(0, i);
			for (String word : strs) {
				if (!word.substring(0, i).equals(tempPrefix))
					allSame = false;
			}
			if (allSame == true) {
				res = tempPrefix;
			}
		}
		return res;
	}
	
	//Better solution
	public static String longestPrefix(String[] strs) {
		if(strs== null || strs.length == 0)
			return "";
		String res = strs[0];
		for(String word: strs) {
			while(!word.startsWith(res))
				res = res.substring(0, res.length()-1);
			}
		return res;
		
	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println("Result: " + longestPrefix(strs));
	}
}
