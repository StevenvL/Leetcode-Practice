import java.util.ArrayList;

public class PermutationsOfString {
	public static ArrayList<String> permutation(String str) {
		ArrayList<String> result = new ArrayList<>();
		permutationHelper(result,"", str);
		return result;
	}

	public static void permutationHelper(ArrayList<String> addToMe, String prefix, String suffix) {
		if (suffix.length() == 0)
			addToMe.add(prefix);
		else
			for (int i = 0; i < suffix.length(); i++) {
				permutationHelper(addToMe, prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1));
			}
	}

	public static void main(String[] args) {
		String a = "122";
		System.out.println(permutation(a));

	}
}
