package print9.questions03;

public class Person {
	//問2(2)
	private String name;
	private Day birthday;
	private Day today;
	
	//問2(3)
	public Person(Day today,String name,int birthYear,int birthMonth,int birthDay) {
		
		this.today = today;
		this.name = name;
		this.birthday = new Day(birthYear,birthMonth,birthDay);
		
	}
	//問2(4)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Day getBirthday() {
		return birthday;
	}

	public void setBirthday(Day birthday) {
		this.birthday = birthday;
	}

	public Day getToday() {
		return today;
	}

	public void setToday(Day today) {
		this.today = today;
	}
	
	//問2(5)
	
	//(5-1)誕生日と本日の日付から年齢を求めて返す
	public int calculateAge() {
		
		int age = today.getYear() - birthday.getYear();
		
		if(birthday.getMouth()>today.getMouth() ||
				birthday.getMouth() == today.getMouth() && birthday.getDay() > today.getDay()) {
			age--;
		}
		
		return age;
		
	}
	//(5-2)自己紹介を表示する
	public void introduce() {
		
		System.out.println("こんにちは。私の名前は" + getName() + "です。\n"
				+ "年齢は" + calculateAge() + "歳です。");
	}

}
