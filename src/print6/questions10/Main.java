package print6.questions10;

import java.util.Random;
import java.util.Scanner;

public class Main {
	/*
	 * メソッド名： getAverage
	   引数：double[] array
	   戻り値の型：double
	   処理の内容： 引数で受け取る配列の要素の平均値を呼び出し元のmainメソッドに返す。
	 */
	public static double getAverage(double[] array) {
		double sum = 0;
		//double avg = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		//avg = sum / array.length;
		return sum / array.length;
		
	}
	
	/*
	 * メソッド名：printAry
       引数：double[] d
       戻り値の型：なし
       処理の内容：引数で受け取った配列を拡張for文で全て表示する。
		「乱数値は〇〇〇です」という形で出力表示する。
	 */
	public static void printAry(double[] d) {
		for(double val : d) {
			System.out.println("乱数値は" + val);
		}
	}
	
	/*
	 * メソッド名：getAry
       引数：int a
       戻り値の型：double[]
       処理の内容：①引数で受け取ったint型変数aの要素数のdouble型配列を宣言する。
		　　　     ②for文と乱数を使い、配列の各要素に0.0～1.0の間の値を代入する。
		　　　     ③printAryメソッドに配列を引数として渡しメソッドを呼び出す。
　　               ④配列を戻り値として返す。
	 */
	public static double[] getAry(int a) {
		double[] array = new double[a];
		Random rand = new Random();
		for(int i=0;i<array.length;i++) {
			array[i] = rand.nextDouble();
		}
		printAry(array);
		return array;
	}

	public static void main(String[] args) {
		//1 int型変数nを宣言し、キーボードから入力を行う。 
		Scanner sc = new Scanner(System.in);
		System.out.print("何回乱数を発生させますか？：");
		int n = sc.nextInt();
		//2 変数nをgetAryメソッドに引数として渡し、戻り値を受け取る。
		double[] d = getAry(n);
		//3 getAverageメソッドに②で受け取った戻り値を引数として渡し、戻り値を受け取る。
		double heikin = getAverage(d);
		//4 平均値は（③の戻り値）です」という形で表示する。
		System.out.println("平均値は" + heikin + "です");
	}
}
