package print3.questions20;

import java.util.Scanner;

public class Main {
	/*
	 * 問20	九九の表のうち、Nの段を表示してください。
     * Nについてはキーボードから入力してください。
     * 範囲外の数値が入力された場合は「範囲外の値です」と表示してください。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nの値：");
		int n = sc.nextInt();
		
		if(0 < n && n < 10) {
			
			for(int i=1;i<=9;i++) {
				System.out.print(n*i + " ");
			}
			
		}else {
			System.out.println("範囲外の値です");
		}
	}

}
