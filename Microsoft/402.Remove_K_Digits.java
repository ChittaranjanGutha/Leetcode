import java.util.Stack;

class Solution {
	public String removeKdigits(String num, int k) {
		StringBuilder sc = new StringBuilder();
		if (k == num.length())
			return "0";
		Stack<Character> stack = new Stack<Character>();
		int index = 0;
		while (index < num.length()) {
			// Remove all the elements that are greater than the current element
			while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(index)) {
				k--;
				stack.pop();
			}
			stack.push(num.charAt(index));
			index++;
		}

		// If all the numbers in the given number are equal
		while (k > 0) {
			k--;
			stack.pop();
		}

		while (!stack.isEmpty()) {
			sc.append(stack.pop());
		}
		sc.reverse();
		while (sc.length() > 1 && sc.charAt(0) == '0')
			sc.deleteCharAt(0);
		return sc.toString();
	}
}
