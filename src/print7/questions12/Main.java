package print7.questions12;

import java.util.Scanner;

public class Main {
	/*
	 * 問12	【回文】：上から読んでも下から読んでも同じになる文や言葉のこと
	   キーボードから入力した文字列が回文かどうかを判定するプログラムを作成してください。
	   条件の以下の通りです。
       ①文字列は３文字以上であること。３文字未満の場合は再度入力を求める。
       ②条件判定時trueの場合は「回文です」を表示、false時は「回文ではありません」を表示
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while(str.length() < 3) {
			System.out.print("文字：");
			str = sc.nextLine();
		}
		
//		boolean bool = true;
//		for(int i =0;i<str.length();i++) {
//			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
//				bool = false;
//				break;
//			}
//			
//		}
//		
//		if(bool) {
//			System.out.println("回文です");
//		}else {
//			System.out.println("回文ではないです");
//		}
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if(sb.toString().equals(str)) {
			System.out.println("回文です");
		}else {
			System.out.println("回文ではないです");
		}
		
	}
	
}
