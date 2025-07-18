package print3.questions17;

import java.util.Random;
import java.util.Scanner;

public class Main {
	/*
	 *問17 キーボードからループ回数を指定して、その回数分だけ乱数を表示してください
     *乱数については横に並べて表示します。乱数と乱数の間は半角スペースを用いて分けてください。
     *乱数の範囲は０～９９になります。
     *for文でプログラムを作成し、その後while文でもプログラムを作成してください。
     *実行結果例のような形になります。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("ループ回数：");
		int n = sc.nextInt();

		for(int i=0;i<n;i++) {
			System.out.print(rand.nextInt(100) + " ");
		}
		System.out.println();

		int i=0;
		while(i<n) {
			System.out.print(rand.nextInt(100) + " ");
			i++;
		}
	}
}
