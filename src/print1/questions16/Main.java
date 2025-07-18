package print1.questions16;

import java.util.Scanner;
/*
 * 問16
 *変数name 、ageを使用して
 *キーボードから入力した下記の名前と年齢を表示してください。
 */

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力：");
		String name = sc.nextLine();
		System.out.print("年齢を入力：");
		int age = sc.nextInt();
		System.out.println(name + "さんの年齢は" + age + "です");
		
		sc.close();
	}

}
