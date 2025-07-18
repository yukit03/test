package print2;

import java.util.Scanner;

public class Questions05 {

	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);

		System.out.print("入力:");
		int a = sc.nextInt();
		//2
		if(a <= 0) {
			System.out.println("0以下の値が入力されました");
		}else {//3
			if(a % 2 == 0) {//3-1
				System.out.println("その値は偶数です");
			}else {//3-2
				System.out.println("その値は奇数です");
			}
		}
	}
}
