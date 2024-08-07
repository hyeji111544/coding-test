package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_25501 {
	
	static int result;
	public static int recursion(String s, int l, int r){
		result++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    
    public static void main(String[] args)throws IOException{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		for(int i = 0 ; i<N; i++) {
			String testCase = reader.readLine();
			result = 0;
			int e = isPalindrome(testCase);
			System.out.println(e+" "+ result);
		}
    	
       
    }
	
}
