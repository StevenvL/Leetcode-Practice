import java.util.Arrays;
import java.util.HashMap;

public class FirstUnique {
	   public static int firstUniqChar(String s) {
	     HashMap<Character, Integer> map =  new HashMap<>();
	     for(int i =0; i<s.length(); i++) {
	    	 if(map.containsKey(s.charAt(i))) {
	    		 int count = map.get(s.charAt(i)) + 1;
	    		 map.replace(s.charAt(i), count);
	    	 }
	    	 else
	    		 map.put(s.charAt(i), 1);
	     }
	     
	     for(int i = 0; i < s.length(); i++) {
	    	 if(map.get(s.charAt(i)) == 1)
	    			 return i;
	     }
	     return -1;
	    }
	   public static void main (String[] args) {
		   System.out.println(firstUniqChar("loveleetcode"));
	   }
}
