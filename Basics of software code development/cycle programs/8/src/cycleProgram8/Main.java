package cycleProgram8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int helpVar = 0;
		int secondNumber = sc.nextInt();
		StringBuilder firstNumberString = new StringBuilder();
		StringBuilder secondNumberString = new StringBuilder();
		StringBuilder commonCharacters = new StringBuilder();
		
		while(firstNumber > 0) {
			firstNumberString.insert(0,firstNumber%10);
			firstNumber/=10;
		}
		while(secondNumber > 0) {
			secondNumberString.insert(0,secondNumber%10);
			secondNumber/=10;	
		}
		//System.out.println(firstNumberString.length()+" "+secondNumberString.length());
			for(int i=0;i<firstNumberString.length();i++) {
				for(int j=0;j<secondNumberString.length();j++) {
					if(firstNumberString.charAt(i) == secondNumberString.charAt(j)) {
						commonCharacters.append(firstNumberString.charAt(i));
						break;
					}
				}
			}
			for(int i=0;i<commonCharacters.length();i++) {
				for(int j=1;j<commonCharacters.length();j++) {
					if(commonCharacters.charAt(i)==commonCharacters.charAt(j)) {
						for(int i1 = i;i1<helpVar++;i1++) {
							commonCharacters.delete(i, i1);
						}
					}
				}
			}
			System.out.println(commonCharacters);
	}
}
