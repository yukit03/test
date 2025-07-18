package print6.questions11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1 「面積を求めます」と表示する
		System.out.println("面積を求めます。");
		//2 「縦の長さ：」「横の長さ：」をキーボードから入力する。
		System.out.print("縦の長さ：");
		double tate = sc.nextDouble();
		System.out.print("横の長さ：");
		double yoko = sc.nextDouble();
		double menseki = 0;
		/*3 縦と横の長さが等しい場合、それ以外の場合でif文処理を行い、getAreaメソッド
            を呼び出す。（呼び出すメソッドは同じだが、引数が異なる）
		 */
		if(tate == yoko) {
			menseki = getArea(tate);
		}else {
			menseki = getArea(tate,yoko);
		}	
		//4 「面積 = 戻り値を格納している変数」の形で表示する。 
		System.out.println("面積＝" + menseki);
	}
	
	/*
	 * メソッド名：getArea
	   引数：「double tate、double yoko」　の場合と、 「double ippen」　の場合がある。
	   戻り値の型：double型
	   処理の内容：引数を受け取って面積を求めて結果を返す。
		　	       このメソッドはオーバーロードの形になる。

	 */
	public static double getArea(double tate,double yoko) {
		return tate * yoko;
	}
	
	public static double getArea(double ippen) {
		return ippen * ippen;
	}
}
