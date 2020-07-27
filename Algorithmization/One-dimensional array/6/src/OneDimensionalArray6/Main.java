package OneDimensionalArray6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum=0;
		double  array[] = new double[n];
		
		for(int i=0;i<n;i++) {
			array[i] = sc.nextDouble();
			if(simpleNumber(i)) {
				sum+=array[i];
			}
		}
		System.out.println(sum);
	}
	
	static boolean simpleNumber(int value) {
		if(value < 2) {
			return false;
		}
		for(int i = 2;i * i <= value;i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
}
