package step5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_28417 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int maxScore = 0;
	
		for(int i=0; i<N; i++) {
			String input = sc.nextLine();
			String[] split = input.split(" ");
			
			List<Integer> runList = new ArrayList<>();
			List<Integer> trickList = new ArrayList<>();
			
			runList.add(Integer.parseInt(split[0]));
            runList.add(Integer.parseInt(split[1]));

		
            for (int j = 2; j < split.length && j <= 6; j++) {
                trickList.add(Integer.parseInt(split[j]));
            }
            
            Collections.sort(runList, Collections.reverseOrder());
        	Collections.sort(trickList, Collections.reverseOrder());
        	
        	Integer score = runList.get(0)+trickList.get(0)+trickList.get(1);
        	
        	if(score > maxScore) {
        		maxScore = score;
        	}
    	
		}
		System.out.println(maxScore);
		
		sc.close();
	}
}
