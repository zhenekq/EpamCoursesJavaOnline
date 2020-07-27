package cycleProgram2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		
		int resultOfFunction = 0;
		
		for(int i = a;i <= b;i += h) {
			if(i>2) {
				resultOfFunction = i;
			}else {
				resultOfFunction = i;
			}
		}
		System.out.println(resultOfFunction);
	}

}
