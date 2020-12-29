package gugudan;
import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input_array = Input.input(sc);
		int dan = Integer.parseInt(input_array[0]);
		int number = Integer.parseInt(input_array[1]);
		for(int i=2; i <= dan; i++) {
			int[] array =Gugudan.calculate(i, number); 
			Print.print(array);
			
		}
		
	}

}
