package print6.questions06;

import java.util.Random;

public class Main {
	/* ※配列を使ってください
	 * メソッド名： getWeatherMessage
		引数：なし
		戻り値の型： String
		処理の内容： 天気予報メッセージをランダムに生成して、そのメッセージの文字列を返す。
		天気予報メッセージは、次の中からランダムに組み合わせて作り出すものとする。
		「{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。」のString型の文字列を返す。
		例：明日の天気は雨でしょう。
		ヒント：引数なしなので、メソッド呼び出し時に渡す値はありません。
		配列の宣言はWeatherメソッドの中で行い、String配列は２個使います。
	 */
	public static String getWeatherMessage() {
		String[] day = {"今日","明日","明後日"};
		String[] wea = {"晴れ","曇り","雨","雪"};
		Random rand = new Random();
		String message = day[rand.nextInt(day.length)] + "の天気は" + wea[rand.nextInt(wea.length)] + "でしょう";		
		return message;
	}
	/*
	 * メソッド名：main
		引数：String[] args
	　  戻り値：なし
	    処理の内容：①getWeatherMessageメソッドを呼び出し、String型変数で戻り値を受け取る
	　　　          ②String型変数の内容を表示する。
	 */
	public static void main(String[] args) {
		String mes = getWeatherMessage();
		System.out.println(mes);
	}
}
