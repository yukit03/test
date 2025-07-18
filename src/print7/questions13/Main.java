package print7.questions13;

import java.util.Scanner;

public class Main {
	/*
	 * 問13	【文字列回転】
	   String strAとString strBにそれぞれキーボードから入力したとき、strAを１文字ずつずらして回転した場合に、strBと文字列が一致するかを調べるプログラムを作成してください。
	   たとえば、leappという文字列とappleという文字列は、leappという文字を１文字ずつ回転させるとleapp→pleap→pplea→appleとなるため文字列は一致します。
	   プログラムを作成する上で以下の条件を満たしてください
	   ①boolean型変数を使う
	   ②for文を使い、for文内でif文を使う
	   ヒント：String型のメソッドとして、length()、substring()、equals()を使います。

	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("文字列：");
		String str = sc.nextLine();
		
		System.out.print("判定用文字列：");
		String value = sc.nextLine();
		
		/*iが1の時
		 * before = l(str.substring(0,i))
		 * after = eapp(i,str.length());
		 * (after + before) = eappl
		 */
		boolean bool = false;
		for(int i=0;i<str.length();i++) {
			String before = str.substring(0,i);
			String after = str.substring(i,str.length());
			if((after + before).equals(value)) {
				bool = true;
				break;
			}
		}
		if(bool) {
			System.out.println(str + "と" + value + "は、文字をずらすと一致します");
		}else {
			System.out.println(str + "と" + value + "は、文字をずらしても一致しません");
		}
	}
}
