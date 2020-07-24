package branchinProgram3;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		if(((x1-x3) * (y2-y3) - (x2-x3) * (y1-y3)) == 0) {
			System.out.println("Exist on same line");
		}else {
			System.out.println("Do not exist on same line");
		}
	}

}
