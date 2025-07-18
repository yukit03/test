package print13.questions09;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactBook cb = new ContactBook();
		
		do {
			
			System.out.println("操作を選択してください。");
			int select = 0;
			do {
				System.out.print("1:登録　2:連絡帳一覧表示　3:電話番号検索　＞＞");
				select = Integer.parseInt(sc.nextLine());
			}while(select <= 0 || select >= 4);
			
			
			
			if(select == 1) {
				//入力
				System.out.println("連絡帳に名前と電話番号を登録します。");
				System.out.println("電話番号は090-XXXX-XXXXの形になります。");
				System.out.print("名前：");
				String name = sc.nextLine();
				
				System.out.println("電話番号：");
				String tel = sc.nextLine();
				
				//登録処理
				boolean bool = cb.entryPerson(name, tel);
				if(!bool) {
					System.out.println("登録できませんでした。");
				}else {
					System.out.println("登録をしました。");
				}
				
			}else if(select == 2) {
				if(cb.getListSize() == 0) {
					System.out.println("連絡帳は登録されていません");
				}else {
					cb.getPersonList();
				}
				
			}else {
				System.out.print("検索したい名前を入力してください");
				String name = sc.nextLine();
				System.out.println(cb.getTel(name));
			}
			
			//連続操作関係処理
			String yn = "";
			do {
				System.out.print("続けて操作を行いますか？：　 y / n");
				yn = sc.nextLine();
			}while(!yn.equals("y") && !yn.equals("n"));
			
			//nのときはプログラム終了
			if(yn.equals("n")) {
				break;
			}
			
		}while(true);
		
		System.out.println("連絡帳の操作を終了します。");
	}

}
