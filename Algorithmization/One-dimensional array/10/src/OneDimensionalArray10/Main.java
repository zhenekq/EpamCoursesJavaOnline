package OneDimensionalArray10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
			if(i%2==0) {
				array[i]=0;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
