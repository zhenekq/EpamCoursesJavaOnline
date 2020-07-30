package DoubleDimansionalArray13;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		final int N = 5;
		final int M = 5;
		int array[][] = new int[N][M];
		int sch = 0;
		int index=-1;
		Random random = new Random();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				array[i][j]=random.nextInt(16);
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nFrom less, to huge:");
		for(int i=0;i<N;i++) {
			for(int j=M-1;j>0;j--) {
				for(int z = 0;z<j;z++) {
					if(array[z][i]>array[z+1][i]) {
						int helpVar = array[z][i];
						array[z][i]=array[z+1][i];
						array[z+1][i]=helpVar;
					}
				}
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nFrom huge, to less:");
		for(int i=0;i<N;i++) {
			for(int j=M-1;j>0;j--) {
				for(int z = 0;z<j;z++) {
					if(array[z][i]<array[z+1][i]) {
						int helpVar = array[z][i];
						array[z][i]=array[z+1][i];
						array[z+1][i]=helpVar;
					}
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
