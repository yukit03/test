package print9.questions04;

public class AccountTester {
	
	public static void main(String[] args) {
		//1-1
		Account nobita = new Account("のびた",12345,30000);
		TimeAccount suneo = new TimeAccount("すねお",33333,20000,100000);
		Account doraemon = new Account("どらえもん",99999,50000);
		//1-2
		nobita.show();
		suneo.show();
		doraemon.show();
		//1-3
		switch(compBalance(nobita,suneo)) {
		case 0:System.out.println("のびたとすねおの普通預金残高は同じ");break;
		case 1:System.out.println("のびたのほうが普通預金残高が多い");break;
		case -1:System.out.println("すねおのほうが普通預金残高が多い");break;
		}
		//1-4
		suneo.cancel();
		//1-5
		doraemon.transfer(nobita, 20000);
		//1-6
		switch(compBalance(nobita,suneo)) {
		case 0:System.out.println("のびたとすねおの普通預金残高は同じ");break;
		case 1:System.out.println("のびたのほうが普通預金残高が多い");break;
		case -1:System.out.println("すねおのほうが普通預金残高が多い");break;
		}
		//1-7
		nobita.show();
		suneo.show();
		doraemon.show();
	}
	
	//mainメソッドのあるクラスはnew演算子で作られるインスタンスではないので、staticが必要（5章のメソッドと同じ書き方）
	private static int compBalance(Account a,Account b) {
		if(a.getBalance() > b.getBalance()) {
			return 1;
		}else if(a.getBalance() < b.getBalance()) {
			return -1;
		}
		return 0;
	}

}
