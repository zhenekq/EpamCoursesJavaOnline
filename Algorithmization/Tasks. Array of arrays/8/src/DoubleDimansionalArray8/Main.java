package DoubleDimansionalArray8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[][] = new int[n][n];
		int sch = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		int firstColumn = sc.nextInt();
		int secondColumn = sc.nextInt();
		int helpVar;
			for(int j=0;j<n;j++) {
				helpVar = array[j][firstColumn];
				array[j][firstColumn] = array[j][secondColumn];
				array[j][secondColumn] = helpVar;
			}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(sch);
	}

}
