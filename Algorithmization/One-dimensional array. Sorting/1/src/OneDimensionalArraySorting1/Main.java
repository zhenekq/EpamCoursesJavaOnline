package OneDimensionalArraySorting1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX_SIZE = 100;
		System.out.print("Enter the size of 1st array: ");
		int n = sc.nextInt();
		System.out.print("Enter the size of 2nd array: ");
		int m = sc.nextInt();
		int fullSizeOfArray = n + m;
		int mainFirstArray[] = new int[MAX_SIZE];
		int secondArray[] = new int[MAX_SIZE];
		System.out.println("Enter " + n + " elements of first array: ");
		for(int i=0;i<n;i++) {
			mainFirstArray[i]=sc.nextInt();
		}
		System.out.println("First array: ");
		for(int i=0;i<n;i++) {
			System.out.print(mainFirstArray[i]+" ");
		}
		System.out.println("\nEnter " + m + " elements of second array: ");
		for(int i=0;i<m;i++) {
			secondArray[i] = sc.nextInt();
		}
		System.out.println("Second array: ");
		for(int i=0;i<m;i++) {
			System.out.print(secondArray[i]+" ");
		}
		System.out.print("\nEnter the k-number: ");
		int k = sc.nextInt();
		for(int i=0;i<m;i++) {
			n++;
			for(int j=n+1;j>k+1+i;j--) {
				mainFirstArray[j]=mainFirstArray[j-1];
				mainFirstArray[k+i] = secondArray[i];
			}
		}
		System.out.println("New Array: ");
		for(int i=0;i<n;i++) {
			System.out.print(mainFirstArray[i]+" ");
		}
		
	}

}
