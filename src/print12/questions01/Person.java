package print12.questions01;

public class Person {

	private static int personCount = 0;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		personCount++;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static int getPersonCount() {
		return personCount;
	}


	@Override
	public String toString() {
		return getName() + "さんは" + getAge() + "歳です";
	}
	
	//スタティックメソッドの作成
	public static String ageCompara(Person p1,Person p2) {
		//valが正ならp1>p2、valが負ならp2>p1、valが0ならp1=p2
		int val = Integer.compare(p1.getAge(), p2.getAge());

		if(val > 0) {
			return p1.getName() + "さんと" + p2.getName() + "さんでは、" + p1.getName() + "さんのほうが年上です";
		}else if(val < 0){
			return p1.getName() + "さんと" + p2.getName() + "さんでは、" + p2.getName() + "さんのほうが年上です";
		}else {
			return p1.getName() + "さんと" + p2.getName() + "さんは同じ年齢です";
		}
	}
	

}
