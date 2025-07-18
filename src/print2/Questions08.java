package print2;

import java.util.Scanner;

public class Questions08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("受験者番号を入力：");
		int num = sc.nextInt();

//		switch(num) {
//		case 1105:System.out.print(num + "番は合格です");
//		break;
//		case 1200:System.out.print(num + "番は合格です");
//		break;
//		case 1311:System.out.print(num + "番は合格です");
//		break;
//		default:System.out.print(num + "番は不合格です");
//		}

		//下の形でも良い
		switch(num) {
		case 1105:
		case 1200:
		case 1311:System.out.print(num + "番は合格です");
		break;
		default:System.out.print(num + "番は不合格です");
		}
	}

}
