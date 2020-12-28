import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] input_array = input.split("");
		if ("+".equals(input_array[1])) {
			double x = Double.parseDouble(input_array[0]);
			double y = Double.parseDouble(input_array[2]);
			double result = x + y;
			System.out.println(input_array[0] + "+" + input_array[2] + "=" + result);
		// 파이썬에서는 if elif else를 썼는데 java는 if, else if, else를 사용한다 
		} else if ("-".equals(input_array[1])) {
			double x = Double.parseDouble(input_array[0]);
			double y = Double.parseDouble(input_array[2]);
			double result = x - y;
			System.out.println(input_array[0] + "-" + input_array[2] + "=" + result);
		} else if ("*".equals(input_array[1])) {
			double x = Double.parseDouble(input_array[0]);
			double y = Double.parseDouble(input_array[2]);
			double result = x * y;
			System.out.println(input_array[0] + "*" + input_array[2] + "=" + result);
		} else {
			double x = Double.parseDouble(input_array[0]);
			double y = Double.parseDouble(input_array[2]);
			double result = x / y;
			System.out.println(input_array[0] + "/" + input_array[2] + "=" + result);
		} 
				
	}

}

