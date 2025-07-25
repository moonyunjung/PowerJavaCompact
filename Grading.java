import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		
		System.out.print("학점 ");
		if(score >= 90) {
			
			System.out.println("A");
			
		}else if(score >= 80 && score < 90) { //else if(score >= 80 && score < 90라고 할 필요가 없음. grade 90보다 크거나 같은 경우에는 앞의 문장에서이미 걸렸기 때
			
			System.out.println("B");
			
		}else if(score >= 70 ){ // && score < 80) 같은이유로 필요없음
			
			System.out.println("C");
			
		}
		
	}

}
