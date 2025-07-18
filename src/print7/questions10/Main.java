package print7.questions10;

import java.util.Scanner;

public class Main {
	/*
	 * 問10	【正規表現】
	   郵便番号を表す正規表現を使って、
	   キーボード入力した文字が郵便番号を表すかどうか判定するプログラムを作りましょう。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in ) ;
		System.out.print(">> " );
		String s = sc.nextLine();  
		
		//123-4567の「3桁-4桁」の形かどうかにする
		String  postCodePattern = "^[0-9]{3}-[0-9]{4}$" ;// \\d{3}-\\d{4} も可
		if(s.matches(postCodePattern)){
			 System.out.println("郵便番号です");
		}else{
			 System.out.println("郵便番号ではありません。");
		}

	}
}
