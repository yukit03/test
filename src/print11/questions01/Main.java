package print11.questions01;

public class Main {

	public static void main(String[] args) {
		Greet morninggreet = new MorningGreet();
		morninggreet.greeting();
		
		Greet eveninggreet = new EveningGreet();
		eveninggreet.greeting();
	}
}
