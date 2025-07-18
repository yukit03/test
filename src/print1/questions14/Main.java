package print1.questions14;

import java.util.Scanner;

/*
 * 問14
 *double型の変数pにキーボードから円周率(3.14)を代入し、表示しましょう。
 *その後変数pを、int型にキャストして、表示しましょう。
 *最後にdouble型変数zにMath.PIを代入して表示しましょう。
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("pの値を入力：");
		double p = sc.nextDouble();
		System.out.println("円周率は" + p + "です");
		int q = (int)p;
		System.out.println("円周率は" + q + "です");
		double z = Math.PI;
		System.out.println("zの値は：" + z);
		sc.close();
	}

}
