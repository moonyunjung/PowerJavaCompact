import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시요:");
		int num = sc.nextInt();
		
		int i;
		long fac = 1; //팩토리얼의 값은 생각보다 아주 커짐 int로 못담음
		for(i = 1; i <= num; i++) {
			
			fac *= i;
			
		}
		System.out.print(num + "!은" + fac + "입니다.");
		
		sc.close();
		
	}

}
