package print4.questions04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	/*
	 * 問4	do-while文、switch文、乱数を使い、おみくじのプログラムを作成してください。
     * 乱数値は0～3の範囲になるようにしてください。
     * 値が０のときは凶、１のときは吉、２のときは中吉、３のときは大吉を表示。
     * 結果を表示後、再度おみくじを行うか確認を求め、入力値がyの場合は再度おみくじを、nの場合はおみくじを終了させてください。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String str = "";
		
		do {//占いを繰り返し行うためのdo-while文(繰り返し)
			int r = rand.nextInt(4);
			
			switch(r) {
			case 0:System.out.println("あなたの運勢は凶です。");break;
			case 1:System.out.println("あなたの運勢は吉です。");break;
			case 2:System.out.println("あなたの運勢は中吉です。");break;
			case 3:System.out.println("あなたの運勢は大吉です。");break;
			}
			
			do {//入力不正の際再度入力を受けるつけるためのdo-while文(繰り返し)
				System.out.print("再度おみくじを行いますか？（y/n）");
				str = sc.nextLine();
				if(!str.equals("y") && !str.equals("n")) {
					System.out.println("入力が不正です。");
				}
			}while(!str.equals("y") && !str.equals("n"));//y、n以外が入力されたら繰り返す
			
		}while(str.equals("y"));//yが入力されたら繰り返す
		System.out.println("おみくじを終了します。");
	}
}
