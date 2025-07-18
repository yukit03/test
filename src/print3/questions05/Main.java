package print3.questions05;

import java.util.Scanner;

public class Main {
	/*
	 * 問5　for文を使い、0～nまでの整数のうち偶数のみ加算し、結果を表示するプログラムを作りましょう。
     *ｎの値はキーボードから入力した値が代入されます。
     *※if文は使わないこと
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nの値を入力：");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}
}
