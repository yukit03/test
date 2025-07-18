package print11.questions02;

public class Rectangle implements Shape{
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO 自動生成されたメソッド・スタブ
		return getWidth() * getHeight();
	}

	@Override
	public double getPerimeter() {
		// TODO 自動生成されたメソッド・スタブ
		return 2 * (getWidth() + getHeight());
	}

	@Override
	public void show() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("矩形の面積は" + getArea());
		System.out.println("矩形の周囲長は" + getPerimeter());
	}
	
	

}
