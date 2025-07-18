package print4.questions07;

public class Main {
	/*
	 * 問7	while文を使い、aから順にzまで表示させるプログラムを作成してください
     * ※char c = ‘a’の値をインクリメントさせるとcの値は’b’になります。
	 */
	public static void main(String[] args) {
		char c = 'a';
		while(c <= 'z') {
			System.out.print(c);
			c++;
		}
	}
}
