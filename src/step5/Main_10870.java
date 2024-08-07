package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_10870 {
	static int count=0;
	static int result1=0;
	static int result2=1;
	static int result3;
	public static int fibo(int s) {
		if(s==0) return 0;
		else if(count<=s){
			result3 = result1;
			result1 = result2;
			result2 += result3;
			
			System.out.println(count+" : " +result3);
			count++;

			return fibo(s);
		}
		else return result3;
		
	}
	public static void main(String[] args) throws IOException{
		// 재귀 : =  피보나치 https://www.acmicpc.net/problem/10870

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(br.readLine());
	
	System.out.println(fibo(n));
	}

}
