package print7.questions01;

import java.util.Scanner;

public class Main {
	/*
	 * 問1	【文字列比較】
       String型変数strAとstrBに、それぞれにキーボードから文字列を入力させ、
       aとbの内容が等しいかどうかを調べ、「等しい」または「等しくない」を表示するプログラムを書きましょう。
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("strA:");
		String strA = sc.nextLine();
		System.out.print("strB:");
		String strB = sc.nextLine();
		
		if(strA.equals(strB)) {
			System.out.println("strAとstrBは等しいです");
		}else {
			System.out.println("strAとstrBは等しくないです");
		}
		
	}

}
