package print7.questions15;

public class Main {
	/*
	 * 問15【文字列操作】
	 
       String[] strArray = {
	   "#名前,年齢,性別",
	   "Alice,20,女性",
	   "Bob,21,男性",
	   "Carol,19,女性"
         };

	   strArrayのような配列の形で、名前、年齢、性別をコンマ区切りで保持しているデータがあります。
	   この配列を操作して、String[][] datasという変数に要素ごとに分割してデータを格納してください。（
	   宣言：String[][] datas = new String[strArray.length][]; とする）
	   このとき、strArrayのヘッダーにあたる1行目("#名前,年齢,性別")については、
	   #が先頭についているため処理をスキップしてください。
	   #が付いていない行については、コンマでsplitを行って一次元配列にした上で、datasの二次元配列に格納してください。
	   strArrayのデータをdatasに格納した後、datasの配列を順番に回してください。(二重for文)
	   正規表現を用いて、年齢の列は表示をせずに、名前と性別だけ表示するようにしてください。
	   ※処理の途中に、strArrayの要素数とdatasの要素数が異なるため(#の処理を飛ばしているため)、
	   NullPointerExceptionという赤いエラーが出ないように注意してください。
	   これは参照先がありませんというエラーになります。ループ回数に気を付けてください。
	 */
	public static void main(String[] args) {
		String[] strArray = {
			"#名前,年齢,性別",
			"Alice,20,女性",
			"Bob,21,男性",
			"Carol,19,女性"
		};
		String[][] datas = new String[strArray.length][];//有効データを格納
		int count = 0;//有効データ数
		for(int i=0;i<strArray.length;i++) {
			//#から始まるのはスキップする
			if(strArray[i].startsWith("#")) {
				continue;
			}
			//コンマ区切りのデータを分割する
			String[] s = strArray[i].split(",");
			
			//datas配列に分割されたデータ配列を入れる
			//datas[i]= s;//datas[0]に何も入らずnullになる
			datas[count]= s;
			//有効データ数をカウント取る
			count++;
		}
		
		/*				0				1			  2        3
		 * datas{{Alice,20,女性},{Bob,21,男性}.{Carol,19,女性}{}};
		 * 			0    1   2     0   1   2      0    1   2 
		 */
		
		//名前と性別のみ表示する
		for(int i=0;i<count;i++) {
			for(int j=0;j<datas[i].length;j++) {
									//数字じゃないものの１回以上の繰り返し
				if(datas[i][j].matches("[^0-9]+")) {
					System.out.print(datas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
