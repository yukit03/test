package print13.questions04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<String,String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("データを5件入力してください。");

		for(int i=0;i<5;i++) {
			//入力した１行データを分割して配列に格納
			String[] s = sc.nextLine().split(" ");
			map.put(s[0],s[1]);
		}
		
		//StringBuilderで繋げるのは１５章の練習問題で既に解いた内容
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(String key : map.keySet()) {
			sb.append(key);
			if(count < map.size() -1) {
				sb.append(",");
			}
			count++;
		}
		System.out.println(sb.toString());
		
		//入力値で値の取得はMapのgetで行う
		System.out.println("表示したい年を入力してください");
		String year = sc.nextLine();
		if(map.get(year) == null) {
			System.out.println("データがありません");
		}else {
			System.out.println(map.get(year));
		}
		
		
	}
}
