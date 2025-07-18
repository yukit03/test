package print5.questions03.copy;

public class Main {
	/*
	 * String型配列yの各要素を下記の値で初期化し、ループ文を使用して順番に表示しましょう。
     * スッキリJAVA第四版P147　4.2.4省略記法の②の書き方で書く。
     * ループ条件には「要素数の長さ」を利用すること
	 */
	public static void main(String[] args) {
		String[] y = {"Bob","John","Alice","Carol","Charlie"};
		for(int i=0;i<y.length;i++) {
			System.out.println("y[" + i + "]:" + y[i]);
		}
	}
}
