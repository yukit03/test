package print5.questions18;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//(1) int型配列aryを要素数20で宣言してください
		int[] ary = new int[20];

		//(2) aryの各要素に、乱数を用いて０～９９の値をセットしてください。
		Random rand = new Random();
		for(int i=0;i<ary.length;i++) {
			ary[i] = rand.nextInt(100);
		}

		//(3) aryの要素を全部表示してください
		for(int i=0;i<ary.length;i++) {
			System.out.print(ary[i]);
			if(i < ary.length -1) {
				System.out.print("  ");
			}
		}
		
		Arrays.sort(ary);
		//(4) aryを二重for文、if文を使い昇順で並び替えてください。
//		for(int i = 0;i<ary.length-1;i++) {
//			for(int j = 0;j<ary.length-1-i;j++) {
//				if(ary[j]>ary[j+1]) {
//					int keep = ary[j];
//					ary[j]=ary[j+1];
//					ary[j+1]=keep;
//				}
//			}
//		}
		
//		for(int i=0;i<ary.length -1;i++) {
//			for(int j=i + 1;j<ary.length;j++) {
//				if(ary[i] > ary[j]) {
//					int min = ary[j];
//					ary[j] = ary[i];
//					ary[i] = min;
//				}
//			}
//		}
		System.out.println();
//		int [] check = new int[100];
//		for(int i = 0;i<ary.length;i++) {
//
//			check[ary[i]]++;
//		}
//
//		for(int i = 0;i<check.length;i++) {
//			if(check[i]>0) {
//				for(int j = 0;j<check[i];j++) {
//					System.out.print(i+"  ");
//				}
//			}
//		}

		//(5) aryの要素を再度全部表示してください
	
		for(int i=0;i<ary.length;i++) {
			System.out.print(ary[i]);
			if(i < ary.length -1) {
				System.out.print("  ");
			}
		}

		//		sortArray2(ary);
		//		sortArray3(ary);
		//		Arrays.sort(ary);
		//		showArray(ary);
	}

	/**
	 * 配列をソートするメソッドNo3
	 * @param array
	 */
	public static void sortArray3(int [] array) {

		int [] check = new int[100];
		for(int i = 0;i<array.length;i++) {

			check[array[i]]++;
		}

		for(int i = 0;i<check.length;i++) {
			if(check[i]>0) {
				for(int j = 0;j<check[i];j++) {
					System.out.print(i+"  ");
				}
			}
		}
	}

	/**
	 * 配列をソートするメソッドNo2
	 * @param array
	 */
	public static void sortArray2(int [] array) {

		for(int i=0;i<array.length -1;i++) {
			for(int j=i + 1;j<array.length;j++) {
				if(array[i] > array[j]) {
					int min = array[j];
					array[j] = array[i];
					array[i] = min;
				}
			}
		}
	}
	/**
	 * 配列を表示するメソッド
	 * @param array
	 */
	public static void showArray(int [] array) {

		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}

	}

	public static void setArray(int [] ary) {
		Random rand = new Random();
		for(int i=0;i<ary.length;i++) {
			ary[i] = rand.nextInt(100);
		}
	}
}

