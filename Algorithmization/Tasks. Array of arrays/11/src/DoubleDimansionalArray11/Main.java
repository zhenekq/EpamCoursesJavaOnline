package DoubleDimansionalArray11;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		final int N = 10;
		final int M = 20;
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
		for(int i=0;i<N;i++) {
			sch=0;
			index=-1;
			for(int j=0;j<M;j++) {
				if(array[i][j]==5) {
					sch++;
				}
				if(sch>3) {
					index = i;
					System.out.println(index);
					break;
				}
			}
		}
		
		
	}

}
