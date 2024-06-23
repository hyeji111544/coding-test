package step5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_31562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] containers = input.split(" ");
		
		int N = Integer.parseInt(containers[0]);
		int M = Integer.parseInt(containers[1]);
		
		Map<String, String> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			String music = sc.nextLine();
			String[] c = music.split(" ");
			String title = c[1];
			String code = c[2]+c[3]+c[4]+c[5]+c[6]+c[7];
			map.put(code, title);
		}
		
		for(int t=0; t<M; t++) {
			String q = sc.nextLine();
			String[] qq = q.split(" ");
			String splitedQ = qq[0]+qq[1]+qq[2];
			int count = 0;
			String result = null;
			
			for(String key : map.keySet()) {
				if(key.startsWith(splitedQ)) {
					count++;
					result = map.get(key);
				}
			}
			
			if(count ==1) {
				System.out.println(result);
			}else if(count > 1) {
				System.out.println("?");
			}else {
				System.out.println("!");
			}
		}
		sc.close();
	}
}
