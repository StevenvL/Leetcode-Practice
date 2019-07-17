
public class validBoomerang {
	public static boolean isBoomerang(int[][] p) {
		double slope1 = (p[0][0] - p[1][0]) * (p[0][1] - p[2][1]);
		double slope2 = (p[0][0] - p[2][0]) * (p[0][1] - p[1][1]);
		return (slope1 != slope2);
	}

	public static void main(String[] args) {
		int[][] pts = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
		System.out.println(isBoomerang(pts));
	}
}
