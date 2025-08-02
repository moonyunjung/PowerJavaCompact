class Shape{
	protected int x, y;
	
	public void draw() {
		System.out.println("Shape Draw");
	}
}//각 도형들은 2차원 공간에서 도형의 위치를 나타내는 기준점(x, y)을 가진다. 이것은 모든 도형에 공통적인 속성이므로 부모 클래스인 Shape에 저장한다.

class Rectangle extends Shape{
	private int width, height;
	public void draw() {
		System.out.println("Rectabgle Draw");
	}
}//Shape에서 상속받아서 사각형을 나타내는 클래스 Rectangle을 정의하여 보자. Rectangle은 추가적으로 width와 height 변수를 가진다.

class Triangle extends Shape{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape{
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}

/*
public class ShapeTest {

	public static void main(String[] args) {
		Shape s1, s2;
		s1 = new Shape();
		s2 = new Rectangle();//부모 클래스 참조 변수로 자식 클래스 객체를 참조할 수 있따. 이것을 상향 형변환이라고 한다.: 다형성의 핵심!!
	}

}
*/
/*
public class ShapeTest {

	public static void main(String[] args) {
		Shape s = new Rectangle(); //부모클래스의 참조변수로 자식클래스의 객체를 가리키는 것은 합법적이낟.
		Rectangle r = new Rectangle();
		
		s.x = 0;
		s.y = 0; //Shape 클래스의 필드와 메소드에 접근하는 것은 OK
		s.width = 100;
		s.height = 100; //컴파일 오류가 발생하다. s를 해서는 Rectangle 클래스의 필드와 메소드에 접근할 수 없다.
	}

}
*/
/* 동적 바인딩 or 가상 메소드 호출
public class ShapeTest {

	public static void main(String[] args) {		
		Shape arrayOfShapes[] = new Shape[3]; //클래스 Shape의 배열 arrayOfShapes[]를 선언한다.
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
		
		int i;
		for(i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();//배열 arrayOfShapes[] 길이만큼 루프를 돌면서 각 배열 요소를 통하여 draw()메소드를 호출해 본다. 어떤 draw()가 호출될까? 각 요소가 실제로 가리키고 있는 객체에 따라 서로 다른 draw()가 호출된다.
		}
	}
}
*/
//실제 객체를 알고 싶다면? instanceof연산자
public class ShapeTest{
	public static void main(String arg[]) {
		Shape s = new Rectangle();
		
		if (s instanceof Rectangle) {
			System.out.println("실제 객체는 Rectangle이군요!");
		}
		if(s instanceof Circle) {
			System.out.println("실제 객체는 Circle이군요!");
		}
	}
} //출력 : 실제 객체는 Rectangle이군요!
