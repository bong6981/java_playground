
public class Calculate {
	public static int calculate(int first, String buho, int number) {
		int result = 0;
		if ("+".equals(buho)) {
			result = first + number;
			return result;
		}
		else if ("-".equals(buho)) {
			result = first - number;
			return result;
		}
		else if ("*".equals(buho)) {
			result = first * number;
			return result;
		}
		else {
			result = first / number;
			return result;
			
		}
		
	}
}
