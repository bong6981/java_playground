import java.util.Scanner; 

public class Calculator{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요 : ");
		int first = sc.nextInt(); 
		System.out.println(first);
		
		
		//파이썬에서는 True, False를 대문자로 썼는데, java에서는 true로 쓴다 
		while(true) {
			System.out.println("사칙연산 값을 입력하세요 : ");
			String buho = sc.next();
			System.out.println(buho);
			if ("quit".equals(buho)) {
				break;
			}
			System.out.println("다음 값을 입력하세요 : ");
			int number = sc.nextInt();
			System.out.println(number);
			if ("+".equals(buho)) {
				first = first + number;
				System.out.println(first);
			}
			else if ("-".equals(buho)) {
				first = first - number;
				System.out.println(first);
			}
			else if ("*".equals(buho)) {
				first = first * number;
				System.out.println(first);
			}
			else {
				first = first / number;
				System.out.println(first);
			}
			
			
		}
	}
}