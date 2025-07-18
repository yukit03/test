package print7_Date_Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Questions01 {
	public static void main(String[] args) {
		Date now = new Date();
		
		//Mon Apr 17 14:36:04 GMT+09:00 2023 
		System.out.println(now);//現在時刻
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf.format(now));//2023/04/17 02:37:31
		
	}
}
