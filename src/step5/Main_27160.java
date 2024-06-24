package step5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_27160 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//sc.nextLine();
		
		Map<String, Integer> fruitCount  = new HashMap<>();
	        
		for(int i=0; i<N; i++) {
			String cards= sc.nextLine();
			String[] card = cards.split(" ");
			String fruit = card[0];
			int count = Integer.parseInt(card[1]);
			
			fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0)+count);
			
		}
		
		boolean strawberry = fruitCount.getOrDefault("STRAWBERRY", 0) == 5;
		boolean banana = fruitCount.getOrDefault("BANANA", 0) == 5;
		boolean lime = fruitCount.getOrDefault("LIME", 0) == 5;
		boolean plum = fruitCount.getOrDefault("PLUM", 0) == 5;
		
		if(strawberry || banana || lime || plum) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
		sc.close();
	}
}
