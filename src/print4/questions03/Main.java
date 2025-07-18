package print4.questions03;

import java.util.Scanner;

public class Main {
	
	/*
	 * do-while文を使い、「ｙもしくはn」が入力されるまで再入力を求めるプログラムを作成しましょ
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.print("入力してください(y/n):");
			str = sc.nextLine();
		}//while(!str.equals("y") && !str.equals("n"));
		while(!(str.equals("y")|| str.equals("n")));
		System.out.println("プログラムを終了します");
	}
}
