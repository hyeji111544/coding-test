package step5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main_20124 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		HashMap<String, Integer> stfMap = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			String stfs = sc.nextLine();
			String[] stf = stfs.split(" ");
			String name = stf[0];
			Integer record= Integer.parseInt(stf[1]);
			
			stfMap.put(name, record);
		}
		
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(stfMap.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		
		String nameKey = null;
		int score = 0;
		
		for(Map.Entry<String, Integer> entry : entryList) {
			
		
			if(score <entry.getValue()) {
				nameKey = entry.getKey();
				score = entry.getValue();		
			}
				
		}
		System.out.println(nameKey);
		
		sc.close();
	}
}
