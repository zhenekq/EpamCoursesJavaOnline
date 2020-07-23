package linearProgram1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,z;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		z = ( (a - 3) * b / 2) + c;
		System.out.println(z);
	}
}
