package print10.questions02;

public abstract class AbstLine extends Shape{
	
	private int length;
	
	AbstLine(int length){
		setLength(length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	

}
