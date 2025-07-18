package print4.questions11;

import java.util.Scanner;

public class Main {
	/*
	 * 問11	キーボードから直角三角形の段数を入力し、for文の二重ループを使って、
	 * 左下側が直角の直角三角形を表示するプログラムを作成しましょう。
	 * 
	 * 入力：5
	 
	   j 1 2 3 4 5
	 i
	 1	 *
	 2	 * *
	 3	 * * *
	 4	 * * * *
	 5	 * * * * *

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
