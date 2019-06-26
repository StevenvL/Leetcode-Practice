
public class MonotonicArray {
    public static boolean isMonotonic2(int[] A) {
    	 if(A.length <2)
          	return true;
    	 
    	boolean increasing = true;
    	boolean decreasing = true;
    	for(int i =0; i <A.length-1;i++) {
    		if(A[i] > A[i+1]) {
    			increasing = false;
    		}
    		if(A[i] < A[i+1]) {
    			decreasing = false;
    		}
    	}
    	return increasing^decreasing || increasing&&decreasing;
    }
    public static void main (String [] args) {
    	int[] res = {6,5,5,4}; // should be true;
    	System.out.println(isMonotonic2(res));
    }
}
