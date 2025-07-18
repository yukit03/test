package print1.questions19;

import java.util.Random;
/* 
 * 問19
 *-5～5までのランダムな数値を発生させて、
 *変数rに発生させた乱数値を代入し表示してください。
 */
public class Main {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		//int a = rand.nextInt(11) - 5;
		int a = rand.nextInt(-5,6); 
		System.out.println("乱数値：" + a);
	}

}
