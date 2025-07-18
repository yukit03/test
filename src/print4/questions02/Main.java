package print4.questions02;

import java.util.Scanner;

public class Main {
	
	/*
	 * 問2	do-while文を使って「y」が入力されるまで処理を繰り返すプログラムを作成してください。
     * do-while文の条件式にはboolean型変数を使用しないでください。(equalsを使う)
     * ※if文は使用しません。
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		do {
			System.out.print("入力：");
			input = sc.nextLine();
		}while(!input.equals("y"));
		
		System.out.println("プログラム終了");
	}

}
