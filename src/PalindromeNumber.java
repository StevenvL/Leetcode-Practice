
public class PalindromeNumber {
	 public boolean isPalindrome(int a) {
	        if(a < 0)
	            return false;
	        
	        int x = a;
	        
			int res = 0;
			while(x > 0) {
				res *= 10;
				res += x%10;
				x /= 10;
			}
	        
	        return(res == a);
	        
	    }
}
