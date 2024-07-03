package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3_13 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			int n = Integer.parseInt(br.readLine());
			
			for(int i=0; i<n ; i++) {
				String[] input = br.readLine().split(" ");
				
				int count = Integer.parseInt(input[0]);
				String text = input[1];
				
				StringBuilder sb = new StringBuilder();
				for(int j=0; j<text.length(); j++) {
					for(int k=0; k<count; k++) {
						sb.append(text.charAt(j));
					}
					
				}
				System.out.println(sb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
