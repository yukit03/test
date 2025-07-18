package print7.questions02;

import java.util.Scanner;

public class Main {
	/*
	 * 問2	【文字列の長さの取得】
       文字列をキーボードから入力し、入力された文字列の長さを表示するプログラムを書きましょう。
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		String str = sc.nextLine();
		
		int len = str.length();
		System.out.println("文字列の長さ：" + len);
	}

}
