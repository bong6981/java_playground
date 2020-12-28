

public class Gugudan {
	
	public static int[] inarray(int times) {
		int[] array = new int[9];
		for(int i=0; i<9; i++) {
			array[i] = (i + 1) * times; 
		}
		return array;		
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	

}
