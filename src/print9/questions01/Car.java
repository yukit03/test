package print9.questions01;

public class Car extends Vehicle{

	private String brand;

	public Car(String kind, String color, int speed,String brand) {
		//super();
		super(kind, color, speed);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void introduction() {
		System.out.println("私の" + this.getKind() + "の色は" + this.getColor() + 
				"です。メーカーは" + this.getBrand() + "です");
	}



}
