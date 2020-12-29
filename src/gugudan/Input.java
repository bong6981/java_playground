package gugudan;
import java.util.Scanner;

public class Input {
	public static String[] input(Scanner sc) {
		System.out.println("출력하고 싶은 단과 몇번까지 곱할지? : ");
		String input = sc.next();
		String[] input_array = input.split(",");

		return input_array;
		
	}

}
