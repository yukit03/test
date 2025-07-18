package print12.questions01;

public class Main {

	public static void main(String[] args) {
		//インスタンスの生成
		Person p1 = new Person("Alice", 15);
        Person p2 = new Person("Bob", 20);
        Person p3 = new Person("Chalie",30);
        Person p4 = new Person("Carol",15);
        
        
        //インスタンスメソッドの呼び出し
        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        //スタティックメソッドの呼び出し
        System.out.println(Person.ageCompara(p1, p2));
        System.out.println(Person.ageCompara(p3, p1));
        System.out.println(Person.ageCompara(p1, p4));
        
        //staticメソッドの呼び出し
        System.out.println("Personインスタンス作成数：" +Person.getPersonCount());
        
	}
}
