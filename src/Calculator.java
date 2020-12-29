import java.util.Scanner; 

public class Calculator{
	
	static int first = 0;
	static int number = 0;
	static String buho = " ";
	static int result = 0; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] input = str.split(" ");
	 
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				first = Integer.parseInt(input[i]);
			} else if (i%2 == 1) {
				buho = input[i];
			} else {
				number = Integer.parseInt(input[i]);
				if("+".equals(buho)) {
					result = first + number;
					System.out.println("결과값은" + result);
				}else if("-".equals(buho)) {
					result = first - number;
					System.out.println("결과값은" + result);
				}else if("*".equals(buho)) {
					result = first * number;
					System.out.println("결과값은" + result);
				}else {
					result = first / number;
					System.out.println("결과값은" + result);
				}
				first = result; 
			}
		
				
		}
		
	}
}