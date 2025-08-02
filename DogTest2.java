class Animal{
	public void eat() {
		System.out.println("동물이 먹고 있습니다.");
	}
}

class Dog extends Animal{
	public void eat() {//메소드 재정의
		System.out.println("강아지가 먹고 있습니다.");
	}
}
public class DogTest2 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat(); //재정의된 메소드가 호출된다.
	}

}
