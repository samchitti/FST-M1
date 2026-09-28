package Activities_FST_Java;

public class Activity1 {
	public static void main(String[] args) {
		// Create the Car object
		Car_01 obj1 = new Car_01("Black", "Manual", 2024);
		
		// Use the object to call its functions
		obj1.displayCharacteristics();
		obj1.accelarate();
		obj1.brake();
	}
}
