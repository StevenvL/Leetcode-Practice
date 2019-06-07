import java.util.ArrayList;
import java.util.Arrays;

/**
 * Runtime: 2 ms, faster than 54.47% of Java online submissions for Shortest
 * Distance to a Character. Memory Usage: 36.4 MB, less than 99.85% of Java
 * online submissions for Shortest Distance to a Character.
 *
 *
 */
public class ShortestDistToChar {
	public static int[] shortestToChar(String S, char C) {
		ArrayList<Integer> eIndex = new ArrayList<>();
		int[] result = new int[S.length()];

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == C) {
				eIndex.add(i);
			}
		}

		for (int i = 0; i < S.length(); i++) {
			result[i] = findMinDistance(i, eIndex);
		}

		return result;
	}

	public static int findMinDistance(int index, ArrayList<Integer> eIndex) {
		int minDistance = Integer.MAX_VALUE;
		for (int i = 0; i < eIndex.size(); i++) {
			if (Math.abs(eIndex.get(i) - index) < minDistance) {
				minDistance = Math.abs(eIndex.get(i) - index);
			}
		}
		return minDistance;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(shortestToChar("aabb", 'b')));
	}
}
