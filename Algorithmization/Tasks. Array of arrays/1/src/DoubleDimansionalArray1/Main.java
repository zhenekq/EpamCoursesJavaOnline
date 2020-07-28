package DoubleDimansionalArray1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		/* Examples:
		 * 5 
		 * 6 2 3 4 5 
		 * 2 3 4 5 6 
		 * 2 3 4 0 1 
		 * 2 4 4 -1 -1
		 * */
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				if(j%2 != 0 && array[0][j] > array[n-1][j]) {
					//גûגמה סעמכבצמל
					System.out.print(array[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
