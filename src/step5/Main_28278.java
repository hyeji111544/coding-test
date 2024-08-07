package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_28278 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<n; i++) {
			String k = br.readLine();
			String[] list = k.split(" ");
			String command = list[0];
		
			switch(command) {
				case "1" : {
					st.push(Integer.parseInt(list[1]));
					break;
				}
				case "2" : {
					if(st.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(st.pop()).append("\n");
					}
					break;
				}
				case "3" : {
					sb.append(st.size()).append("\n");
					break;
				}
				
				case "4" : {
					if(st.isEmpty()) {
						sb.append("1\n");
					}else {
						sb.append("0\n");
					}
					break;
				}
				case "5" : {
					if(st.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(st.peek()).append("\n");
					}
					break;
				}
			}
		}
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}

}
