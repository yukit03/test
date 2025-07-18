package print10.questions01;

public class Cat extends Animal{
	
	private int weight;

	public Cat(String name, String gender, int age, int weight) {
		super(name, gender, age);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	void cry() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("鳴き声は「にゃーにゃー」");
	}

	@Override
	void show() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf("%sは%d歳の%sで、%dキロです。\n",getName(),getAge(),getGender(),getWeight());
	}
	

}
