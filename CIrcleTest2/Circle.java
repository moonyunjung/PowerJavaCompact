
public class Circle extends Shape {
	int radius; //소속변수 3개 상위 클래스 Shape에 있는 int x, y 포함
	
	public Circle(int radius) /*매개변수*/ { //생성자1의 주된 기능: 소속변수 초기화
		this.radius = radius;
		x = 0;
		y = 0; //상위 클래스에 있는 변수는 따로 초기화 해줘야한다.
	}
	
	double calcArea() { //소속메소드1
		return 3.14 * radius * radius;
	}
	
}
