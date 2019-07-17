
public class BuySellStocks {
	// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	public static int maxProfit(int[] prices) {
		if (prices.length < 1)
			return 0;
		int buy = prices[0];
		int sell = prices[0];
		int delta = sell - buy;
		int low = prices[0];
		for (int i = 0; i < prices.length - 1; i++) {
			low = Math.min(low, prices[i]);
			if (low < prices[i]) {
				continue;
			}
			else {
				for (int j = i + 1; j < prices.length; j++) {
					delta = Math.max(delta, prices[j] - prices[i]);
				}
			}
		}
		return delta;
	}
	
	public static int maxProfit2(int[] prices) {
		//Using help from leetcode discussion we should use the same approach as "maximum subarray problems"
		//First you need to find the difference between each slot.
			//ie difference[i] = prices[i] - prices[i-1] assuming "i != 0"
		
		//Runtime: 2 ms, faster than 20.49% of Java online submissions for Best Time to Buy and Sell Stock.
		//Memory Usage: 36.8 MB, less than 99.97% of Java online submissions for Best Time to Buy and Sell Stock.

		if(prices.length < 2)
			return 0;
		
		int[] difference = new int[prices.length-1];
		for(int i = 1; i < prices.length; i++) {
			difference[i-1]= prices[i] - prices[i-1];
		}
		return maxSubArray(difference);
	}
	
	public static int maxSubArray(int[] diff) {
		int curMax = 0;
		int returnMax = 0;
		for(int i = 0; i < diff.length; i++) {
			curMax = Math.max(0, curMax + diff[i]);
			returnMax = Math.max(returnMax, curMax);
		}
		return returnMax;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 }; // ans = 5
		int[] a = {2,0};
		System.out.println(maxProfit2(a));
	}
}
