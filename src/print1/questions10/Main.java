package print1.questions10;

//問10
//int型の変数x、yに数値19、31をそれぞれ代入し、
//合計値、平均値を求め、合計値を変数sum、平均値を変数aveに代入したあと、
//コンソール画面に表示させましょう。
public class Main {
	
	public static void main(String[] args) {
		int x = 19;
		int y = 31;
		int sum = x + y;
		int ave = sum / 2;
		
		System.out.println("合計は" + sum + "です");
		System.out.println("平均は" + ave + "です");
	}

}
