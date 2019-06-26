import java.math.BigInteger;
import java.util.Arrays;

public class PlusOneProblem {
	  public static int[] plusOne(int[] digits) {
		 String value = "";
		 for(int current : digits) {
			 value+= current;
		 }
		 BigInteger bd = new BigInteger(value);
		 BigInteger one = new BigInteger("1");
		 bd = bd.add(one);
		 String s = bd.toString();
		 
		 
		 int[] rarr = new int[s.length()];
		 for(int i = 0; i < s.length(); i++) {
			 rarr[i] = Integer.parseInt(s.charAt(i) + "");
		 }
		 return rarr;
	  }
	 
	  public static void main (String[] args) {
		  int[]  a = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		  System.out.println(Arrays.toString(plusOne(a)));
	  }
}
