package print6.questions05;

import java.util.Scanner;

public class Main {
	/*
	 * メソッド名： printMin
		引数： double a, double b, double c
		戻り値：なし
		処理の内容： 引数で渡された a, b, c の値のうち、最小値を出力表示する
	 */
	public static void printMin(double a,double b,double c) {
		double min = Double.MAX_VALUE;
		
		if(min > a) {
			min = a;
		}
		if(min > b) {
			min = b;
		}	
		if(min > c) {
			min = c;
		}
		System.out.println("最小値：" + min);
	}

	/*
	 * メソッド名：main
		引数：String[] args
	　  戻り値：なし
		処理の内容：①double型変数を３つ用意し、キーボードから各変数にそれぞれ入力する
　　　　　　        ②printMinメソッドを呼び出す
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		double a = sc.nextDouble();
		System.out.print("b:");
		double b = sc.nextDouble();
		System.out.print("c:");
		double c = sc.nextDouble();
		
		printMin(a,b,c);
	}
}
