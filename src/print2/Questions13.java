package print2;

import java.util.Random;

public class Questions13 {
	public static void main(String[] args) {
		//合格科目を数える
		int count = 0;
		//ランダムな値で科目ごとの点数を入れる
		Random rand = new Random();
		int a1 = rand.nextInt(101);
		if(a1 >= 60) {
			count++;
		}
		int a2 = rand.nextInt(101);
		if(a2 >= 60) {
			count++;
		}
		int a3 = rand.nextInt(101);
		if(a3 >= 60) {
			count++;
		}
		int a4 = rand.nextInt(101);
		if(a4 >= 60) {
			count++;
		}
		int a5 = rand.nextInt(101);
		if(a5 >= 60) {
			count++;
		}
		
		System.out.println("A君の成績　英語：" + a1 + "点、国語：" + a2 + "点、数学：" + a3 + "点、社会：" + a4 + "点、理科：" + a5 + "点" );
		System.out.println("合格した科目数：" + count + "科目");
	}

}
