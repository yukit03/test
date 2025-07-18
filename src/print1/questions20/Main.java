package print1.questions20;

import java.util.Random;
/*
 * 問20
 *0.0から1.0までのランダムな数値を発生させて、
 *変数rに発生させた乱数値を代入し表示してください。
 */
public class Main {
	
	public static void main(String[] args) {
		Random rand = new Random();
		double d = rand.nextDouble();
		System.out.println("乱数値：" + d);
		
	}

}
