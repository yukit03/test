package print12.questions02;

public class BankAccount {
	
	private static int accountNumCounter = 1000;
	private String name;
	private int accountNum;
	private int balance;
	
	BankAccount(String name,int balance){
		accountNum = accountNumCounter++;
		setName(name);
		setBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNum() {
		return accountNum;
	}
	
	public void deposit(int money) {
		balance += money;
		//System.out.println(getName() + "が" + money + "円、入金した");
	}
	
	public void withdraw(int money) {
		
		if (BankAccount.chkMoney(this , money)) {
            balance -= money;
            //System.out.println(getName() + "が" + money + "円を引き出しました。");
        } else {
            System.out.println(getName() + "の預金残高が不足しています。");
        }
	}
	
	public void displayAccountInfo() {
        System.out.println("口座番号: " + getAccountNum());
        System.out.println("口座名義: " + getName());
        System.out.println("預金残高: " + getBalance() + "円");
    }

	public static void transfer(BankAccount b1,BankAccount b2,int money) {//b1の金をb2に送金する
		if(BankAccount.chkMoney(b1 , money)) {
			b1.withdraw(money);
			b2.deposit(money);
			System.out.println(b1.getName() + "から" + b2.getName() + "へ" + money + "円、送金しました");
		}else {
			System.out.println(b1.getName() + "の預金残高が足りませんでした。");
		}
		
	}
	
	private static boolean chkMoney(BankAccount b1,int money) {
		if(b1.getBalance() >= money) {
			return true;
		}else {
			return false;
		}
	}
	
}
