package step1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());

		BigInteger sum = a.multiply(b);
		System.out.println(sum);
		
	}

}
