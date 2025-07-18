package print10.questions01;

public class Main {

	public static void main(String[] args) {
		//配列管理　多態性
		Animal[] doubutu = new Animal[2];

		//Catクラス作る
		doubutu[0] = new Cat("たま","雌",7,3);

		//Dogクラス作る
		doubutu[1] = new Dog("シロ","雄",5);

		for(int i=0;i<doubutu.length;i++) {
			doubutu[i].show();
			doubutu[i].cry();
			if(doubutu[i] instanceof Dog d) {
				//Dog d = (Dog)doubutu[i];
				d.walk();
			}
		}
	}
}
