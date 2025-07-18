package print13.questions09;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class ContactBook {

	private ArrayList<Person> list;

	//コンストラクタ
	ContactBook(){
		list = new ArrayList<Person>();
	}

	//連絡帳に追加メソッド
	public boolean entryPerson(String name,String tel) {
		//名前の未入力チェック
		if(!chkInput(name)) {
			System.out.println("名前が未入力もしくは空白です");
			return false;
		}
		//名前の重複登録チェック
		if(!chkName(name)) {
			System.out.println("既に登録されている名前です");
			return false;
		}
		//電話番号の未入力チェック
		if(!chkInput(tel)) {
			System.out.println("電話番号が未入力もしくは空白です");
			return false;
		}
		//電話番号チェック
		if(!chkTel(tel)) {
			System.out.println("電話番号が正しくありません");
			return false;
		}
		//エラーがなく正常な時はリストに追加
		createPerson(name,tel);

		return true;
	}

	//個人データを作成
	private void createPerson(String name,String tel) {
		list.add(new Person(name,tel));
	}

	//入力チェック、空白もしくはnullはfalse
	private boolean chkInput(String str) {
		if (str == null || str.trim().isEmpty() || str.replaceAll("[\\s　]+", "").isEmpty()) {
			//null、trim().isEmpty()は前後の空白を除去したら空のとき、全角半角スペースは空白にしてから空を見る
			return false;
		}
		return true;
	}

	//電話番号の正規表現チェック
	private boolean chkTel(String tel) {
		String pattern = "^\\d{2,4}-\\d{2,4}-\\d{4}$";
		Pattern p = Pattern.compile(pattern);
		if (p.matcher(tel).find()) {
			return true;
		} else {
			return false;
		}
	}

	//連絡帳の一覧表示
	public void getPersonList() {
		for(Person p : list) {
			System.out.println(p.getName());
			System.out.println(p.getTel());
		}
	}

	//名前から電話番号の取得
	public String getTel(String name) {
		for(Person p : list) {
			if(name.equals(p.getName())) {
				return p.getTel();
			}
		}
		return "登録されていない人物です";
	}

	//名前の登録チェック
	public boolean chkName(String name) {
		for(Person p : list) {
			if(name.equals(p.getName())) {
				return false;
			}
		}
		return true;
	}

	//連絡帳の登録数を返す
	public int getListSize() {
		return list.size();
	}

}
