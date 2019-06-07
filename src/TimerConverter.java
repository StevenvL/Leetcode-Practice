/**
 * Have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon. 
Sample Test Cases
Input:126

Output:2:6


Input:45

Output:0:45
 *
 */
public class TimerConverter {
	public static String TimeConvert(int num) { 
		  if(num < 60)
			  return "0:" + num;
		  int min = num%60;
		  int hour = num/60;
		  return hour + ":" + min;
	    
	  } 
	public static void main(String[] args) {
		System.out.println(TimeConvert(45));
	}
}
