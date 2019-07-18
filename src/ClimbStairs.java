import java.util.ArrayList;

public class ClimbStairs {
	// https://leetcode.com/problems/climbing-stairs/
	// Count the amount of ways you can climb the stairs considering you can either
	// go up 1 or 2 steps at a time.
	public static int climbStairs(int n) {
		ArrayList<Integer> temp = new ArrayList<>();
		climb(n, 0, temp);
		return temp.size();
	}

	public static void climb(int n, int cur, ArrayList<Integer> a) {
		if (cur == n)
			a.add(1);
		if (cur >= n)
			return;
		climb(n, cur + 1, a);
		climb(n, cur + 2, a);
	}

	public static int climbStairs2(int n) {
		// A better way to solve this problem. Ideas were from leetcode discussion page.
		//Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
		//Memory Usage: 33 MB, less than 5.08% of Java online submissions for Climbing Stairs.

		if (n <= 2)
			return n;

		int oneAway = 2;
		int twoAway = 1;
		int allSteps = 0;
		for (int i = 2; i < n; i++) {
			allSteps = oneAway + twoAway;
			twoAway = oneAway;
			oneAway = allSteps;
		}
		return allSteps;
	}

	public static void main(String[] args) {
		int a = 38;
		System.out.println(climbStairs(a));
		System.out.println(climbStairs2(a));
	}
}
