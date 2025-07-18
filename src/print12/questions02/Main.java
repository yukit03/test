package print12.questions02;

public class Main {

	public static void main(String[] args) {
		BankAccount [] bank = new BankAccount[4];
		//口座作成処理
		bank[0] = new BankAccount("Bob",100000);
		bank[1] = new BankAccount("Carol",80000);
		bank[2] = new BankAccount("Alice",90000);
		bank[3] = new BankAccount("Charlie",1000);

		//口座情報表示
		for(BankAccount ba : bank) {
			ba.displayAccountInfo();
		}
		
		//Bobが5000引き出す
		bank[0].withdraw(5000);
		//Charlieが3000引き出すが、残高不足
		bank[3].withdraw(3000);
		//Carolが2000入金
		bank[1].deposit(2000);
		//Charlieが1000入金
		bank[3].deposit(1000);
		//BobがCarolに10000送金
		BankAccount.transfer(bank[0], bank[1], 10000);
		//CharlieがAliceに10000送金しようとするが残高不足
		BankAccount.transfer(bank[3], bank[2], 10000);

		//口座情報表示
		for(BankAccount ba : bank) {
			ba.displayAccountInfo();
		}
	}

}
