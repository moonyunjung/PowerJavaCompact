
public class Pizza {
	int radius;
	
	Pizza(int r){
		radius = r;
	}
	
	static Pizza whosLargest(Pizza p1, Pizza p2) {
		if(p1.radius > p2.radius) {
			return p1;
		}else {
			return p2;
		}
	}
}
