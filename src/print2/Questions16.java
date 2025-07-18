package print2;

import java.util.Random;
import java.util.Scanner;

public class Questions16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("自分の手を入力。グー：０、チョキ：１、パー：２");
		int myhand = sc.nextInt();

		if(myhand >=0 && myhand <=2) {//自分の手がグーチョキパーのいずれかの場合

			int npchand = rand.nextInt(3);//NPCの手を取得

			//自分の手を表示
			if(myhand == 0) {
				System.out.println("あなたの手はグーです");
			}else if(myhand == 1) {
				System.out.println("あなたの手はチョキです");
			}else {
				System.out.println("あなたの手はパーです");
			}

			//相手の手を表示
			if(npchand == 0) {
				System.out.println("NPCの手はグーです");
			}else if(npchand == 1) {
				System.out.println("NPCの手はチョキです");
			}else {
				System.out.println("NPCの手はパーです");
			}
			
			
			//お互いの手から勝利判定
			if((myhand == 0 && npchand == 1) || (myhand == 1 && npchand == 2) || (myhand == 2 && npchand == 0)) {
				System.out.println("あなたの勝ちです");
			}else if((myhand == 0 && npchand == 2) || (myhand == 1 && npchand == 0) || (myhand == 2 && npchand == 1)) {
				System.out.println("あなたの負けです");
			}else {
				System.out.println("あいこです");
			}

			/*
			switch( (myhand - npchand + 3 ) % 3 ) {
				// 差が -1 ( 2 ) ならあなたの勝ち
				// 差が 1  ならあなたの負け
				// 差が 0  なら引き分け
				case 0->System.out.println("あいこです");
				case 1->System.out.println("あなたの負けです");
				case 2->System.out.println("あなたの勝ちです");
			}
			*/
			
		}else {//グーチョキパー以外のとき
			System.out.println("入力が不正です");
		}
		
		
	}
}
