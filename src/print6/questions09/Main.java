package print6.questions09;

import java.util.Scanner;

public class Main {
	/**
	 * メソッド名： getMinValue
	   引数：int[]型 array
	   戻り値の型：int
	   処理の内容： 引数で受け取る配列の要素のうち、最も小さい値をmainメソッドに返す。
	   ※最小値の初期値としてInteger.MAX_VALUEを使うこと
	 */
	public static int getMinValue(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		//1 int型配列を要素数５で宣言する
		int[] a = new int[5];
		
		//2 for文を使い配列の各要素にキーボードから入力を行う
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.print("入力値：");
			a[i] = sc.nextInt();
		}
		//3 getMinValueメソッドに配列を渡して呼び出し、戻り値を受け取る
		int min = getMinValue(a);
		
		//4 「最小値は（戻り値）です」という形で表示する。
		System.out.println("最小値は" + min + "です");
	}
}
