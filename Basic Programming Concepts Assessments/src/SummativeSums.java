
public class SummativeSums {
	public static int addArrays(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		
		return sum;
	}
	
	public static void main (String[] args) {
		int[] practice1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int[] practice2 = { 999, -60, -77, 14, 160, 301 };
		int[] practice3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
		140, 150, 160, 170, 180, 190, 200, -99 };
		
		int sum1, sum2, sum3;
		sum1 = addArrays(practice1);
		sum2 = addArrays(practice2);
		sum3 = addArrays(practice3);
		
		System.out.println("#1 Array Sum: " + sum1);
		System.out.println("#2 Array Sum: " + sum2);
		System.out.println("#3 Array Sum: " + sum3);
	}
}
