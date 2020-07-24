package cycleProgram1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = 0;
		for(int i = 1;i <= number;i++) {
			result += i;
		}
		System.out.println(result);
	}

}
