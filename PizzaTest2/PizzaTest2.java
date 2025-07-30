
public class PizzaTest2 {

	public static void main(String[] args) {
		Pizza obj1 = new Pizza(14);
		Pizza obj2 = new Pizza(18);
		
		Pizza largest = Pizza.whosLargest(obj1, obj2);
		System.out.println(largest.radius + "인치 피자가 더 큼.");

	}

}
