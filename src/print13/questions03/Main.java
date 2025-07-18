package print13.questions03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1　宣言
		Map<String,Integer> fruits = new HashMap<>();

		//2 空かどうか
		if(fruits.isEmpty()) {
			System.out.println("fruitsの中身は空です");
		}else {
			System.out.println("fruitsの中身はあります");
		}

		//3 ３回ループ
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			//4 ループの中で行う処理
			System.out.print("入力：");
			//入力値を分割して、果物名と個数に分ける
			String[] item = sc.nextLine().split(" ");
			String name = item[0];
			//個数の処理：①数字以外を置換で消すことで文字列の数字になる
			String intStr = item[1].replaceAll("[^0-9]", "");
			//MapのValueにするためにInteger型（int型）に変換させる必要がある
			int count = Integer.parseInt(intStr);
			//キーと値がそろったので、Mapに追加する
			fruits.put(name, count);
		}

		//5　Mapのfor文はkeySetを使う。値はkeyを使ってgetする
		for(String key : fruits.keySet()) {
			System.out.println("果物名：" + key + " 個数:" + fruits.get(key));
		}

		//6
		System.out.println("fruitsの要素数：" + fruits.size());

		//7
		fruits.remove("みかん");

		//8
		for(String key : fruits.keySet()) {
			System.out.println("果物名：" + key + " 個数:" + fruits.get(key));
		}
		
	}
}
