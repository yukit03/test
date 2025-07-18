package print1.questions17;

import java.util.Random;

/*
 * 問17
 *０～９９までのランダムな数値を発生させて、
 *変数rに発生させた乱数値を代入し表示してください。
 */
public class Main {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int a = rand.nextInt(100);
		System.out.println("乱数値：" + a);
		
		
	}

}
