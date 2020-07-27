package OneDimensionalArray2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		int sch = 0;
		double array[] = new double[n];
		
		for(int i=0;i<n;i++) {
			array[i] = sc.nextDouble();
			if(array[i]>z) {
				array[i] = z;
				sch++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n"+sch);

	}

}
