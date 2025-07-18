package print9.questions04;

public class TimeAccount extends Account{

	private int timeBalance;

	public TimeAccount(String name, int no, int balance, int timeBalance) {
		super(name, no, balance);
		setTimeBalance(timeBalance);
	}

	public int getTimeBalance() {
		return timeBalance;
	}

	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}

	// 定期預金を解約して全額を普通預金に移す
	void cancel() {
		//定期預金残高分だけ増やす
		deposit(timeBalance);
		//定期預金残高を０にする
		setTimeBalance(0);
	}
	
	@Override
	void show() {
		//全部記述する場合
//		System.out.println("口座名義：" + getName());
//		System.out.println("口座番号：" + getNo());
//		System.out.println("普通預金残高：" + getBalance());
		//super使う場合
		super.show();
		
		//差分になる分は必須記述項目
		System.out.println("定期預金残高：" + getTimeBalance());
	}

}
