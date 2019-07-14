
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

	public static void main(String[] args) {
		System.out.println(reverse(1235913250));
	}
}
