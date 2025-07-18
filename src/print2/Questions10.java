package print2;

import java.util.Random;

public class Questions10 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int apple = 150 * (rand.nextInt(6) + 5);
		
		int mikan = 120 * (rand.nextInt(9) + 4);
		
		System.out.println("りんご：" + apple + "グラム。");
		System.out.println("みかん：" + mikan + "グラム。");
		if(apple > mikan) {
			System.out.println("りんごのほうが重たいです");
		}else if(mikan > apple){
			System.out.println("みかんのほうが重たいです");
		}else {
			System.out.println("りんごとみかんの重さは同じです");
		}
	}
}
