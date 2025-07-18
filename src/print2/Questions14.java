package print2;

import java.util.Scanner;

public class Questions14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1
		System.out.println("文字列を入力してください");
		String s = sc.nextLine();
		boolean b = s.equals("ABC") ? true : false;
		System.out.println("比較結果：" + b);
		
		//2
		System.out.println("数値を入力してください。");
		int a = sc.nextInt();
		System.out.println(a % 2 == 1 ? "奇数です" : "偶数です");
	}
}
