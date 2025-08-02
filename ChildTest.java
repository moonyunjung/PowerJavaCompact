class Parent{
	public void print() {
		System.out.println("부모 클래스의 print() 메소드");
		secret();
	}
	
	private void secret() {
		System.out.println("비밀 메시지 출력");
	}
}

class Child extends Parent{
	//public void print();
	//private void secret(); //copy는 되어들어옴
	public void print() {//수퍼클래스의 메소드 호출
		super.print();//메소드 오버라이드
		//super.secret(); //compile error! private여서 호출은 불가
		System.out.println("자식 클래스의 print() 메소드");
	}
}

public class ChildTest {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
	}
	
}
