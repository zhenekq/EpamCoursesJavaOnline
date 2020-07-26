package cycleProgram7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = m; i <= n;i++) {
			System.out.print("deliteli "+ i +" - ");
			for(int j=2; j < i;j++) {
				if(i%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}
