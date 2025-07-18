package print9.questions01;

public class Vehicle {

	private String kind;
	private String color;
	private int speed;

	public Vehicle() {

	}

	public Vehicle(String kind,String color,int speed) {

		this.kind = kind;
		this.color = color;
		this.speed = speed;

	}

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void driving_speed() {
		System.out.println("運転速度は" + getSpeed() + "kmです");
	}

	public void introduction() {
		System.out.println("私の" + getKind() + "の色は" + getColor() + "です");
	}

}
