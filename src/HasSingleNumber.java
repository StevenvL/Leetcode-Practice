
public class HasSingleNumber {
	  public static int singleNumber(int[] nums) {
		  int result = 0;
	        for(int current : nums) {
	        	result = result^current;
	        }
	        return result;
	    }
	  
	  public static void main (String[] args) {
		  int[] t = {4,1,2,1,2};
		  System.out.println(singleNumber(t));
	  }
	}
