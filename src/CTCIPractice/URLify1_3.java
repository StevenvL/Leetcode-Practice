package CTCIPractice;

import java.util.Arrays;

public class URLify1_3 {
	public static void replaceSpaces(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		for(i = 0; i < length; ++i)
			if(str[i] == ' ')
				++spaceCount;
		newLength = length + spaceCount * 2;
		str[newLength] = '\0';		// null terminator
		for(i = length-1; i >= 0; --i) {
			if(str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength-3;
			}
			else {
				str[newLength - 1] = str[i];
				--newLength;
			}
		}
	}
	public static void main (String[] args) {
		char[] str = {'a', 'b', ' ', 'c', 'd', ' ', ' ', ' '};
		int truelength = 5;
		replaceSpaces(str,truelength);
		System.out.print(Arrays.toString(str));
	}
}
