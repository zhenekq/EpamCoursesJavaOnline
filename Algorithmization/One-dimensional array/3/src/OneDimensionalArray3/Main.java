package OneDimensionalArray3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int positive = 0;
		int negative = 0;
		int zero = 0;
		double array[] = new double[n];
		
		for(int i=0;i<n;i++) {
			array[i] = sc.nextDouble();
			if(array[i] > 0) {
				positive++;
			}else if(array[i] < 0) {
				negative++;
			}else {
				zero++;
			}
		}
		System.out.println(positive+"\n"+negative+"\n"+zero);
	}

}
