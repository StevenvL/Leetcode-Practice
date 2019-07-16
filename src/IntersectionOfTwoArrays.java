import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	//https://leetcode.com/problems/intersection-of-two-arrays/
	  public int[] intersection(int[] nums1, int[] nums2) {
	    HashSet<Integer> set1 = new HashSet<>();
	    HashSet<Integer> set2 = new HashSet<>();
	    
	    for(int n : nums1) {
	    	set1.add(n);
	    }
	    
	    for(int n : nums2) {
	    	set2.add(n);
	    }
	    ArrayList<Integer> res = new ArrayList<>();
	    for(Integer n : set1) {
	    	if(set2.contains(n))
	    		res.add(n);
	    }
	    
	    int[] a = new int[res.size()];
	    for(int i = 0; i < res.size(); i++) {
	    	a[i] = res.get(i);
	  }
	    return a;
	  }
	  
	  
	  public int[] intersection2(int nums1[], int nums2[]) {
		  HashSet<Integer> set1 = new HashSet<>();
		  Set<Integer> common = new HashSet<>();

		  for(int a : nums1) {
			  set1.add(a);
		  }
		  
		  for(int b : nums2) {
			  if(set1.contains(b))
				  common.add(b);
		  }
		  
		  int[] res = new int[common.size()];
		  
		  int index = 0;
		  for(Integer a : common) {
			  res[index++] = a;
		  }
		  return res;
	  }
}
