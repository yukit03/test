package print7.questions03;

public class Main {
	/*
	 * 問3	【文字列の切り出す】
      「にほんむかしばなし」という文字列を前から７番目にある文字を切り出して表示しましょう。
      「むかし」の文字列だけを切り出して表示するプログラムを書きましょう。
	  「にほんむかしばなし」を縦表示するプログラムを書きましょう。
	 */
	public static void main(String[] args) {
		String str ="にほんむかしばなし";
		//7文字目は「ば」になるが、先頭は0から数えるため6になる
		System.out.println("7文字目：" + str.charAt(6));
		//0に1ほ2ん3む4か5し6ば7な8し
		System.out.println(str.substring(3, 6));
		
		//charAtを使った場合
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
	}
}
