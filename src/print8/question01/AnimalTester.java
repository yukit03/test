package print8.question01;

import java.util.Scanner;

public class AnimalTester {
	
	public static void main(String[] args) {
		//1
		Animal dog = new Animal("犬","ポチ","ワンワン",3);
		//2
		Animal cat = new Animal("猫","たま","にゃーにゃー",5);
		
		//3
		dog.show();
		cat.show();
		
		//4
		Animal dog2 = new Animal();
		
		//5
		Scanner sc = new Scanner(System.in);
		System.out.print("種類を入力してください。");
		dog2.setKind(sc.nextLine());
		System.out.print("名前を入力してください。");
		dog2.setName(sc.nextLine());
		System.out.print("鳴き声を入力してください。");
		dog2.setCry(sc.nextLine());
		System.out.print("年齢を入力してください。");
		dog2.setAge(Integer.parseInt(sc.nextLine()));
		
		//6
		dog2.show();
	}

}
