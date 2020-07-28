package DoubleDimansionalArray6;

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
		array[n/2][n/2]=1;
		array[n/2][n/2-1]=1;
		int helpVarLeft = 0;
		int helpVarRight = n;
		for(int i=0;i<n;i++) {
			for(int j=helpVarLeft;j<helpVarRight;j++) {
					if(i!=n/2 || j!=n/2) {
					array[i][j] = 1;
					
					}
				}
			helpVarLeft++;
			helpVarRight--;
		}
		System.out.println(helpVarLeft+" "+helpVarRight);
		helpVarLeft = n/2-2;
		helpVarRight = n/2+2;
		
		for(int i=n/2+1;i<n;i++) {
			for(int j=helpVarLeft;j<helpVarRight;j++) {
				array[i][j]=1;
			}
			helpVarLeft--;
			helpVarRight++;
			
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(757575);
		
		
	}

}
