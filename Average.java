package Lambda;

import java.util.*;
import java.util.stream.IntStream;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array");
		int n = sc.nextInt();
		System.out.println("Enter the array values");
		ArrayList<Integer> array = new ArrayList<Integer>();
		int i, x, sum = 0;
		double avg;
		for(i = 0; i < n; i++) {
			x = sc.nextInt();
			array.add(x);
		}
		sum = total(array, null);
		avg = sum/n;
		System.out.println("Average of the array is : " + avg);
	}
	public static int total(List<Integer> array, IntStream in) {
		
		return array.stream().mapToInt(a -> a).sum();
		
	}
}
