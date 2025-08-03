//객체 동등 비교
class Box{
	int width, length, height;
	int volume;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
		volume = w * l * h;
	}
}

public class BoxTest3 {

	public static void main(String[] args) {
		Box obj1 = new Box(10, 20, 50);
		//Box obj2 = new Box(10, 20, 50);
		Box obj2 = obj1; //obj1과 2가 같은 것을 가리킨다.
		
		boolean rslt = (obj1 == obj2); //true값을 반환
		System.out.println(rslt);

	}

}
