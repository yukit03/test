package print5.questions05;

public class Main {
	/*
	 * 各科目を要素の値に持つString型の配列ｓと、各点数を要素の値に持つint型の配列aを作り、
     * 実行結果例のような表示をしてください。(実行結果の表示についてはfor文を使用)
	 */
	public static void main(String[] args) {
		String[] s = {"英語","国語","数学","社会","理科"};
		int[] a = {75,80,60,90,55};
		
		System.out.print("A君：");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i] + " " + a[i] + "点");
			if(i < s.length - 1) {
				System.out.print("、");
			}
		}
	}
}
