package print2;

import java.util.Scanner;

public class Questions07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("受験者番号を入力：");
		int num = sc.nextInt();
		
		
		if(num == 1105 || num == 1200 || num == 1311) {
			System.out.println(num + "番は合格です");
		}else {
			System.out.println(num + "番は不合格です");
		}
	}
}
