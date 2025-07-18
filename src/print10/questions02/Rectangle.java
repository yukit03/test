package print10.questions02;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		setWidth(width);
		setHeight(height);
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<getHeight();i++) {
			for(int j=0;j<getWidth();j++) {
				System.out.print(getSYMBOL());
			}
			System.out.println();
		}
	}
	
	
	

}
