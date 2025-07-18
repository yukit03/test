package print1.questions08;

//問8
//int型の変数x、yに数値-5、-2をそれぞれ代入し、実行結果の表示になるプログラムを作成しましょう。
//絶対値を取得するにはMath.abs(①);を使う。
//二つの値のうち最大値を取得するにはMath.max(①,②);を使う。
//二つの値のうち最小値を取得するにはMath.min(①,②);を使う。
//※①及び②には変数が入る。

public class Main {
	
	public static void main(String[] args) {
		int x = -5;
		int y = -2;
		
		int abs = Math.abs(x);
		int max = Math.max(x, y);
		int min = Math.min(x, y);

		System.out.println("xの絶対値：" + abs);
		System.out.println("xとyの最大値：" + max);
		System.out.println("xとyの最小値：" + min);
		
//		System.out.println("xの絶対値：" + Math.abs(x));
//		System.out.println("xとyの最大値：" + Math.max(x, y));
//		System.out.println("xとyの最小値：" + Math.min(x, y));
	}

}
