package print3.questions14;

import java.util.Scanner;

public class Main {
	/*
	 *問14 switch文とfor文を用いて以下の内容のプログラムを作成しましょう。
     *キーボードから「upcount」もしくは「downcount」を入力させる。それ以外の入力がされた場合は「入力値が不正です。」と表示する。
	 *upcountの場合は１から１０までカウントを増やして表示する。
	 *downcountの場合は１０から１までカウントを減らして表示する。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力値：");
		String str = sc.nextLine();
		
		switch(str) {
		case "upcount":
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
			break;
		case "downcount":
			for(int i=10;i>=1;i--) {
				System.out.println(i);
			}
			break;
		default:System.out.println("入力値が不正です。");
		}
	}
}
