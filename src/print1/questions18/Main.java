package print1.questions18;

import java.util.Random;
import java.util.Scanner;

/*
 * 問18
 *int型変数nにキーボードから値を入力させ、
 *０～ｎまでのランダムな数値を発生させて値を表示してください。
 *(nは含まない)
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数n:");
		int n = sc.nextInt();
		String s = "1000";
		
		int r = rand.nextInt(n);
		System.out.println("乱数値：" + r);
		
	}

}
