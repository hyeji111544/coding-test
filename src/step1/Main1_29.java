package step1;

import java.util.Scanner;

public class Main1_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Boolean[] nums = new Boolean[31]; 
		
		for(int i =1; i<=30; i++) {
			nums[i]= false;
		}
		
		for(int i =0 ; i<28; i++) {
			int num = sc.nextInt();
			nums[num] = true;
		}
		
		for(int i =1; i<=30; i++) {
			if(!nums[i]) {
				System.out.println(i);
			}
		}
		
	}

}
