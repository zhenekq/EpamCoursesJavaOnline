package OneDimensionalArray4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		int indexOfMax=0;
		int indexOfMin=0;
		double helpVarToSwap;
		double array[] = new double[n];
		
		for(int i=0;i<n;i++) {
			array[i] = sc.nextDouble();
			if(array[i]>max) {
				max = array[i];
				indexOfMax = i;
			}
			if(array[i]<min) {
				min = array[i];
				indexOfMin = i;
			}
		}
		helpVarToSwap = array[indexOfMax];
		array[indexOfMax] = array[indexOfMin];
		array[indexOfMin] = helpVarToSwap;
		
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n"+max+" "+min);
	}
}
