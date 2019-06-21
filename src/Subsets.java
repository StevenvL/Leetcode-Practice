import java.util.List;
import java.util.ArrayList;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
    	  List<List<Integer>> result =  new ArrayList<List<Integer>>();
    	  result.add(new ArrayList<Integer>());
    	  /**
    	for(int current : nums) {
    		int currentSize = result.size();
    		for(int j = 0; j < currentSize; j++) {
    			List<Integer> temp = new ArrayList<Integer>(result.get(j));
    			temp.add(current);
    			result.add(temp);
    	}
    }
    **/
    	for(int i = 0; i < nums.length; i++) {
    		int currentSize = result.size();
    		for(int j = 0; j< currentSize; j++) {
    			List<Integer> temp = new ArrayList<Integer>(result.get(j));   
    			temp.add(nums[i]);
    			result.add(temp);
    			}
    	}
    	  
    	  
    	  return result;
    }
    
    
    public static void main (String[] args) {
    	int[] test1 = {1,2,3};
    	System.out.println(subsets(test1).toString());
    }
}