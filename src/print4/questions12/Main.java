package print4.questions12;

import java.util.Scanner;

public class Main {
	/*
	 * 問12	キーボードから直角三角形の段数を入力し、for文の二重ループを使って、
	 * 左上側が直角の直角三角形を表示するプログラムを作成しましょう。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j = i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
