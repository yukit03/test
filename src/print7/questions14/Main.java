package print7.questions14;

import java.util.Scanner;

public class Main {
	/*
	 * 問14	【文字列回転】
	   問１３のプログラムをlength()とcontains()メソッドを用いた形で作成してください。
	   ヒント：strAを加工した文字列の中に、strBが含まれているかどうかを調べる形になります。
	 */

	/*
	 * str_2 = leappleapp
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("文字列：");
		String str = sc.nextLine();

		System.out.print("判定用文字列：");
		String value = sc.nextLine();

		String str_2 = str + str;

		if(str.length() == value.length() && str_2.contains(value)) {
			System.out.println(str + "と" + value + "は、文字をずらすと一致します");
		} else {
			System.out.println(str + "と" + value + "は、文字をずらしても一致しません");

		}
	}

}
