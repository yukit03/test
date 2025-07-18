package print4.questions15;

import java.util.Random;

public class Main {
	
	/*
	 * 問15	ビンゴカードを作成します。
     * 順番に表示を行い、１２番目（真ん中）は「☆」を表示するようにしてください。
     * 実行結果例の形になるように、縦５行、横５列になるように二重for文を回してください。
     * 数値については、「前の値＋乱数範囲（１～５）」となるようにすることで、
     * 少しずつ大きな値が表示されるようになります。（前の値を一時的に保管するための変数を用意すること）
     * 数値が１桁の場合は「半角スペース＋値＋半角スペース」で調整してください
     * 数値が２桁の場合は「値＋半角スペース」で調整してください。
     * ☆を表示する場合は「☆＋半角スペース」で調整してください。
	 */
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int val = 0;	//現在値
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==2 && j==2) {
					System.out.print("☆ ");
				}else {
					val = rand.nextInt(5) + 1 + val;
					if(val < 10) {
						System.out.print(" " + val + " ");
					}else {
						System.out.print(val + " ");
					}
				}
			}
			System.out.println();
		}
	}

}
