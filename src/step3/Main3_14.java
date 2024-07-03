package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3_14 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			
				String input = br.readLine();
				for(int j=0; j<input.length(); j++) {
					sum += Character.getNumericValue(input.charAt(j));
				}	
			
			System.out.println(sum);
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
