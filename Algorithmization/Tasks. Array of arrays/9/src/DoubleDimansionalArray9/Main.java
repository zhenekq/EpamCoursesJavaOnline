package DoubleDimansionalArray9;

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
		int sum = 0;
		int indexOfColumn=0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=0;j<n;j++) {
				sum+=array[j][i];
			}
			System.out.print(sum+" ");
			if(sum>max) {
				max = sum;
				indexOfColumn = i;
			}
		}
		System.out.println();
		System.out.print(max+" "+indexOfColumn);
	}

}
