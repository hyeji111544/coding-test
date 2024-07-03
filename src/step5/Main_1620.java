package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main_1620 {
public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] input = reader.readLine().split(" ");
			
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);
			
			HashMap<String, Integer> nameList = new HashMap<String, Integer>();
			HashMap<Integer, String> keyList = new HashMap<Integer, String>();
			
			 for (int i =0; i<N; i++) {
				 String name = reader.readLine();
	                nameList.put(name, i+1);
	                keyList.put(i+1, name);
	         }

			 
			for(int k = 0; k<M ; k++) {
				String q = reader.readLine();
				if(nameList.containsKey(q)) {
					writer.write(String.valueOf(nameList.get(q))+"\n");
				}else {
					writer.write(String.valueOf(keyList.get(Integer.parseInt(q))+"\n"));
				}
			}
			
			
	        writer.flush();
	        writer.close();
	        reader.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}