package print3.questions18;

public class Main {
	/*
	 *問18 1から100までの数字を順に表示するプログラムを作成してください。
     *ただし、以下の条件に従います。
	 * 3で割り切れる数の場合は、数の代わりに「Fizz」を表示する。
     * 5で割り切れる数の場合は、数の代わりに「Buzz」を表示する。
     * 3でも5でも割り切れる数の場合は、「FizzBuzz」を表示する。
     * それ以外の数はそのまま表示する。
	 */

	public static void main(String[] args) {
        // 1から100までのループ
        for (int i = 1; i <= 100; i++) {
            // 3でも5でも割り切れる場合は「FizzBuzz」
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // 5で割り切れる場合は「Buzz」
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // 3で割り切れる場合は「Fizz」
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // その他の数字はそのまま表示
            else {
                System.out.println(i);
            }
        }
    }
	
}
