package print8.question03;

public class Person {

	private String name;
	private int age;
	private String hobby;

	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	public Person(String name, int age, String hobby) {
		this(name,age);
		setHobby(hobby);
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

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public String getHobby() {
		if(this.hobby == null) {
			return "ありません";
		}
		return hobby;
	}


	public void show() {		
		System.out.printf("%sさんの年齢は%d歳、趣味は%s。\n",getName(),getAge(),getHobby());
	}

	public boolean hasSameName(String name) {
		if(this.name.equals(name)) {
			return true;
		}
		return false;
	}

}
