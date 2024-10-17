import java.util.*;
public class Calculator {
	public static void main(String[] args)
	{
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("Enter operator (+,-,*,/):");
		char op = sc.next().charAt(0);
		double o = 0;
		switch (op) {
		case '+':
			o = num1 + num2;
			break;
		case '-':
			o = num1 - num2;
			break;
		case '*':
			o = num1 * num2;
			break;
		case '/':
			o = num1 / num2;
			break;
		}
		System.out.println("result:");
		System.out.println();
		System.out.println(num1 + " " + op + " " + num2
						+ " = " + o);
	}
}