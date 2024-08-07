package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_4779 {
	static StringBuilder sb;
	
	public static void recursion(int start, int length) {
		if(length==1) {
			return;
		}
		int middle = length/3;
		for(int i = start+middle; i<start+2*middle; i++) {
			sb.setCharAt(i, ' ');;
		}
		
		recursion(start, middle);
		recursion(start+2*middle, middle);
	}
    
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
		while(true) {
			String number = br.readLine();
			if (number == null || number.trim().isEmpty()) {
                break;
			}
			sb = new StringBuilder();
			int length = (int) Math.pow(3, Integer.parseInt(number));

	    	
			for(int i = 0; i<length; i++) {
				sb.append('-');
			}
			recursion(0, length);
			bw.write(sb.toString()+'\n');
			bw.flush(); 
			
		}
       
    }
	
}
