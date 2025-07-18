package print2;

import java.util.Scanner;

public class Questions06 {

	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("整数値aを入力:");
		int a = sc.nextInt();
		System.out.print("整数値bを入力:");
		int b = sc.nextInt();
		System.out.print("整数値cを入力:");
		int c = sc.nextInt();
		//2 最大、最小の初期値をaに設定する
		int max = 0;
		int min;
		
		//3
		max = a;
		min = a;
		
		//4
		if(b > max) {
			max = b;
		}
//		}else {
//			max = c;
//		}
		if(c > max) {
			max = c;
		}
		
		//5
		if(min > b) {
			min = b;
		}
		
		if(min > c) {
			min = c;
		}
		
		//6
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}

}
