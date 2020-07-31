package DoubleDimansionalArray14;

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
				array[j][i]=0;
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		int randomIndex = 0;
		int arrayOfIndexes[] = new int[N];
		int varN = N;
		System.out.println();
		for(int i=0;i<N;i++) {
			int counter = 0;
			for(int j=0;j<M;j++) {
				if(counter==i) {
					break;
				}
				randomIndex = random.nextInt(varN);
				if(array[randomIndex][i] == 1 && randomIndex!=N-1 && randomIndex!=0 && array[randomIndex+1][i]!=1) {
					array[randomIndex+1][i]=1;
				}else if(array[randomIndex][i] == 1 && randomIndex!=N-1 && randomIndex!=0 && array[randomIndex-1][i]!=1) {
				array[randomIndex-1][i] = 1;
				}else {
					array[randomIndex][i] = 1;
				}
				counter++;
				System.out.print(randomIndex+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
