
public class countPrimes {
	public static int countPrimes2(int n ) {
		int magicNumber = (int) Math.sqrt(n) + 1;
		int counter = 0;
		
		
		for(int i = 2; i< n; i++) {
			int tempCounter = 0;
			for(int j = 1; j <= magicNumber; j++) {
				if(i != j && j != 1 && i%j == 0 )
					tempCounter++;
			}
			if(tempCounter == 0 ) {
				counter++;
				System.out.println(i);
			}
		}
		return counter;
	}
	
	
	//Basically notPrime is an array of N size
	//For each int up to n;
		//multiply it by another value j in which i*j < n
		//if you are able to get to that value set it as true. Thus stating the number is not prime.
		//Now when you go through to the next number "i" it will tell you if that number is prime or not.
	public static int countPrimes3(int n) {
		boolean[] notPrime = new boolean[n];
		int count = 0;
		for(int i = 2; i < n; i++) {
			if(notPrime[i] == false)
				count++;
			for(int j = 2; i*j < n; j++) {
				notPrime[i*j] = true;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countPrimes3(10));
	}
}
