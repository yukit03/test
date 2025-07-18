package print6.questions02;

public class Main {
	/*
	 *  メソッド名： printMsg
		引数： String message
		戻り値：なし
		処理の内容： 引数で渡されたメッセージ”Hello”を出力表示する
		ヒント：メソッドの宣言は次のようになる
		public static void printMsg (String message) { 処理コード記入 }
		
	 */								//"Hello"
	public static void printMsg(String message) {
		
		System.out.println(message);
		
	}

	/*
	 * メソッド名：main
	   引数：String[] args
	　 戻り値：なし
	　 処理の内容：①String型変数にHelloを代入
      			   ②printMsgメソッドを呼び出す (引数を渡す)
	 */
	public static void main(String[] args) {
		String mes = "Hello";
		printMsg(mes);
		
	}
}
