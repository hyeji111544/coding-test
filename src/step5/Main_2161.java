package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class Main_2161 {
	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			int N = Integer.parseInt(reader.readLine());
			String[] names = reader.readLine().split(" ");
			
			HashMap<String, Integer> nameList = new HashMap<String, Integer>();
			
			 for (String name : names) {
	                nameList.put(name, 0);
	         }
			
			for(int k = 0; k<N ; k++) {
				String[] counts = reader.readLine().split(" ");
	
				for(String key : counts) {
					nameList.put(key, nameList.getOrDefault(key, 0)+1);
				}
			}
			
			 List<Entry<String, Integer>> list = new ArrayList<>(nameList.entrySet());
	            
	            Collections.sort(list, new Comparator<Entry<String, Integer>>() {
	                @Override
	                public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) { 
	                    // 값이 같으면 이름 오름차순
	                	if(o1.getValue().equals(o2.getValue())) {
	                    	return o1.getKey().compareTo(o2.getKey());
	                    }
	                	// 값이 다른 경우 내림차순
	                    return o2.getValue().compareTo(o1.getValue());
	                }
	            });
			
	            for (Entry<String, Integer> entry : list) {
	            	writer.write(entry.getKey() + " " + entry.getValue() + "\n");
	            }
	            writer.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
