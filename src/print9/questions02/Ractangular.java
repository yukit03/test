package print9.questions02;

public class Ractangular extends Quadrilateral{
	
	private int takasa;

	public Ractangular(int tate, int yoko , int takasa) {
		super(tate, yoko);
		setTakasa(takasa);
	}

	public int getTakasa() {
		return takasa;
	}

	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}
	
	public int getVolume() {
		return getYoko() * getTate() * getTakasa();
	}

	@Override
	public int getAreaOfFigure() {
		int menseki = 2 * getYoko() * getTate() + 2 * getYoko() * getTakasa() + 2 * getTate() * getTakasa();
		//int menseki = 2 * super.getAreaOfFigure() + 2 *  getYoko() * getTakasa()+2 * getTate() * getTakasa();
		return menseki; 
	}
	
	
	
}
