package print1.questions11;

/*
 * int型の変数x、yに数値23、5をそれぞれ代入してｘ÷ yの商(割り算の解)と剰余(余りのこと)を
 *コンソール画面に表示しましょう。
 */
public class Main {

	public static void main(String[] args) {
		int x = 23;
		int y = 5;

		System.out.println("商：" + (x/y));
		System.out.println("剰余：" + (x%y));
	}

}
