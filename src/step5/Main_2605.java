package step5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i =0; i< n; i++) {
			int k= sc.nextInt();
			list.add(i-k, i+1);		
		}
		
		for(int m : list) {
			System.out.print(m + " ");
		}
	}
}
