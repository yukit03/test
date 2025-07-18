package print6.questions12;

import java.util.Random;

public class Main {
	/*
	 * ①	int型変数aに100、int型変数bに25、double型変数dに3.14、double型変数eに1.41を代入する。
②	char型配列に初期値として「+」「-」「*」「/」「?」の記号を持たせて宣言する。
③	乱数を用いてchar型変数c1及びchar型変数c2にchar型配列から1個ずつ値を格納する。乱数を用いてchar型変数c1及びchar型変数c2にchar型配列から1個ずつ値を格納する。
乱数の範囲は要素の長さを使って求めること。
④	int型ans1にcalcメソッドを使って取得した値を格納する。
引数で渡すもの：int型変数2個とchar型変数c1
⑤	double型ans2にcalcメソッドを使って値を取得する。
引数で渡すもの：double型変数2個とchar型変数c2
⑥	ans1が-1ではない場合、計算結果を表示する。-1の時は「存在しない演算子です」を表示
計算結果はSystem.out.println()を使い、「100-25=75」のような形で出力する。 
⑦	ans2が-1ではない場合、計算結果を表示する。-1の時は「存在しない演算子です」を表示
計算結果はSystem.out.println()を使い、「3.14+1.41=4.55」のような形で出力する。
※char型とint型を＋演算子を使って結合すると、char型は数字として処理されるため、出力表示時はchar型のものをString型として扱うように変換させる必要がある（検索してください）

	 */
	public static void main(String[] args) {
		// int型変数aに100、int型変数bに25、double型変数dに3.14、double型変数eに1.41を代入する。
		int a = 100;
		int b = 25;
		double d = 3.14;
		double e = 1.41;
		Random rand = new Random();
		//2 char型配列に初期値として「+」「-」「*」「/」「?」の記号を持たせて宣言する。
		char[] c = {'+','-','*','/','?'};

		/*
		 * 3 乱数を用いてchar型変数c1及びchar型変数c2にchar型配列から1個ずつ値を格納する。乱数を用いてchar型変数c1及びchar型変数c2にchar型配列から1個ずつ値を格納する。
             乱数の範囲は要素の長さを使って求めること。
		 */
		char c1 = c[rand.nextInt(c.length)];
		char c2 = c[rand.nextInt(c.length)];

		/*
		 *4 int型ans1にcalcメソッドを使って取得した値を格納する。
            引数で渡すもの：int型変数2個とchar型変数c1
		 */
		int ans1 = calc(a,c1,b);
		/*
		 * 5 double型ans2にcalcメソッドを使って値を取得する。
             引数で渡すもの：double型変数2個とchar型変数c2
		 */
		double ans2 = calc(d,c2,e);
		
		/*
		 *6 ans1が-1ではない場合、計算結果を表示する。-1の時は「存在しない演算子です」を表示
            計算結果はSystem.out.println()を使い、「100-25=75」のような形で出力する。
            ※char型とint型を＋演算子を使って結合すると、char型は数字として処理されるため、
            出力表示時はchar型のものをString型として扱うように変換させる必要がある（検索してください）
		 */
		if(ans1 != -1) {
			System.out.println(a + Character.toString(c1) + b + "=" + ans1);
			//System.out.println(a  + "" +c1 + ""+ b + "=" + ans1);
			//System.out.println(a + String.valueOf(c1) + b + "=" + ans1);
		}else {
			System.out.println("存在しない演算子です");
		}
		
		/*
		 *7 ans2が-1ではない場合、計算結果を表示する。-1の時は「存在しない演算子です」を表示
            計算結果はSystem.out.println()を使い、「3.14+1.41=4.55」のような形で出力する。
		 */
		if(ans2 != -1) {
			System.out.println(d + String.valueOf(c2) + e + "=" + ans2);
		}else {
			System.out.println("存在しない演算子です");
		}
	}

	/*
	 * メソッド名：calc
　　　 引数：int型、char型、int型
　　　 戻り値：int型
　　　 処理：多重定義をしているcalcメソッドに引数を渡す。
	 */
	public static int calc(int x,char c,int y) {
		return (int)calc((double)x,c,(double)y);
	}

	/*
	 * メソッド名：calc
　　　 引数：double型、char型、double型
　　　 戻り値：double型
　　　 処理：char型引数の値を見て、add,sub,mul,divの各メソッドの処理を呼び出す。
　　　　　　 switch文を使い、「+」の場合はaddメソッド、「-」の場合はsubメソッド、
            「*」の場合はmulメソッド、「/」の場合はdivメソッドを呼び、処理の結果を返す。
             それ以外の場合は-1を返す。
	 */
	public static double calc(double x,char c,double y) {

		switch(c) {
		case '+':
			return add(x,y);
		case '-':
			return sub(x,y);
		case '*':
			return mul(x,y);
		case '/':
			return div(x,y);
		default: 
			return -1;
		}

	}
	/*
	 * メソッド名：add
   	   引数：double x , double y
       戻り値の型：double
       処理：引数で受け取った変数xと変数yを足し算した値を返す
	 */
	public static double add(double x,double y) {
		return x + y;
	}

	/*
	 * メソッド名：sub
       引数：double x , double y
       戻り値の型：double
       処理：引数で受け取った変数xと変数yで引き算した値を返す。
	 */
	public static double sub(double x,double y) {
		return x - y;
	}

	/*
	 * メソッド名：mul
	   引数：double x , double y
	   戻り値の型：double
	   処理：引数で受け取った変数xと変数yを乗算した値を返す。
	 */
	public static double mul(double x,double y) {
		return x * y;
	}
	/*
	 * メソッド名：div
	   引数：double x , double y
	   戻り値の型：double
	   処理：引数で受け取った変数xと変数yで除算した値を返す。
	 */
	public static double div(double x,double y) {
		return x / y;
	}
}
