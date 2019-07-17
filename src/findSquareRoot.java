
public class findSquareRoot {
	//https://leetcode.com/problems/sqrtx/
	public static int sqrt(int x) {
		//Easy way
		return (int) Math.sqrt(x);
	}
	
	public static int sqrt2(int x) {
		//Brute force
		//Uses i  <= x/i and (i+1) > x/(i+1) to avoid overflow from max and min integers in java
		
		if(x < 1)
			return x;
		
		for(int i = 1; i <= x/i ; i++) {
			if(i <= x/i && (i+1) > x/(i+1))
				return i;
		}
		
		return -1; 
	}
	
	public static void main (String[] args) {
		int a = 4; 
		System.out.println(sqrt(a) == sqrt2(a));
	}
}
