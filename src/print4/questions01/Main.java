package print4.questions01;

import java.util.Scanner;

public class Main {
	
	/*
	 * 問1	do-while文を使ってABCと入力されるまで処理を繰り返すプログラムを作成してください。
     * do-while文の条件式にはboolean型変数を使用するようにしてください。
     * doブロックの中でif文判定を行います。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		
		do {
			System.out.print("入力：");
			String s = sc.nextLine();
			
			if(s.equals("ABC")) {
				bool = false;
			}
		}while(bool);
		
		System.out.println("プログラム終了");
	}

}
