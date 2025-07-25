import java.util.*;

public class RockPaperScissor {
	
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user = sc.nextInt();
		
		int com = (int)(Math.random() * 3);
		if(user == com) {
			
			System.out.print("인간과 컴퓨터가 비김.");
			
		} else if(user == (com +1) % 3) {
			
			System.out.println("인간: " + user + " 컴퓨터: " + com + " 인간 승리 ");
			
		}else {
			
			System.out.println("인간: " + user + " 컴퓨터: " + com + " 컴퓨터 승리 ");
			
		}
		
	}

}
