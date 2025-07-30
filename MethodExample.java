import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		printInt(num1);
		printInt(num2);
		
		int total = add(num1, num2);
		System.out.print("정수의 합: ");
		System.out.println(total);
		
		double ave = calcAverage(num1, num2);
		System.out.print("정수의 평균: ");
		System.out.println(ave);
	}
	
	public static void printInt(int x) {
		
		System.out.print("입력한 정수는 ");
		System.out.println(x + "입니다.");
		
	}
	
	public static int add(int x, int y) { //반환 값이 있어서 void 아니고 int
		
		return (x + y);
		
	}
	
	public static double calcAverage(int x, int y) {
		
		double rslt = (double)(x + y) / 2;
		
		return rslt;
	}

}
