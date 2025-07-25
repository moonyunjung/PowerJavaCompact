import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
		int num = sc.nextInt();
		
		int i = 1;
		while(i < 10) {
			
			int result = num * i;
			System.out.println(num + "*" + i + "=" + result );
			i++;
			
		}

		sc.close(); //스캐너 닫아주기! 주의표시 없어짐
		
	}
	
}
