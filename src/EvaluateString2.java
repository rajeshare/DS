import java.lang.invoke.SwitchPoint;
import java.util.Stack;

public class EvaluateString2 {

	public static void main(String[] arg) {

		String input = "10 + 10 * 2 + 10 / 2";

		evaluate(input);
	}

	private static void evaluate(String input) {

		char[] in = input.toCharArray();

		Stack<Integer> operand = new Stack<Integer>();
		Stack<Character> operator = new Stack<>();

		for (int i = 0; i < in.length; i++) {

			if (in[i] == ' ') {
				continue;
			} else if (in[i] >= '0' && in[i] <= '9') {
				StringBuilder sb = new StringBuilder();
				while (i < in.length && in[i] >= '0' && in[i] <= '9') {
					sb.append(in[i]);
					i = i + 1;
				}
				operand.push(Integer.parseInt(sb.toString()));
			} else if (in[i] == '(') {
				operator.push(in[i]);
			} else if (in[i] == ')') {

			} else if (in[i] == '+' || in[i] == '-' || in[i] == '*' || in[i] == '/') {

				while (!operator.empty() && hasPrecedence(in[i], operator.peek()))
					operand.push(apply(operator.pop(), operand.pop(), operand.pop()));

				operator.push(in[i]);
			}
		}

		while (!operator.isEmpty()) {
			apply(operator.pop(), operand.pop(), operand.pop());
		}
	}

	private static boolean hasPrecedence(char op1, Character op2) {

		if (op1 == '(' || op2 == ')')
			return false;
		else if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		return true;
	}

	private static int apply(Character character, int val1, int val2) {
		switch (character) {
		case '+': {
			return val1 + val2;
		}
		case '-': {
			return val1 - val2;
		}
		case '*': {
			return val1 * val2;
		}
		case '/': {
			if (val2 == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return val1 / val2;
		}
		}
		return 0;
	}

}
