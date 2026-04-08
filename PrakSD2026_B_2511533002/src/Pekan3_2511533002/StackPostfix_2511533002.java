package Pekan3_2511533002;
import java.util.Scanner;
import java.util.Stack;
public class StackPostfix_2511533002 {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input_2511533002 = new Scanner(expression);
		while (input_2511533002.hasNext()) {
			if(input_2511533002.hasNextInt()) {// an operator (integer)
				s.push(input_2511533002.nextInt());
			}else {// an operator
				String operator_2511533002 = input_2511533002.next();
				int operatorand2_2511533002 = s.pop();
				int operatorand1_2511533002 = s.pop();
				if (operator_2511533002.equals("+")) {
					s.push(operatorand1_2511533002 + operatorand2_2511533002);
				}else if(operator_2511533002.equals("-")) {
					s.push(operatorand1_2511533002 + operatorand2_2511533002);
				}else if(operator_2511533002.equals("*")) {
					s.push(operatorand1_2511533002 * operatorand2_2511533002);
				}else {
					s.push(operatorand1_2511533002 / operatorand2_2511533002);
				}
			}
		}
		input_2511533002.close();
		return s.pop();
	}
	public static void main(String[] Args) {
		System.out.println("hasil postfix = "+postfixEvaluate("5 2 4 * + 7 -"));
	}
}
