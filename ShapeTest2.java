abstract class Shape{ //추상 메소드가 1개라도 있으면 추상 클래스여야 한다.
	int x, y; //소속 변수
	public void move(int x, int y /*메소드 매개변수 2개*/) { 
		this.x = x;
		this.y = y;
	}
	public abstract void draw();//추상 메소드
};

class Rectangle extends Shape{//추상 메소드 재정의시 일반 class가 됨 => 마음대로 객체를 만들 수 있다.
	int width, height;//소속메소드 추가적으로 2개 더 있음
	public void draw() {//추상 메소드 구현 //메소드 재정의(overriding)
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle extends Shape{//추상 메소드 재정의시 일반 class가 됨 => 마음대로 객체를 만들 수 있다.
	int radius;
	public void draw() {//추상 메소드 구현
		System.out.println("원 그리기 메소드");
	}
}

abstract class Triangle extends Shape{ //아무것도 적지 ㅇ낳으면 재정의가 아니므로 추상class로 만들어야한다. 그렇지 않으면 compile error!
	public abstract void draw();
}

public class ShapeTest2 {

	public static void main(String[] args) {
		//Shape s = new Shape();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		//Triangle t = new Triangle();
		
		r.move(10, 10);
		r.draw();
		
		c.move(20, 20);
		c.draw();
	}

}
