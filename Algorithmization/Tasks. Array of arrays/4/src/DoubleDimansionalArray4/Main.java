package DoubleDimansionalArray4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int array[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			
			int rightEve = 1;
			int antiRightEve = n;
			
			for(int j=0;j<n;j++) {
				if(i%2==0) {
					array[i][j]=rightEve;
					rightEve++;
				}else {
					array[i][j]=antiRightEve;
					antiRightEve--;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
