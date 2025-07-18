package print1.questions13;

import java.util.Scanner;
/*
 * 問13
 *変数x , yにキーボードから数値15 , 33をそれぞれ代入し、変数zに合計を代入し、表示しましょう。
 *※変数xはString型、変数yはint型とし、変数xについては文字列を数値に変換してください。
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("xの値を入力：");
		String x = sc.nextLine();
		System.out.print("yの値を入力：");
		int y = sc.nextInt();
		
		int z = Integer.parseInt(x) + y;
		System.out.println("z=" + z);
		
		sc.close();
	}
}
