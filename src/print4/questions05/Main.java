package print4.questions05;

import java.util.Scanner;

public class Main {
	/*
	 * for文、if文）
     * 整数を５回キーボードから入力し最小値及び最大値を求めるプログラムを作ります。
     * 最小値を持たせるための変数をint型minとする。
     * ｍinの初期値については、int型の持てる最大値になるInteger.MAX_VALUEを使うこと。
     * 最大値を持たせるための変数をint型maxとする。
     * maxの初期値については、int型の持てる最小値になるInteger.MIN_VALUEを使うこと。
	 */
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;//初期値はできるだけ大きい数
		int max = Integer.MIN_VALUE;//初期値はできるだけ小さい数]
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("入力：");
			int input = sc.nextInt();
			if(min > input) {
				min = input;
			}
			if(max < input) {
				max = input;
			}
		}
		System.out.println("最小値は" + min);
		System.out.println("最大値は" + max);
	}
}
