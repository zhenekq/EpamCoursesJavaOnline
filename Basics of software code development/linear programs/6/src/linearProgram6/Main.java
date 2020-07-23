package linearProgram6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(y==-1 && x==0) {
			System.out.println("Do not exist");
		}else if(x >= -4 && x <= 4 && y <= 0 && y >= -3) {
			System.out.println("Point exist");
		}else if(x >= -2 && x <= 2 && y <= 4 && y >= 0) {
			System.out.println("Point exist");
		}else {
			System.out.println("Do not exist");
		}
	}

}
