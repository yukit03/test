package print4.questions08;

import java.util.Scanner;

public class Main {
	/*
	 * 問8	for文とif文を使い、ｎ回整数を読み込みし、整数を加算してください。
     * 合計値が1000を超えない範囲で加算し、超えた時点でｎ回読み込みが完了していなくても入力処理を終了して合計値を表示してください。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("何回入力？：");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			System.out.print("整数値：");
			int input = sc.nextInt();
			
			if(sum + input >= 1000) {
				System.out.println("合計が1000超えました");
				System.out.println("最後の数値は無視します。");
				break;
			}
			sum += input;
		}
		System.out.println();
		System.out.println("合計：" + sum);
		
	}
}
