package print8.question03;

public class ArrayMain {

	public static void main(String[] args) {
		//1
		Person [] person = new Person[4];
		
		//2
		person[0] = new Person("Bob",14);
		person[1] = new Person("Alice",15);
		person[2] = new Person("Carol",13);
		person[3] = new Person("Charlie",15,"サイクリング");
		
		//3
		for(int i=0;i<person.length;i++) {
			if(person[i].hasSameName("Carol")) {
				person[i].setName("Carole");
			}
		}
			
		//4
		for(Person p : person) {
			p.show();
		}
	}
}
