package print2;

import java.util.Scanner;

public class Questions15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("月を入力してください（1〜12の整数）:");
		int month = sc.nextInt();
		
		//if文
		if (month >= 3 && month <= 5) {
            System.out.println("春です");
        } else if (month >= 6 && month <= 8) {
            System.out.println("夏です");
        } else if (month >= 9 && month <= 11) {
            System.out.println("秋です");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("冬です");
        } else {
            System.out.println("無効な月です");
        }

		if( month < 0 || month > 12) {
			System.out.println("無効な月です");
		}else {
			if( month <= 2) System.out.println("冬です");
			else if( month <= 5) System.out.println("春です");
			else if( month <= 8) System.out.println("夏です");
			else if( month <= 11) System.out.println("秋です");
			else System.out.println("冬です");
		}

		String msg ;
		if( month < 0 || month > 12) {
			msg ="無効な月です";
		}else {
			if( month <= 2) msg= "冬です";
			else if( month <= 5) msg = "春です" ;
			else if( month <= 8) msg = "夏です" ;
			else if( month <= 11) msg = "秋です";
			else msg = "冬です" ;
		}
		System.out.println( msg );
		
	}

}
