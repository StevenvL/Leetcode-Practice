package diStringMatch;

import java.util.Arrays;

class Solution {
	public int[] diStringMatch(String S) {
		int[] result = new int[S.length()+1];
		int increase = 0;
		int decrease = S.length();
		
		if(S.charAt(0) == 'D')
			result[0] = decrease;
		else
			result[0] = increase;
		
		System.out.println(result[0]);
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'D')
				result[i] = decrease--;
			else
				result[i] = increase++;
			
		}
		
		result[S.length()] = decrease;
		return result;
	}
	
	public static void main (String args[]) {
		String test = "IDID";
		Solution tester = new Solution();
		System.out.println(Arrays.toString(tester.diStringMatch(test)));
	}
}

/**
 * Runtime: 8 ms, faster than 45.27% of Java online submissions for DI String Match.
 * Memory Usage: 27.8 MB, less than 22.19% of Java online submissions for DI String Match.
 * 
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N =
 * S.length.
 * 
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 * 
 * If S[i] == "I", then A[i] < A[i+1] If S[i] == "D", then A[i] > A[i+1]
 * 
 * 
 * Example 1:
 * Input: "IDID" 
 * Output: [0,4,1,3,2] 
 * 
 * Example 2:
 * Input: "III" 
 * Output: [0,1,2,3] 
 * 
 * Example 3:
 * Input: "DDI" 
 * Output: [3,2,0,1]
 * 
 **/