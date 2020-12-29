package calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		String input = sc.nextLine();
		String[] input_array = input.split(" "); 
		int x = Integer.parseInt(input_array[0]);
		int y = Integer.parseInt(input_array[1]);
		int result = x + y;
		System.out.println("두 수의 합은" + result + "입니다");
	}
}
