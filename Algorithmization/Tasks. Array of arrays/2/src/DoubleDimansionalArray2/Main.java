package DoubleDimansionalArray2;

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
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.println(array[i][j]+" ");
				}
			}
		}
		
	}

}
