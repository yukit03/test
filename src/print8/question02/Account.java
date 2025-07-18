package print8.question02;

public class Account {
	
	private String name;
	private String num;
	private int balance;
	private Day day;
	
	public Account(String name,String num,int balance,int year,int month,int date){
		this.name = name;
		this.num = num;
		this.balance = balance;
		this.day = new Day(year,month,date);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(int year,int month,int date) {
		this.day.setYear(year);
		this.day.setMonth(month);
		this.day.setDate(date);
	}

	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}

	public void showAccount() {
		System.out.println("口座名義：" + getName());
		System.out.println("口座番号：" + getNum());
		System.out.println("口座残高：" + getBalance());
		this.day.showCreateDate();
	}
}
