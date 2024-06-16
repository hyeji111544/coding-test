package step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1_22 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int c = sc.nextInt();
	        sc.nextLine();
	        
	        List<String> results = new ArrayList<>(); 

	        for (int i = 0; i < c; i++) {
	            int n = sc.nextInt();
	            StringBuilder result = new StringBuilder();
	            result.append("Pairs for ").append(n).append(": ");
	            boolean first = true;

	            for (int a = 1; a < n; a++) {
	                int b = n - a;
	                if (a < b) {
	                    if (!first) {
	                        result.append(", ");
	                    }
	                    result.append(a).append(" ").append(b);
	                    first = false;
	                }
	            }
	            results.add(result.toString()); 
	        }

	        sc.close(); 
	        
	        for (String result : results) {
	            System.out.println(result);
	        }
	    }
}
