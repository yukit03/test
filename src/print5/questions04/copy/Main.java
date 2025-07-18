package print5.questions04.copy;

public class Main {
	/*
	 * 下記の値は6/28～7/4の大阪市の最高気温です。配列を使用して平均気温を求め、表示しましょう。
	 * 配列tempに初期値として下記の気温を用意する。
	 * 平均気温を求める際、気温の合計にはfor文を利用し、lengthを使ってループ条件を書くこと。
	 */
	public static void main(String[] args) {
		double[] temp = {33.2,33.6,34.9,38.4,34,30.7,27.5};
		double goukei = 0;
		double heikin = 0;
		for(int i=0;i<temp.length;i++) {
			goukei += temp[i];
		}
		heikin = goukei / temp.length;
		System.out.println("平均気温は" + heikin + "度です");
		System.out.printf("平均気温は%.1f度です",heikin);
	}
}
