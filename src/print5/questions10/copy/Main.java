package print5.questions10.copy;

import java.util.Scanner;

public class Main {
	/*
	 * 問5と同じようにString型配列s、int型配列bを作りましょう。
     * for文を使い配列ｂにキーボードより点数を入力し、実行結果のようにＢ君の点数を表示してください。（ループ条件にはlengthを利用すること）
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"英語","国語","数学","社会","理科"};
		int[] b = new int[s.length];
		
		for(int i=0;i<b.length;i++) {
			System.out.print(s[i] + ":");
			b[i] = sc.nextInt();
		}
		
		/*
		 * 上記の実行結果例を元にB君の点数を表示後、Ｂ君の追試が必要な科目数を求めて表示するプログラムを続けて作りましょう。
         * 50点以下の科目を追試とします。
         * ※ int型配列b、for文、if文を使ってください。（ループ条件にはlengthを利用すること）
		 */
		System.out.print("B君：");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i] + " " + b[i] + "点");
			if(i < s.length - 1) {
				System.out.print("、");
			}
		}
		System.out.println();
		int count = 0;
		for(int i=0;i<s.length;i++) {
			if(b[i] <= 50) {
				count++;
			}
		}
		System.out.println("B君は" + count + "科目追試が必要です");
	}
}
