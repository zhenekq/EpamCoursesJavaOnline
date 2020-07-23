package linearProgram5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TimeInSeconds = sc.nextInt();
		int hours = TimeInSeconds / 3600;
		int minutes = (TimeInSeconds - hours * 3600)/60;
		int seconds = (TimeInSeconds - hours * 3600)- minutes * 60;
		System.out.println(hours+"ч "+minutes+"мин "+seconds+"c");
	}

}
