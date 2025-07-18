package print9.questions02;

public class Cube extends Ractangular{

	public Cube(int ippen) {
		super(ippen , ippen , ippen);
		
	}

	@Override
	public int getAreaOfFigure() {
		return getYoko() * getTate() * 6;
	}
	
	

}
