package OneDimensionalArray9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int n = sc.nextInt();
		int array[] = new int[n];
		int arrayOfPosCounters[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(array[i]==array[j]) {
					arrayOfPosCounters[i]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(arrayOfPosCounters[i]>max) {
				max = arrayOfPosCounters[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arrayOfPosCounters[i] == max && array[i]<min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

}
