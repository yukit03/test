package print13.questions09;

public class Person {
	
	private String name;
	private String tel;
	
	Person(String name,String tel){
		setName(name);
		setTel(tel);
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
