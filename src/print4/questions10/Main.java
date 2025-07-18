package print4.questions10;

import java.util.Scanner;

public class Main {
	/*
	 * 問10	N×Nの形で図形を描きます。
     * キーボードからNの値を入力し、二重for文とif文を用いて図形を描いてください。
     * 問９とは異なり、今回は奇数段は「★」、偶数段は「☆」になります。
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nの値は：");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i % 2 == 0) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
	}
}
