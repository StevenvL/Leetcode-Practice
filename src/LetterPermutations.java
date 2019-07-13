import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LetterPermutations {
	public static List<String> letterCasePermutation(String S) {
	        ArrayList<String> res = new ArrayList<>();
	        createPermutations(res,S.toCharArray(),0);
	        return res;
	    }
	

	public static void createPermutations(ArrayList<String> res, char[] charArr, int index) {
	        if(index == charArr.length)
	            res.add(new String(charArr));
	        else {
	            if(Character.isLetter(charArr[index])) {
	            	charArr[index] = Character.toLowerCase(charArr[index]);
	            	createPermutations(res,charArr,index+1);
	            	charArr[index] = Character.toUpperCase(charArr[index]);
	            	}
	            createPermutations(res,charArr,index+1);
	        }
	    }

	public static void main(String[] args) {
		String word = "a1b2";
		List<String> result = letterCasePermutation(word);
		System.out.println(result);

	}
}
