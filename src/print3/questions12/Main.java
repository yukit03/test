package print3.questions12;

import java.util.Scanner;

public class Main {
	/*
	 * 問12	 for文を使い、実数を5回入力し平均を表示するプログラムを作りましょう。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avg = 0;
		double sum = 0;
		
		for(int i=0;i<5;i++) {
			System.out.print("入力:");
			double d = sc.nextDouble();
			sum += d;
		}
		avg = sum / 5;
		System.out.println("平均:"+avg);//6.82
		//System.out.printf("合計：%.1f",avg);//合計：6.8
	}
}
