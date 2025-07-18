package print8.question02;

public class Day {
	
	private int year;
	private int month;
	private int date;
	
	Day(int year,int month,int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	public void set(int year,int month,int date) {
		setYear(year);
		setMonth(month);
		setDate(date);
	}
	
	public void showCreateDate() {
		System.out.printf("口座作成日は%d年%d月%d日です。\n",getYear(),getMonth(),getDate());
	}

}
