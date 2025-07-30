public class Circle {
	
	private int radius;
	
	public void setRadius(int r) {
		
		radius = r;
		
	}
	
	public double getArea() {
		
		return radius * radius * 3.14;
		
	}
	
	public void print() {
		
		System.out.println("원의 반지름: " + radius);
		System.out.println("원의 면적: " + getArea());
		
	}
}
