package print5.questions01.copy;

public class Main{
	public static void main(String[] args) {
		//1 要素数3のint型配列aの宣言をしてください
		int[] a = new int[3];
		
		//2 要素数5のString型配列bの宣言をしてください。
		String[] b = new String[5];
		
		//3 配列aの0番目に100、1番目に200、２番目に300を代入してください。
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		
		//4 配列bの０番目に「Bob」1番目に「John」２番目に「Alice」３番目に「Carol」４番目に「Charlie」を代入してください。
		b[0] = "Bob";
		b[1] = "John";
		b[2] = "Alice";
		b[3] = "Carol";
		b[4] = "Charlie";
		
		//5 配列aの２番目の中身を表示してください。
		System.out.println(a[2]);
		
		//6 配列bの０番目と３番目の中身を表示してください。
		System.out.println(b[0]);
		System.out.println(b[3]);
		
		//7 配列aの要素数の長さを表示してください
		System.out.println(a.length);
		
		//8 配列bの要素数の長さを表示してください。
		System.out.println(b.length);
	}
}
