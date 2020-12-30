package gugudan;

	public class Gugudan {
		public static int[] calculate(int dan, int times) {
			int[] result = new int[times];
			for(int i=0; i<(times); i++) {
				result[i] = dan * (i+1);
			}
			return result;
		}
	}