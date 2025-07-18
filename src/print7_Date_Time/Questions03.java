package print7_Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Questions03 {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日（E） HH時mm分ss秒");
		
		LocalDateTime local = LocalDateTime.now();
		String s = local.format(fmt);
		System.out.println(s);
		
	}
}
