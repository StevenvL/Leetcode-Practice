import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDupes {
	   public List<Integer> findDuplicates(int[] nums) {
	        HashSet<Integer> r  = new HashSet<Integer>();
	        List<Integer> result = new ArrayList<>();
	        
	        for(int current : nums) {
	        	int currentSetSize = r.size();
	        	r.add(current);
	        	if(r.size() == currentSetSize)
	        		result.add(current);
	        }
	        return result;
	    }
}
