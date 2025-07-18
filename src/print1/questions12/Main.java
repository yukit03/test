package print1.questions12;
/*
 * 問12
 *上辺xが2、下辺yが3、高さhが4の台形の面積をコンソール画面に表示しましょう。
 *台形の面積を求める次の公式を使用して解答しましょう。
 *面積＝(上底 + 下底)×高さ÷2
 */
public class Main {
	
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int h = 4;
		int menseki = (x + y) * h / 2;
		System.out.println("面積=" + menseki);
	}

}
