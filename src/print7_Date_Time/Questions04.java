package print7_Date_Time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Questions04 {
	public static void main(String[] args) {
		//LocalDateTimeを日時指定で作る
		LocalDateTime ldt1 = LocalDateTime.of(1995, 1, 17, 5, 46, 52);
		LocalDateTime ldt2 = LocalDateTime.of(2011, 3, 11, 14, 46, 18);

		//LocalDate型への変換
		LocalDate ld1 = ldt1.toLocalDate();
		LocalDate ld2 = ldt2.toLocalDate();

		//LocalTime型への変換
		LocalTime lt1 = ldt1.toLocalTime();
		LocalTime lt2 = ldt2.toLocalTime();

		//Periodを使って日付差を求める
		Period p = Period.between(ld1, ld2);
		//Durationを使って時間差を求める
		Duration d = Duration.between(lt1, lt2);

		System.out.println(
				p.getYears() + "年" + p.getMonths() + "か月" + p.getDays() + "日" + d.toHoursPart() + "時間" + d.toMinutesPart() + "分" + d.toSecondsPart() + "秒差です"
				);
	}
}
