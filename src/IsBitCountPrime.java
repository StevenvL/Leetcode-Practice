import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsBitCountPrime {
	//L, R will be integers L <= R in the range [1, 10^6].
	//R - L will be at most 10000.

	public static int countPrimeSetBits(int L, int R) {
		Integer[] p = { 2, 3, 5, 7, 11, 13, 17 ,19 };
		List<Integer> primeNumbers = Arrays.asList(p);
		int counter = 0;
		
		for(int i = L; i <= R; i++) {
			if(primeNumbers.contains(Integer.bitCount(i)))
				counter++;
		}
		return counter;
	}
	
	//Faster runtime, hardcodes into array instead of arraylist for faster retrival.
	public static int findPrimeBinary(int L, int R) {
		boolean[] p = {false, false, true, true, false, true, false, true, false, false, false, true, false, true, false, false, false, true, false, true};
		int counter = 0;
		for(int i = L; i <= R; i++) {
			if(p[Integer.bitCount(i)])
				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(countPrimeSetBits(10,15));
		System.out.println(findPrimeBinary(10,15));
	}
}
