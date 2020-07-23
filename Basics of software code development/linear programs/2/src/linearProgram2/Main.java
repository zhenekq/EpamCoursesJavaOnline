package linearProgram2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,answer;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		answer = (((b + Math.sqrt(b * b + 4 * a * c))/(2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2)); 
		System.out.println(answer);
	}
}
