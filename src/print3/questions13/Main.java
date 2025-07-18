package print3.questions13;

public class Main {
	public static void main(String[] args) {
		/*
		 * 問13	for文とif文を使い、以下の内容のプログラムを作成しましょう。
         * 5回ループさせ、1回目と3回目、5回目ループ時は「奇数です」を表示し、
         * 2回目と4回目は「偶数です」と表示させる。　
		 */
		for(int i=1;i<=5;i++) {
			if(i % 2 == 0) {
				System.out.println("偶数です");
			}else {
				System.out.println("奇数です");
			}
		}
	}
}
