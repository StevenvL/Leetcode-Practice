package LinkedInPractice;

public class ArbitraryShopping {
	public static int getMaximumOutfits(int money, int[] outfits) {
		int maximumAmountOfOutfits = 0;
		for (int i = 0; i < outfits.length; i++) {
			int tempMax = 0;
			int currentMoney = money;
			for (int j = i; j < outfits.length; j++) {
				if (currentMoney - outfits[j] >= 0) {
					currentMoney = currentMoney - outfits[j];
					tempMax++;
				}
			}
			if(tempMax > maximumAmountOfOutfits)
				maximumAmountOfOutfits = tempMax;
		}
		return maximumAmountOfOutfits;
	}

	public static void main(String args[]) {
		int money = 5;
		int[] outfits = {2, 3, 5, 1, 1, 2, 1};
		System.out.println(getMaximumOutfits(money, outfits));
	}
}
