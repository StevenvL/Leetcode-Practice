/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

Runtime: 9 ms, faster than 30.23% of Java online submissions for Fibonacci Number.
Memory Usage: 32.2 MB, less than 54.87% of Java online submissions for Fibonacci Number.
 */
public class FibonacciNumber {
	   public static int fib(int n) {
		   if(n == 1 || n == 0)
			   return n;
		   else
			   return fib(n-1) + fib(n-2);
	   }
	   
	   public static void main (String[] args) {
		   System.out.println(fib(4));
	   }
}
