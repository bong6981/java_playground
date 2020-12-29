package gugudan;

public class Gugudan {
	
	public static void print(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] calculate(int dan, int number) {
		int[] array = new int[number];
		for(int j=0; j< number; j++) {
			array[j] = dan * (j+1);
			}
		return array;
	}
		
}	
	

