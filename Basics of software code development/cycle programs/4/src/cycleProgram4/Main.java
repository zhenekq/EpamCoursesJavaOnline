package cycleProgram4;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		BigInteger result  = BigInteger.valueOf(1);
		for(int i=1;i<=200;i++) {
			BigInteger helpValue  = BigInteger.valueOf(i*i);
			result = result.multiply(helpValue);
		}
		System.out.println(result);
	}

}
