import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagramsInString {
	public static List<Integer> findAnagrams(String s, String p) {
		if(p.length() > s.length())
			return new ArrayList<Integer>();
		
		
		int[] pArr = new int[128];
		for(int i = 0; i < p.length(); i++) {
			pArr[p.charAt(i)]++;
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i < s.length() - p.length()+1; i++) {
			int lengthTo = i + p.length();
			int[] checkMe = new int[128];
			for(int j = i; j < lengthTo; j++) {
				checkMe[s.charAt(j)]++;
			}
			if(Arrays.equals(pArr, checkMe))
				res.add(i);
		}
		return res;
	}
	
	
	public static void main (String[] args) {
		String a = "abab";
		String b = "ab";
		
		System.out.println(findAnagrams(a,b));
	}
}