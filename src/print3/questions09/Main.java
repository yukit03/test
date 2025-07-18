package print3.questions09;

public class Main {
	/*
	 *問9 while文を使い１～１０までの整数の合計を表示するプログラムを作りましょう。
     *※数値の加算等を行った場合、結果を保持するための変数を用意する必要が出てきます。
	 */
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
