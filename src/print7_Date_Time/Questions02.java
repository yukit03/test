package print7_Date_Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Questions02 {
	public static void main(String[] args) {
		//表示書式でデータフォーマットを宣言
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日(E) HH時mm分ss秒");
		//カレンダークラスで現在時間を取得
		Calendar cal = Calendar.getInstance();
		//日付クラスにする
		Date d = cal.getTime();
		//書式フォーマットを使って日付を文字列にする
		String str = sdf.format(d);
		//表示
		System.out.println(str);
	}
}
