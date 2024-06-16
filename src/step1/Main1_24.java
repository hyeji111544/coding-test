package step1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] containers = input.split(" ");
		
		BigInteger a = new BigInteger(containers[0]);
		BigInteger b = new BigInteger(containers[1]);
		BigInteger x = a.add(b);
		
		BigInteger y = a.subtract(b);
		
		System.out.println(x.multiply(y));
	    sc.close();
		
	}

}
