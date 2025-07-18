package print5.questions11;

public class Main {
	/*
	 * 下記値を要素の値として持つ配列cを作り、最大値と最小値を取得し表示しましょう。
     *（省略記法の②で初期値にする）
     * ループ条件にはlengthを利用すること。
     * 最小値を持たせるための変数をint型minとする。
     * ｍinの初期値については、int型の持てる最大値になるInteger.MAX_VALUEを使うこと。
     * 最大値を持たせるための変数をint型maxとする。
     * maxの初期値については、int型の持てる最小値になるInteger.MIN_VALUEを使うこと。
	 */
	public static void main(String[] args) {
		int[] c = {25,94,89,10,3,14,11,67};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		

		for(int i=0;i<c.length;i++) {
			if(c[i] > max) {
				max = c[i];
			}
			
			if(c[i] < min) {
				min = c[i];
			}
		}
		
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}
}
