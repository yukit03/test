package print5.questions13.copy;

import java.util.Random;

public class Main {
	/*
	 * 以下の要素の値として持つ配列omikuziを作り、乱数を用いておみくじ結果を表示しましょう
     * 要素の中身は以下の通り。if文、for文を使用せずに結果を表示すること。
	 */
	public static void main(String[] args) {
		String[] omikuzi = {"凶","吉","中吉","大吉"};
		
		Random rand = new Random();
		//int r = rand.nextInt(omikuzi.length);
		System.out.println(omikuzi[rand.nextInt(omikuzi.length)]);
	}
}
