package DoubleDimansionalArray3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int p = sc.nextInt();
		
		int array[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[k][i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(array[i][p]+" ");
		}
	}

}
