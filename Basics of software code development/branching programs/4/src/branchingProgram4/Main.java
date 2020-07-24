package branchingProgram4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x <= A && y<= B) {
			System.out.println("Brick will pass");
		}else {
			System.out.println("Brick will not pass");
		}
		
	}

}
