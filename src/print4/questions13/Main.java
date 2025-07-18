package print4.questions13;

import java.util.Scanner;

public class Main {
	/*
	 * 問13	キーボードから直角三角形の段数を入力し、for文の二重ループを使って、
	 * 右上側が直角の直角三角形を表示するプログラムを作成しましょう。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(j < i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}			
			}
			System.out.println();
		}
	}
}
