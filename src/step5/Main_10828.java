package step5;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_10828 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int N = Integer.parseInt(reader.readLine());
			
			Stack<Integer> stack = new Stack<>();
			
			for(int i=0; i<N; i++) {
				String input = reader.readLine();
				String[] stackList = input.split(" ");
				String name = stackList[0];
				switch (name) {
					case "push": {
						Integer num= Integer.parseInt(stackList[1]);
						stack.push(num);
						break;
					}
					case "pop":{	
						if(stack.isEmpty()) {
							writer.write(String.valueOf(-1)+ "\n");
						}else {
							writer.write(String.valueOf(stack.pop()) + "\n");
						}
						break;
					}
					case "size" : {
						writer.write(String.valueOf(stack.size()) + "\n");
						break;
					}
					case "empty" : {
						if(stack.isEmpty()) {
							writer.write(String.valueOf(1) + "\n");
						}else {
							writer.write(String.valueOf(0) + "\n");
						}
						break;
					}
					case "top" : {
						if(stack.isEmpty()) {
							writer.write(String.valueOf(-1) + "\n");
						}else {
							writer.write(String.valueOf(stack.peek()) + "\n");
						}
						break;
					}
				}

			}
			
			writer.flush();
			writer.close();
			reader.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
