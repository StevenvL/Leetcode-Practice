
public class ReverseNumber {
	public static int reverse(int x) {
		if (x == 0 || x == Integer.MIN_VALUE)
			return 0;
		
		int isPositive = 1;
		String reversed = "";
		
		if (x < 0) {
			isPositive = -1;
			x = x*isPositive;
		}
		
		while (x > 0) {
			reversed += x % 10;
			x /= 10;
		}

		long result = Long.parseLong(reversed) * isPositive;
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 0;
		else
			return (int) result;

	}
	
	public static int reverse2(int x) {
		int isPositive = 1;
		if(x < 0) {
			isPositive = -1;
			x*= isPositive;
		}
		long res = 0;
		while(x > 0) {
			res *= 10;
			res += x%10;
			x /= 10;
		}
		if((int) res == res)
			return (int) res * isPositive;
		else
			return 0;
	}

	public static void main(String[] args) {
		System.out.println(reverse2(Integer.MIN_VALUE));
	}
}
