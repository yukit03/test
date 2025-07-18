package print4.questions16;

import java.util.Random;
import java.util.Scanner;

public class Main {
	/*
	 * 問16	終了を選ぶまでじゃんけんを繰り返すプログラムを以下の条件で作成しましょう。
     * ①じゃんけんを繰り返すかどうかの判定を持つboolean型変数boolを用意する
     * boolがtrueの時は繰り返す、falseの時は繰り返さない。
     * ②じゃんけんを繰り返す処理はwhile文を使う（boolを条件式に使う）
     * ③do-while文を使い、「グー：０，チョキ：１，パー：２」以外の値が入力された場合、再度入力を求めるようにする。
     * ④NPCの手は乱数を使う
     * ⑤お互いの手を表示する箇所はswitch文を使う
     * ⑥勝敗判定はif-else if-elseを使い、「あなたの勝ち」「あなたの負け」「あいこ」を表示する
     * ⑦「再度対戦しますか？(y/n)」をdo-while文を使いyとn以外が入力された場合は再度入力を求めるようにする。（ｙの時は再度じゃんけんする。ｎの時はじゃんけんを終了する）
     * ⑧じゃんけんを終了する時は「プログラムを終了します」を表示する
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//①じゃんけんを繰り返すかどうかの判定を持つboolean型変数boolを用意する
		boolean bool = true;
		boolean bool2 = true;

		//②じゃんけんを繰り返す処理はwhile文を使う（boolを条件式に使う）
		while(bool) {
			bool2 = true;
			//③do-while文を使い、「グー：０，チョキ：１，パー：２」以外の値が入力された場合、再度入力を求めるようにする。
			int myhand;
			do {
				System.out.print("あなたの手を入力してください（グー：０，チョキ：１，パー：２）:");
				myhand = Integer.parseInt(sc.nextLine());
			}while(0 > myhand || myhand > 2);

			//④NPCの手は乱数を使う
			int npchand = rand.nextInt(3);

			//⑤お互いの手を表示する箇所はswitch文を使う
			switch(myhand) {
			case 0:System.out.println("あなたの手はグーです");break;
			case 1:System.out.println("あなたの手はチョキです");break;
			case 2:System.out.println("あなたの手はパーです");break;
			}
			
			switch(npchand) {
			case 0:System.out.println("NPCの手はグーです");break;
			case 1:System.out.println("NPCの手はチョキです");break;
			case 2:System.out.println("NPCの手はパーです");break;
			}

			//⑥勝敗判定はif-else if-elseを使い、「あなたの勝ち」「あなたの負け」「あいこ」を表示する
			if((myhand == 0 && npchand == 1) || (myhand == 1 && npchand == 2) || (myhand == 2 && npchand == 0)) {
				System.out.println("あなたの勝ちです");
			}else if((myhand == 0 && npchand == 2) || (myhand == 1 && npchand == 0) || (myhand == 2 && npchand == 1)) {
				System.out.println("あなたの負けです");
			}else {
				System.out.println("あいこです");
			}
			
			//⑦「再度対戦しますか？(y/n)」をdo-while文を使いyとn以外が入力された場合は再度入力を求めるようにする。
			//（ｙの時は再度じゃんけんする。ｎの時はじゃんけんを終了する）
			String str = "";
			do {
				System.out.print("再度対戦しますか？(y/n) :");
				str = sc.nextLine();
				if(str.equals("n")) {
					bool = false;
					bool2 = false;
				}else if(str.equals("y")) {
					bool2 = false;
				}
			}//while(!str.equals("y") && !str.equals("n"));
			//while(!(str.equals("y") || str.equals("n")));
			while(bool2);
			

		}
		//⑧じゃんけんを終了する時は「プログラムを終了します」を表示する
		System.out.println("プログラムを終了します");
	}
}
