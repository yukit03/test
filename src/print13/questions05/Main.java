package print13.questions05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//1
		Set<Integer> set = new HashSet<Integer>();
		
		//2
		Random rand = new Random();
		while(true) {
			
			set.add(rand.nextInt(100));
			//3
			if(set.size() == 24) {
				break;
			}
		}
		
		//4
		int i = 0;	//表示数カウンター
		for(int val : set) {
			//拡張for文で取得した値を表示
			System.out.printf("%3d",val);
			//値を表示したら表示数カウンターを増やす
			i++;
			//表示数カウンターが12のとき、ちょうど真ん中になるので☆を表示する
			if(i == 12) {
				System.out.printf("%2s","☆");
				//値を表示したら表示数カウンターを増やす
				i++;
			}
			//５個表示する度に改行を入れる
			if(i % 5 == 0) {
				System.out.println();
			}
			
		}
	}
}
