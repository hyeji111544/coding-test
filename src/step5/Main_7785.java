package step5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main_7785 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		HashMap<String, String> stfMap = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			String stfs = sc.nextLine();
			String[] stf = stfs.split(" ");
			String name = stf[0];
			String record= stf[1];
			
			stfMap.put(name, record);
		}
		
		List<Map.Entry<String, String>> entryList = new ArrayList<>(stfMap.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				
				return o2.getKey().compareTo(o1.getKey());
			}
			
		});
		
		for(Map.Entry<String, String> entry : entryList) {
			if(entry.getValue().equals("enter")) {
				System.out.println(entry.getKey());
			}
		}
			
		sc.close();
	}
}
