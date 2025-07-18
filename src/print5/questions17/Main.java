package print5.questions17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1 9×9の形の二次元配列を宣言してください。（int型配列　変数名MulTable）
		int[][] MulTable = new int[9][9];

		//2 二重for文を使い、MulTableに九九の値をセットしてください
		//（配列のインデックスと九九の桁が異なるため、配列の要素に値を入れるときは少し工夫が必要。）

		
		
		for(int i=0;i<MulTable.length;i++) {
			for(int j=0;j<MulTable[i].length;j++) {
				MulTable[i][j] = (i+1) * (j+1);
			}
		}
		
//		for(int i=0;i<MulTable.length;i++) {
//			for(int j=0;j<MulTable[i].length;j++) {
//				System.out.printf("%3d",MulTable[i][j]);
//			}
//			System.out.println();
//		}

		//3 キーボードから整数値を入力し、それがMulTableに存在するかどうか調べる。
	    // 二重for文とif文を使い、入力値が存在する場合は全ての組み合わせと件数を表示する。
	    // 存在しない場合は、「入力値が九九の表には存在しません」と表示する。

		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力:");
		int input = sc.nextInt();
		int count = 0;
		for(int i=0;i<MulTable.length;i++) {
			for(int j=0;j<MulTable[i].length;j++) {
				if(input == MulTable[i][j]) {
					System.out.println((i + 1) + "×" + (j + 1));
					count++;
				}
			}
		}
		if(count > 0) {
			System.out.println(count + "件見つかりました");
		}else {
			System.out.println("入力値が九九の表には存在しません");
		}
	}
}
