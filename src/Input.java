import java.util.Scanner;

public class Input {
	public static int input_first(Scanner sc) {
		
		System.out.println("첫번째 값을 입력하세요 : ");
		int first = sc.nextInt(); 
		System.out.println(first);
		return first;		
	}
	
	public static String input_buho(Scanner sc) {
		System.out.println("사칙연산 값을 입력하세요 : ");
		String buho = sc.next();
		System.out.println(buho);
		return buho; 
	}
	
	public static int input_number(Scanner sc) {
		System.out.println("다음 값을 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println(number);		
		return number;
	} 
}
