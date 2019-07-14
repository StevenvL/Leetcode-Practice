import java.util.Arrays;
import java.util.HashSet;

public class FairCandySwap {
	public static int[] fairCandySwap(int[] A, int[] B) {
		int[] ans = new int[2];
		int magicNumber = (computeTotal(A) + computeTotal(B)) / 2;
		for (int a : A) {
			for (int i = 0; i < B.length; i++) {
				int temp = B[i];
				B[i] = a;
				if (computeTotal(B) == magicNumber) {
					ans[0] = a;
					ans[1] = temp;
					return ans;
				} else
					B[i] = temp;
			}
		}
		return ans;
	}

	public static int computeTotal(int[] arr) {
		int total = 0;
		for (int a : arr) {
			total += a;
		}
		return total;
	}

	public static int[] fairCandySwap2(int[] A, int[] B) {
		HashSet<Integer> setA = new HashSet<>();
		HashSet<Integer> setB = new HashSet<>();
		int[] ans = new int[2];
		int aTotal = 0;
		int bTotal = 0;
		for (int a : A) {
			setA.add(a);
			aTotal += a;
		}

		for (int b : B) {
			setB.add(b);
			bTotal += b;
		}
		
		int magicNumber = (aTotal - bTotal)/2;
		for(int i = 0; i < B.length; i++) {
			int aContains = B[i] + magicNumber;
			if(setA.contains(aContains)) {
				ans[0] = aContains;
				ans[1] = B[i];
			}
		}
		return ans;
	}
	
	public static int[] fairCandySwap3(int[]A, int[]B) {
		HashSet<Integer> setB = new HashSet<>();
		int aTotal = 0;
		int total = 0;
		for(int a : A) {
			aTotal += a;
			total += a;
		}
		
		for(int b: B) {
			total += b;
			setB.add(b);
		}
		
		int halfTotal = total/2;
		int reqNumber = halfTotal - aTotal;
		// now check if reqNumber + a in A is in setB;
		
		for(int a : A) {
			if(setB.contains(reqNumber + a))
				return new int[] {a, reqNumber +a};
		}
		return null;
	}
	
		

	public static void main(String[] args) {
		int[] A = { 1,1 };
		int[] B = { 2,2 };
		System.out.println(Arrays.toString(fairCandySwap3(A, B)));
	}
}