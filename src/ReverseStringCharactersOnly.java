import java.util.Arrays;

public class ReverseStringCharactersOnly {
	public static String reverseOnlyLetters(String S) {
		char[] rs = S.toCharArray();
		int indexOfLast = S.length() - 1;
		int front = 0;

		while (front < indexOfLast) {
			while (Character.isLetter(rs[front]) == false) {
				if (front < rs.length - 1) {
					front++;
				} else {
					break;
				}
			}

			while (Character.isLetter(rs[indexOfLast]) == false) {
				if (indexOfLast > 1) {
					indexOfLast--;
				} else {
					break;
				}
			}

			if (front < indexOfLast) {
				char temp = rs[front];
				rs[front] = rs[indexOfLast];
				rs[indexOfLast] = temp;
				front++;
				indexOfLast--;
			}
		}
		return new String(rs);
	}

	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("ab-cd") + " supposed to be 6E4");
	}
}
