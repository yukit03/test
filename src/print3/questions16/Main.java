package print3.questions16;

import java.util.Scanner;

public class Main {
	/*
	 *問16 キーボードから入力した数値の階乗を求めてください。（for文）
     *階乗：１からキーボード入力した数値までのすべての数を乗算。
     *例）３の階乗の場合：１×２×３＝６
     *    ５の階乗の場合：１×２×３×４×５＝１２０
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数値を入力:");
		int a = sc.nextInt();
		
		int val = 1;
		for(int i=1;i<=a;i++) {
			val *= i;
		}
		System.out.println(val);
	}

}
