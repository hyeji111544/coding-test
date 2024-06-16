package step1;

import java.util.Scanner;

public class Main1_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] containers = input.split(" ");
		
		int sum = 0;
		
		for(int i = 0; i<containers.length; i++) {
			int num = Integer.parseInt(containers[i]);
			sum += num*num;
		}
		
		System.out.println(sum%10);
		
	    sc.close();
		
	}

}
