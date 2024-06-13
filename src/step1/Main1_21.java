package step1;

import java.util.Scanner;

public class Main1_21 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] scores = new int[5]; 

	    
	        for (int i = 0; i < 5; i++) {
	            scores[i] = sc.nextInt();
	        }


	        int sum = 0;
	        for (int score : scores) {
	            sum += Math.max(score, 40); // 40 미만인 점수는 40으로 고정하여 더함
	        }
	        int average = sum / 5;
	        System.out.println(average); 

	        sc.close();
	    }
}
