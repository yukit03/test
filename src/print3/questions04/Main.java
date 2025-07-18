package print3.questions04;

public class Main {
	/*
	 * 問4　for文を使い、１～１０までの整数の合計を表示するプログラムを作りましょう。
     * ※数値の加算等を行った場合、結果を保持するための変数を用意する必要が出てきます。
	 */
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
			//sum = sum + i ;
		}
		System.out.println(sum);
	}
}
