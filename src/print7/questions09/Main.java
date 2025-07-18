package print7.questions09;

public class Main {
	/*
	 * 問9【文字の置換】
	   文字列「abc123def456」のうち、アルファベットを数字の0に置き換えて表示してください。
	 */
	public static void main(String[] args) {
		String s = "abc123def456";
		String s1 = s.replaceAll("[a-z]", "0");
		System.out.println(s1);
	}
}
