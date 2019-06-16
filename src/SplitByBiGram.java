import java.util.ArrayList;
import java.util.Arrays;

public class SplitByBiGram {
	 public static String[] findOcurrences(String text, String first, String second) {
		 	String[] temp = text.split(" ");
		 	ArrayList<String> r = new ArrayList<>();
		 
		 	for(int i = 0; i < temp.length - 2; i++) {
		 		if(temp[i].equals(first) && temp[i+1].equals(second)) {
		 			r.add(temp[i+2]);
		 		}
		 	}
		 	String[] result = new String[r.size()];
		 	result = r.toArray(result);
		 	return result;
	 }
	 public static void main(String [] args) {
         String text ="we will we will rock you";
         String first = "we";
         String second = "will";
         System.out.print(Arrays.toString(findOcurrences(text,first,second)));
    }
}