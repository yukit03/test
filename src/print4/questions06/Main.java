package print4.questions06;

import java.util.Scanner;

public class Main {
	/*
	 * 問6	（無限ループ、break文、continue文、if文）
	 * While文を使い、０を入力するまで、延々とキーボードから入力される正の整数値を加算していくプログラムを作成しましょう。
	 * ※負の整数値が入力された場合は加算しない。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("入力：");
			int input = sc.nextInt();

			if(input == 0) {
				break;
			}
			if(input < 0) {
				continue;
			}

			sum += input;

		}
		System.out.println();
		System.out.println("合計は" + sum + "です");
	}
}
