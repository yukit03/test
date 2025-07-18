package print9.questions01;

public class VehicleTester {

	public static void main(String[] args) {
		
		Vehicle bike = new Vehicle("バイク","黒",50);
		
		bike.driving_speed();
		
		bike.introduction();
		
		Car car = new Car("車","白",80,"トヨタ");
		Bicycle bicycle = new Bicycle("自転車", "赤", 15, 3);
		
		car.driving_speed();
		bicycle.driving_speed();
		
		car.introduction();
		bicycle.introduction();
	}
	
}
