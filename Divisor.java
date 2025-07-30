import java.util.Scanner;

public class Divisor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		int num = sc.nextInt();
		
		System.out.println(num + "의 약수는 다음과 같습니다.");
		
		int i;
		boolean first = true; //이 코드를 이용해서 처음숫자는 띄어쓰기 없이 출력할수있게됨
		for(i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				
				if (first) {
					
					System.out.print(i);
					first = false;
					
				} else {
					
					System.out.print(" " + i);
					
				}
				
			}
			
		}//이렇게만 출력하면 처음 숫자도 같이 띄어쓰기 되는 문제가 발생.
		
		sc.close();
	}
	
}

