package linearProgram4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		int integerPartOfNumber = (int)R;
		double doublePartOfNumber = ((R - integerPartOfNumber) * 1000);
		int doublePartOfNumberIntegerValue = (int)doublePartOfNumber;
		System.out.println(doublePartOfNumberIntegerValue + "," + integerPartOfNumber);
	}

}
