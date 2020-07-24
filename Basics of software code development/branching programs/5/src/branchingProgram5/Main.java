package branchingProgram5;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double resultOfFunction;
		if(x <= 3) {
			resultOfFunction = x * x - 3 * x + 9;
		}else {
			resultOfFunction = 1/(Math.pow(x, 3) + 6);
		}
		System.out.println(resultOfFunction);
	}
	
}
