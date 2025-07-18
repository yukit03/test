package print9.questions01;

public class Bicycle extends Vehicle{
	
	private int gear;


	public Bicycle(String kind, String color, int speed,int gear) {
		super(kind, color, speed);
		this.gear = gear;
	}

	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}
	
	@Override
	public void introduction() {
		System.out.println("私の" + getKind() + "の色は" + getColor() + 
				"です。ギア数は" + getGear() + "です。");
	}

}
