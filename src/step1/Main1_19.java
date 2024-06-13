package step1;

import java.util.Scanner;

public class Main1_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] containers = input.split(" ");
		
		double s1 = Double.parseDouble(containers[0]); 
        double s2 = Double.parseDouble(containers[1]); 

	     if (s1 >= s2/2) {
	            System.out.println("E"); 
	        } else {
	            System.out.println("H"); 
	        }

	        sc.close();
		
	}

}
