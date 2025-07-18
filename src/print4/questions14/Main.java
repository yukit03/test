package print4.questions14;

import java.util.Scanner;

public class Main {
	/*
	 * 問14	N×Nの形で図形を描きます。
	 * キーボードからNの値を入力し、二重for文とif文を用いて図形を描いてください。
	 * 描く図形については、「☆」「★」の２種類が格子状になります。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("入力:");
		int n = sc.nextInt();

//		for (int i = 0; i < n; i++) {
//			if(i%2 == 0) {
//				for(int j =0;j<n;j++) {
//					if(j % 2== 0) {
//						System.out.print("☆");
//					}else {
//						System.out.print("★");
//					}
//				}
//			}else {
//				for (int j = 0; j < n; j++) {
//					if ( j % 2 == 0) {
//						System.out.print("★");
//					} else {
//						System.out.print("☆");
//					}
//				}
//			}
//			System.out.println();
//		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
	}
}
