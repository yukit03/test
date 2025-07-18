package print6.questions04;

import java.util.Scanner;

public class Main {
	/*
	 * メソッド名： printRA
		引数： double height, double width
		戻り値：なし
		処理の内容： 高さが height, 横幅が width の長方形の面積を出力表示する
		ヒント：長方形の面積の求め方　高さ×横幅
	 */
	public static void printRA(double height,double width) {
		double menseki = height * width;
		System.out.println("面積：" + menseki);
	}
	
	/*
	 * メソッド名：main
		引数：String[] args
	　  戻り値：なし
		処理の内容：①double型変数takasaとdouble型変数yokoを宣言し、キーボードから入力を行う。
　　　　　        　②printRAメソッドを呼び出す。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("高さ：");
		double takasa = sc.nextDouble();
		System.out.print("横幅：");
		double yoko = sc.nextDouble();
		
		printRA(takasa,yoko);
	}
}
