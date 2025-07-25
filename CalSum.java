import java.util.Scanner;

public class CalSum {

	public static void main(String[] args) {
		
		/*
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			
			sum += i;
			i++;
			
		}
		System.out.println("합계=" + sum);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오:");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= num) {
			sum += i;
			System.out.print(i);
			if (i != num) {
                System.out.print(" + ");
            }
			i++;
		}
		System.out.println(" = " + sum);
		
		sc.close();
		
	}

}
