package step1;

import java.util.Scanner;

public class Main1_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {

			 for (int j = input - i; j > 0; j--) {
	                System.out.print(" ");
	         }
			 for (int k = 0; k < i; k++) {
	                System.out.print("*");
	         }
			 
			 System.out.println();
		}
		
	    sc.close();
		
	}

}
