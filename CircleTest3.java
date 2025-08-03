//public String toString() : 객체의 문자열을 반환한다.
class Circle{
	int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public String toString() {
		return ("Circle(r=" + radius + ")");
	}
}

public class CircleTest3 {

	public static void main(String[] args) {
		Circle obj1 = new Circle(10);
		Circle obj2 = new Circle(20);
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
