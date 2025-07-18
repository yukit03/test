package print8.question01;

public class Animal {
	
	private String kind;
	private String name;
	private String cry;
	private int age;
	
	public Animal(){
		
	}
	
	public Animal(String kind,String name,String cry,int age){
		this.kind = kind;
		this.name = name;
		this.cry = cry;
		this.age = age;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public String getName() {
		return name;
	}

	public String getCry() {
		return cry;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.printf("%sの種類は%sで、年齢は%d歳、鳴き声は%s\n",getName(),getKind(),getAge(),getCry());
	}

}
