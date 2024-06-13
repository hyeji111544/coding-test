package step1;

import java.util.Scanner;

public class Main1_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] containers = input.split(" ");
		
		int a = Integer.parseInt(containers[0]);
		int b = Integer.parseInt(containers[1]);
		int c = Integer.parseInt(containers[2]);
		int d = Integer.parseInt(containers[3]);
		int e = Integer.parseInt(containers[4]);
		int f = Integer.parseInt(containers[5]);
		
		int sum = a*5 + b*5 + c*5 + d*5 + e*5 + f*5;
		
		System.out.println(sum);
		
	}

}
