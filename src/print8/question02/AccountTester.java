package print8.question02;

import java.util.Scanner;

public class AccountTester {
	
	public static void main(String[] args) throws Exception {
		Account[] person = new Account[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<person.length;i++) {
			System.out.print("口座名義を入力してください : ");
			String name = sc.nextLine();
			System.out.print("口座番号を入力してください : ");
			String num = sc.nextLine();
			System.out.print("預金額を入力してください : ");
			int money = Integer.parseInt(sc.nextLine());
			System.out.print("口座作成年月日を入力してください : ");
			String[] date = sc.nextLine().split("[年月日]");
			int year = Integer.parseInt(date[0]);
			int month = Integer.parseInt(date[1]);
			int day = Integer.parseInt(date[2]);
			
			person[i] = new Account(name,num,money,year,month,day);
		}
		
		for(Account p : person) {
			p.showAccount();
		}
		
		person[0].deposit(1000);
		
		person[1].withdraw(500);
		
		person[2].setDay(2000, 10, 20);
		
		System.out.println(person[0].getName() + "の預金額は" + person[0].getBalance() + "円です");
		
		System.out.println(person[1].getName() + "の預金額は" + person[1].getBalance() + "円です");
	
		person[2].getDay().showCreateDate();
	}

}
