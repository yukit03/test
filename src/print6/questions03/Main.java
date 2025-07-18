package print6.questions03;

public class Main {
	/*
	 * メソッド名： printMsg2
		引数： String message, int count
		戻り値：なし
		処理の内容： 文字列 message を、count の回数だけ繰り返し出力表示する
		Messageが”Hello”で、countが５の場合、"Hello"という文字が5回表示される
	 */									//"Hello"    5
	public static void printMsg2(String message,int count) {
		for(int i=0;i<count;i++) {
			System.out.println(message);
		}
	}
	/*
	 * メソッド名：main
	   引数：String[] args
	 　戻り値：なし
	　 処理の内容：①String型変数にHelloを代入
		　　　     ②int型変数に5を代入
		　　　     ③printMsg2メソッドを呼び出す
	 */
	public static void main(String[] args) {
		String str = "Hello";
		int count = 5;
		printMsg2(str,count);
		
	}
}
