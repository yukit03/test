package print4.questions09;

import java.util.Scanner;

public class Main {
	/*
	 * 問9	N×Nの形で図形を描きます。
     * キーボードからNの値を入力し、二重for文を用いて図形を描いてください。
     * 表示する記号は「☆」になります。
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nの値は：");
		int n = sc.nextInt();
		//n=3
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
