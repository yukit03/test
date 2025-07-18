package print6.questions08;

import java.util.Scanner;

public class Main {
	/*
	 * メソッド名：add
	   引数：int a , int b
	   戻り値の型：int
	   処理：引数で受け取った変数aと変数bを足し算した値を返す
	 */
	public static int add(int a,int b) {
		return a + b;
	}
	/*
	 * メソッド名：sub
	   引数：int a, int b
	   戻り値の型：int
	   処理：引数で受け取った変数aを変数bで引き算した値を返す。
	 */
	public static int sub(int a,int b) {
		return a - b;
	}
	/*
	 * メソッド名：mul
       引数：int a, int b
	   戻り値の型：int
	   処理：引数で受け取った変数aと変数bを乗算した値を返す。
	 */
	public static int mul(int a,int b) {
		return a * b;
	}
	/*
	 * メソッド名：div
       引数：int a, int b
	   戻り値の型：int
	   処理：引数で受け取った変数aを変数bで除算した値を返す。
	 */
	public static int div(int a,int b) {
		return a / b;
	}
	
	/*
	 * メソッド名：main
       引数：String[] args
	   戻り値：なし
	 */
	public static void main(String[] args) {
		//int型変数aとbを用意し、キーボードから入力を行う
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		int a = sc.nextInt();
		System.out.print("b:");
		int b = sc.nextInt();
		//addメソッドを呼び出し、戻り値を表示する
        //「a + b = (戻り値)」の形で出力する。
		//int ans = add(a,b);
		System.out.println("a ＋ b =" + add(a,b));
		
		//subメソッドを呼び出し、戻り値を表示する。
        //「a - b = (戻り値)」の形で出力する。
		System.out.println("a － b =" + sub(a,b));
		
		//mulメソッドを呼び出し、戻り値を表示する。
        //「a × b = (戻り値)」の形で出力する。
		System.out.println("a × b =" + mul(a,b));
		
		//divメソッドを呼び出し、戻り値を表示する。
        //「a ÷ b = (戻り値)」の形で出力する。
		System.out.println("a ÷ b =" + div(a,b));
		
		//「(a + b) × (a - b) =（戻り値）」の形で表示する。
        //※メソッドの入れ子の形になる。
//		int ans = add(a,b);
//		int ans2 = sub(a,b);
//		int ans3 = mul(ans,ans2);
		System.out.println("(a + b) × (a - b) =" + mul(add(a,b),sub(a,b)));
	}
}
