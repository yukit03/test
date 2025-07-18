package print9.questions02;

public class Quadrilateral {
	
	private int yoko;
	private int tate;
	
	public Quadrilateral(int tate , int yoko) {
		setYoko(yoko);
		setTate(tate);
	}

	public int getYoko() {
		return yoko;
	}

	public void setYoko(int yoko) {
		this.yoko = yoko;
	}

	public int getTate() {
		return tate;
	}

	public void setTate(int tate) {
		this.tate = tate;
	}
	
	public int getAreaOfFigure() {
		return getYoko() * getTate();
		
	}

}
