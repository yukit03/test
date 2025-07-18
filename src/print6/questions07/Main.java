package print6.questions07;

import java.util.Scanner;

public class Main {
	/*
	 *  メソッド名：getMinValue
		引数：double a, double b
		戻り値の型：double　return文で三項条件演算子を使用して下さい 
		処理の内容： 引数で受け取る2の値のうち、小さい方の値を返す
	 */
	public static double getMinValue(double a,double b) {
		
		return a > b ? b: a;
	}
	
	/*
	 * メソッド名：main
		引数：String[] args
	　  戻り値：なし
		処理の内容：①double型変数を２つ用意し、キーボードから入力を行う。
　					②getMinValueメソッド呼び出し、引数として２つのdouble型変数を渡し、戻り値をdouble型変数を用意して受け取る。
　					③戻り値を受け取った変数の内容を表示する。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		double a = sc.nextDouble();
		System.out.print("b:");
		double b = sc.nextDouble();
		
		double min = getMinValue(a,b);
		System.out.println(min);
	}
}
