package print1.questions15;

import java.util.Scanner;

/*
 * 問15
 *String型の変数nameにキーボードから文字列”ミケ”を代入して、
 *実行結果のように表示しましょう。
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力：");
		String name = sc.nextLine();
		System.out.println("猫の名前は" + name + "です");
		sc.close();
	}

}
