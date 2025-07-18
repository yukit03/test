package print3.questions19;

public class Main {
	/*
	 * 問19	整数の累積和を計算し、その都度結果を表示するプログラムを作成してください。
     * ループ回数は１０回とします。
	 */
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum = sum + i;
			System.out.println(sum);
		}
	}

}
