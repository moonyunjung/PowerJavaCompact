import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달의 이름을 입력하시오: ");
		String month = sc.next();
		
		int monthNum = 0;
		switch(month) {
		
			case "january":
				monthNum = 1;
				break;
			case "feburary":
				monthNum = 2;
				break;
			case "march":
				monthNum = 3;
				break;
			case "april":
				monthNum = 4;
				break;
			case "may":
				monthNum = 5;
				break;
			case "june":
				monthNum = 6;
				break;
			case "july":
				monthNum = 7;
				break;
			case "august":
				monthNum = 8;
				break;
			case "september":
				monthNum = 9;
				break;
			case "october":
				monthNum = 10;
				break;
			case "november":
				monthNum = 11;
				break;
			case "december":
				monthNum = 12;
				break;
			default:
				System.out.println("정확한 달을 입력해 주세요.");
				return; //마지막에 출력메시지와 함께 0이 찍히는 문제 해결
		}
		
		System.out.print(monthNum);

	}

}
