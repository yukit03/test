package print9.questions04;

public class Account {

	private String name;
	private int no;
	private int balance;

	public Account(String name, int no, int balance) {
		setName(name);
		setNo(no);
		setBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	//--- k円預ける ---//
	void deposit(int money) {
		balance += money;
	}

	//--- k円おろす ---//
	void withdraw(int money) {
		balance -= money;
	}

	void transfer(Account p,int money) {
		//送金先のアカウントpのdepositを呼んで加算する
		p.deposit(money);
		//自身のwithdrawメソッドで減算する
		this.withdraw(money);
	}
	
	void show() {
		System.out.println("口座名義：" + getName());
		System.out.println("口座番号：" + getNo());
		System.out.println("普通預金残高：" + getBalance());
	}
}
