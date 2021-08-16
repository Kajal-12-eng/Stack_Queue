
import java.util.Stack;

public class UC1 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		boolean result = stack.empty();
		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println("Elements in Stack: " + stack);
		result = stack.empty();
	}

}