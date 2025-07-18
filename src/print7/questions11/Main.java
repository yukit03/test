package print7.questions11;

import java.util.Scanner;

public class Main {
	/*
	 * 問11	【文字列操作】
	   キーボードから「りんご ３個」と入力をしてください。
	   入力した文字列を操作して、果物名と個数に分割してください。
	   果物名についてはそのまま表示を行い、個数については助数詞を取り除いて数字だけにしてください。（個を取り除いて、３だけにする）
	   このとき数字については、int型変数にした上で表示をしてください。
	   ※split、replaceAll、Integer.parseInt()を使ってください
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] w = input.split(" ");
		int count = Integer.parseInt(w[1].replaceAll("個", ""));
		System.out.println("果物名：" + w[0]);
		System.out.println("個数：" + count);
	}
}
