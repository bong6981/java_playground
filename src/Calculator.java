import java.util.Scanner; 

public class Calculator{
	static Scanner sc = new Scanner(System.in);	
	public static int input_first() {
		
		System.out.println("첫번째 값을 입력하세요 : ");
		int first = sc.nextInt(); 
		System.out.println(first);
		return first;		
	}
	
	public static String input_buho( ) {
		System.out.println("사칙연산 값을 입력하세요 : ");
		String buho = sc.next();
		System.out.println(buho);
		return buho; 
	}
	
	public static int input_number( ) {
		System.out.println("다음 값을 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println(number);		
		return number;
	}
	
	public static int calculate(int first, String buho, int number) {
		if ("+".equals(buho)) {
			int result = first + number;
			return result;
		}
		else if ("-".equals(buho)) {
			int result = first - number;
			return result;
		}
		else if ("*".equals(buho)) {
			int result = first * number;
			return result;
		}
		else {
			int result = first / number;
			return result;
		}
		
	}
	
	public static void output(int result) {
		System.out.println("결과값은" + result);
	}
	public static void main(String[] args) {
		int first = input_first();
		while(true) {
			String buho = input_buho();
			if ("quit".equals(buho)) {
				break;
			}
			int number = input_number();			
			int result = calculate(first, buho, number);
			output(result);
			first = result;
			
		}
	}
}