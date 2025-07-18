package print5.questions09.copy;

public class Main {
	/*
	 * int型配列aとint型配列bがあります。それぞれ初期値は以下の通りです
	 * a={30,50,10,20},b={5,3,9,7}
     * int型配列cを定義し、配列aと配列bの各列を合計した値を配列ｃに代入してください。
     * その後、配列cの中身を表示してください。
	 */

	public static void main(String[] args) {
		int[] a = {30,50,10,20};
		int[] b = {5,3,9,7};
		
		int[] c = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			c[i] = a[i] + b[i];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i] + " ");
		}
	}
}
