package print6.questions13;

import java.util.Scanner;

public class Main {
	Scanner sc;
	/*
	 * 以下の内容でリファクタリングしてください。
       次のプログラムの ３つ領域 （キー入力部分、処理部分、表示部分）をそれぞれメソッド化し、これらのメソッドを使ったプログラムに書き直してください。
       キー入力部分、処理部分、表示部分のメソッド名は、それぞれ、inputNumber、numberToMessage、showMessage とします。
       mainメソッドからの呼び出しも記述してください。
	 */

	public static void main(String[] args) {
//		int  inNumber ;
//		Scanner sc = new Scanner( System.in );
//		System.out.print("整数を入力: ");
//		inNumber = sc.nextInt();

//		String msg = "" ;
//		switch( inNumber ){
//		case 1 :
//			msg = "Good Morning" ; 
//			break ;
//		case 2 :
//			msg = "Good Afternoon" ; 
//			break ;
//		case 3 : 
//			msg = "Good Evening" ; 
//		}
//
//		System.out.println( msg ) ;
		
		int n = inputNumber();
		String m = numberToMessage(n);
		showMessage(m);

		//showMessage(numberToMessage(inputNumber()));
	}
	/*
	 * キー入力部分(inputNumber)
       引数：なし
       戻り値：int
	 */
	public static int inputNumber() {
		
		int  inNumber ;
		Scanner sc = new Scanner( System.in );
		System.out.print("整数を入力: ");
		inNumber = sc.nextInt();
		
		return inNumber;

	}

	/*
	 * 処理部分(numberToMessage)
	   引数：int
	   戻り値: String
	 */
	public static String numberToMessage(int number) {
		
		String msg = "" ;
		switch( number ){
		case 1 :
			msg = "Good Morning" ; 
			break ;
		case 2 :
			msg = "Good Afternoon" ; 
			break ;
		case 3 : 
			msg = "Good Evening" ; 
		}
		

		return msg;
	}

	/*
	 * 表示部分(showMessage)
       引数：String
	   戻り値：なし

	 */
	public static void showMessage(String mes) {		
		System.out.println( mes ) ;
	}


}