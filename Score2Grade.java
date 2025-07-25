import java.util.Scanner;

public class Score2Grade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		int number = score / 10;
		char grade;
		
		switch(number) {
		
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			case 5:
				grade ='E';
				break;
			default:
				grade = 'F';
				break;
				
		}
		System.out.println("학점: " + grade);

	}

}
