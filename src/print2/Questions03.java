package print2;

import java.util.Scanner;

public class Questions03 {

	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);

		System.out.print("整数値を入力:");
		int a = sc.nextInt();
		System.out.print("整数値を入力:");
		int b = sc.nextInt();
		//2
		if(a > b) {
			System.out.println("aはbより大きいです。");
		}else if(a == b){
			System.out.println("aとbは等しいです");
		}else{
			System.out.println("aはbより小さいです");
		}
	}

}
