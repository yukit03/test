package print11.questions02;

public class Circle implements Shape{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO 自動生成されたメソッド・スタブ
		return getRadius() * getRadius() * Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO 自動生成されたメソッド・スタブ
		return 2 * Math.PI * getRadius();
	}

	@Override
	public void show() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf("円の面積は%.2f\n",getArea());
		System.out.printf("円の周囲長は%.2f\n",getPerimeter());
	}
	
	

}
