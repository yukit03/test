package print10.questions01;

import java.util.Random;

public class Dog extends Animal{

	public Dog(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	void cry() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("鳴き声は「わんわん」");
	}

	@Override
	void show() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf("%sは%d歳の%sです。\n",getName(),getAge(),getGender());
	}
	
	void walk() {
		Random rand = new Random();
		String[] str = {"海","山","公園","家の近所"};
		System.out.printf("%sは、%sまで散歩に行きます。\n",getName(),str[rand.nextInt(str.length)]);
	}

}
