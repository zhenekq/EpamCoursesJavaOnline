package DoubleDimansionalArray5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int array[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=0;
			}
		}
		int helpVal = n;
		for(int i=0;i<n;i++) {
			int var = 1;
			for(int j=0;j<helpVal;j++) {
				array[j][i] = var;
				var++;
			}
			helpVal--;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
