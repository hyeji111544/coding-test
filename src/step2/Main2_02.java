package step2;
import java.util.Scanner;

public class Main2_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade;
		
		if(score==100) {
			grade = 'A'; //최대 점수를 100점으로 설정함
		}else if(score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);

	}

}

