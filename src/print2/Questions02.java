package print2;

import java.util.Scanner;

public class Questions02 {
	
	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力：");
		int a = sc.nextInt();
		//2
		if(a > 5) {
			System.out.println("5より大きい値です");
		}else {
			System.out.println("5以下の数値です");
		}
	}

}
