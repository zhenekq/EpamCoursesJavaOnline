package DoubleDimansionalArray7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double array[][] = new double[n][n];
		int sch = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]= Math.sin((i*i-j*j)/(n));
				if(array[i][j]>0.0) {
					sch++;
				}
			}
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
