package step1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());

		BigInteger sum = a.add(b);
		
		System.out.println(sum);

	}
	
}
