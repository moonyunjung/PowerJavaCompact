//중괄호를 적절하게 이용하여 프로그램의 모호성을 줄인다.
import java.util.Scanner;

public class JavaProgrammingTip02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		/*
		if (score > 80) {
			if(score > 90)
				System.out.println("당신의 학점은 A입니다.");
			else
				System.out.println("당신의 학점은 B입니다."); //가장 가까운 if와 묶임
		}
		*/
		/*
		if(score > 80) {
			
			if(score > 90) {
				
				System.out.println("당신의 학점은 A입니다.");
				
			}else {
				
				System.out.println("당신의 학점은 B입니다.");
				
			}
		}
		*/
		if(score > 80) {
			
			if(score > 90) {
				
				System.out.println("당신의 학점은 A입니다.");
				
			}
		}else {
				
				System.out.println("당신의 학점은 B입니다.");
				
		}
		
	}

}
