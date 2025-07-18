package print11.questions03;

public interface IOperation {
	
	final static String fmtIntCalc = "%d %c %d = %d";
	final static char INT_ADD = '+';
	final static char INT_SUB = '-';
	final static char INT_MUL = '*';
	final static char INT_DIV = '/';
	
	int intCalc(int a,int b);
	void show(int a,int b,int intCalc);
	
	//ファクトリーパターンを使っている
	static IOperation getInstanceCalc(char c) {
		if(c == INT_ADD) {
			return new Add();
		}else if(c == INT_SUB) {
			return new Sub();
		}else if(c == INT_MUL) {
			return new Mul();
		}else if(c == INT_DIV) {
			return new Div();
		}else {
			return null;
		}
	}

}
