package step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_25325 {
	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(reader.readLine());
			
			Queue<Integer> queue = new LinkedList<>();
			
			for(int m =1; m<=N ; m++) {
				queue.offer(m);
			}
			
			StringBuilder sb = new StringBuilder();
			
			while(!queue.isEmpty()) {
			
				sb.append(queue.poll()).append(" ");
				
				if(!queue.isEmpty()) {
					queue.offer(queue.poll());
				}
			}
			
			System.out.println(sb.toString().trim());
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
