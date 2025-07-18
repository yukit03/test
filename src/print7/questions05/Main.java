package print7.questions05;

import java.util.Scanner;

public class Main {
	/*
	 * 【文字列加工、StringBuilder】
	String s = " Let it go. " ;  // 「空白Let空白it空白go.空白」になっている
	この文字列に対して以下の処理を行ってください。
	1)  s の先頭と末尾の空白文字の塊を取り除いたもの変数s1に代入してから表示する。
	2)  s1が空かどうか判定してください。
	    空の場合は「空白です」を表示します。
	　　空ではない場合は、文字を反転表示させてください。(for文)
	3)  s1 に「t」の文字が何個存在しているか数を表示する。
4)  s1 に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
　　※splitを使ってください
	5)  StringBuilder を使って、4)の配列の中の単語を連結し、表示する
	6)  5)で連結した文字列を反転表示してください。
	　　※上に記載しているStringBuilderクラスにあるメソッドを確認から調べてください。

	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = " Let it go. " ;
		//1) s の先頭と末尾の空白文字の塊を取り除いたもの変数s1に代入してから表示する。
		String s1 = s.trim();
		System.out.println(s1);
		
		/*
		 * 2)s1が空かどうか判定してください。
	         空の場合は「空白です」を表示します。
	　　     空ではない場合は、文字を反転表示させてください。(for文)
		 */
		if(s1.isEmpty()) {
			System.out.println("空白です");
		}else {
			for(int i=s1.length()-1;i>=0;i--) {
				System.out.print(s1.charAt(i));
			}
		}
		System.out.println();
		
		//3)s1 に「t」の文字が何個存在しているか数を表示する。
		int count = 0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) == 't') {
				count++;
			}
		}
		System.out.println(count);
		
		//4)s1 に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
		//※splitを使ってください
		String[] words = s1.split(" ");
		System.out.println(words.length);
		
		//5)StringBuilder を使って、4)の配列の中の単語を連結し、表示する
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<words.length;i++) {
			sb.append(words[i]);
		}
		System.out.println(sb);
		
		//6) 5)で連結した文字列を反転表示してください。
		//※上に記載しているStringBuilderクラスにあるメソッドを確認から調べてください。
		sb.reverse();
		System.out.println(sb.toString());
	}
}
