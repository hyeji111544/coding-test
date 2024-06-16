package step1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] containers = input.split(" ");
		
		BigInteger N = new BigInteger(containers[0]);
		BigInteger M = new BigInteger(containers[1]);
		
		BigInteger result = N.subtract(M).abs();
		System.out.println(result);
		
	    sc.close();
		
	}

}
