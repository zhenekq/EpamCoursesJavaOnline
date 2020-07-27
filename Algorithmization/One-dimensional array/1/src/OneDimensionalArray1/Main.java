package OneDimensionalArray1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int resultSum = 0;
		int array[] = new int[n];
		
		for(int i = 0;i < n;i++) {
			array[i] = sc.nextInt();
			if(array[i] % k == 0) {
				resultSum+=array[i];
			}
		}
		System.out.println(resultSum);
	}

}
