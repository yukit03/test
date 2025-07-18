package print11.questions03;

public class Mul implements IOperation {

	@Override
	public int intCalc(int a, int b) {
		
		return a * b;
	}

	@Override
	public void show(int a, int b, int intCalc) {
		System.out.printf(fmtIntCalc,a,INT_MUL,b,intCalc);
		
	}

}
