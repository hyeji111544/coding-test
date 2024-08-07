package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_27433 {
	static int input_num=1;
	static long result=1;
	public static long factorial(int s) {
		if(s==0) return 1;
		else if(input_num<=s){
			result*=input_num;
			System.out.println(input_num+" : " +result);
			input_num++;

			return factorial(s);
		}
		else return result;
		
	}
	public static void main(String[] args) throws IOException{
		// 재귀 : 팩토리얼 2 https://www.acmicpc.net/problem/27433

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(br.readLine());
	
	System.out.println(factorial(n));
	}

}
