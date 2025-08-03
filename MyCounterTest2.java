class MyCounter{
	int value = 0; //0으로 초기화된 소속변수할 수 있지만 생성자로 초기화 해주기
	public static void inc(MyCounter ctr) { //정적인 멧ㅎ드 : 매개변수로 MyCounter 객체를 받아 그 객체안에 있는 value값을 1만큼 증가시킨다.
		ctr.value = ctr.value + 1;
	}
	
}
public class MyCounterTest2 {

	public static void main(String[] args) {
		MyCounter mc1 = new MyCounter(); //m1,2 객체를 2개 만듬
		MyCounter mc2 = new MyCounter();
		
		System.out.println("mc1.value = " + mc1.value); //mc1값을 출력 => 0
		System.out.println("mc2.value = " + mc2.value); //mc2값을 출력 => 0
		
		//정적인 매개변수 호출: 'class이름.'으로 호출
		MyCounter.inc(mc2);
		
		System.out.println("mc1.value = " + mc1.value); //0
		System.out.println("mc2.value = " + mc2.value); //1
	}
	
}
