package DoubleDimansionalArray15;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		final int N = 5;
		final int M = 5;
		int array[][] = new int[N][M];
		int max = Integer.MIN_VALUE;
		Random random = new Random();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				array[j][i]=random.nextInt(15);
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(array[i][j]>max) {
					max=array[i][j];
				}
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n"+max+"\n");
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(array[i][j]%2!=0) {
					array[i][j]=max;
				}
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
