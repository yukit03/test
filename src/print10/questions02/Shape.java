package print10.questions02;

public abstract class Shape {
	
	private final String SYMBOL = "+";
	private final String HORZLINE = "-";
	private final String VERTLINE = "|";
	
	abstract void draw();

	public String getSYMBOL() {
		return SYMBOL;
	}

	public String getHORZLINE() {
		return HORZLINE;
	}

	public String getVERTLINE() {
		return VERTLINE;
	}
	

}
