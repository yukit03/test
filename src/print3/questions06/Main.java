package print3.questions06;

import java.util.Scanner;

public class Main {
	/*
	 *問6 for文を使い、ｍ～ｎまでの整数の合計を表示するプログラムを作りましょう。
     *ｍ及びｎはキーボードから入力した値が代入されます。
     *※キーボード入力についてはm < nになるように入力してください。if文は不要です。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("mの値を入力：");
		int m = sc.nextInt();
		System.out.print("nの値を入力：");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=m;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
