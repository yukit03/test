package print11.questions03;

import java.util.Scanner;

public class OprTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		char c = sc.nextLine().charAt(0);
		
		IOperation ope = IOperation.getInstanceCalc(c);
		if(ope == null) {
			System.out.println("四則演算の記号ではありません");
		}else {
			ope.show(a, b, ope.intCalc(a, b));
		}
	}

}
