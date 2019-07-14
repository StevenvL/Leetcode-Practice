import java.util.Arrays;

public class FairCandySwap {
	public static int[] fairCandySwap(int[] A, int[] B) {
		int[] ans = new int[2];
        int magicNumber = (computeTotal(A) + computeTotal(B))/2;
        for(int a: A) {
        	for(int i = 0; i < B.length; i++) {
        		int temp = B[i];
        		B[i] = a;
        		if(computeTotal(B) == magicNumber) {
        			ans[0] = a;
        			ans[1] = temp;
        			return ans;
        		}
        		else
        			B[i] = temp;
        	}
        }
        return ans;
    }
	
	public static int computeTotal(int [] arr) {
		int total = 0;
		for(int a : arr) {
			total += a;
		}
		return total;
	}
	
	public static void main (String[] args) {
		int[] A = {2};
		int[] B = {1,3};
		System.out.println(Arrays.toString(fairCandySwap(A,B)));
	}
}