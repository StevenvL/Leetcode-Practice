package CTCIPractice;

import java.util.Arrays;
import java.util.HashMap;

public class Check_Permutation1_2 {
	public static boolean checkPermuatation(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < str1.length(); i++) {
			char currentChar = str1.charAt(i);
			if(map1.containsKey(currentChar))
				map1.put(currentChar, map1.get(currentChar)+1);
			else
				map1.put(currentChar, 1);
		}
		for(int i = 0; i < str2.length(); i++) {
			char currentChar = str2.charAt(i);
			if(map2.containsKey(currentChar))
				map2.put(currentChar, map2.get(currentChar)+1);
			else
				map2.put(currentChar, 1);
		}
		
		if(map1.size() != map2.size())
				return false;
		
		for(Character c : map1.keySet()) {
			if(map2.containsKey(c) == false)
				return false;
			else if(map1.get(c) != map2.get(c))
				return false;
		}
		return true;
	}
	
	public static boolean checkPermutation2(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String s1 = Arrays.toString(c1);
		String s2 = Arrays.toString(c2);
		
		return s1.equals(s2);
	}
	
	public static void main (String[] args) {
		String s = "abc";
		String s1 = "bac";
		
		String s2 = "sss";
		
		System.out.println(checkPermuatation(s,s2));
		System.out.println(checkPermutation2(s,s2));
	}
}
