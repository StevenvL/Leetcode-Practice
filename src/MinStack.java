import java.util.Stack;

public class MinStack {	
    Stack<Integer> s;
	Stack<Integer> minStack;

	public MinStack() {
		s = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int x) {
		if (minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
		s.push(x);
	}

	public void pop() {
		if(s.peek().equals(minStack.peek())) {
			minStack.pop();
		}
		s.pop();
	}

	public int top() {
		return s.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */