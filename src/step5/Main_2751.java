package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_2751 {
	public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(reader.readLine());
            List<Integer> list = new ArrayList<>();
            
            for(int i = 0; i < N; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            
            Collections.sort(list);
        
            StringBuilder sb = new StringBuilder();
            
            for(int k : list) {
               sb.append(k).append('\n');
            }
            
         System.out.println(sb.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
