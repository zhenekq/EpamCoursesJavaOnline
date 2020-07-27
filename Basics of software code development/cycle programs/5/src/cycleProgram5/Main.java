package cycleProgram5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double e = sc.nextDouble();
		double a=2;
		double sum = 0;
		for(int i=1; a>=e;i++) {
			a=0;
			a+=((1)/(Math.pow(2, i))) + ((1)/(Math.pow(3, i)));
			sum+=a;
			System.out.println(a);
		}
		System.out.println(sum);
		
		
	}

}
