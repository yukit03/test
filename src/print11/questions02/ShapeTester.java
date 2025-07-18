package print11.questions02;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("長方形の横幅、縦幅を「10.0 5.3」のように半角スペースで区切って入力してください。");
		String[] s = sc.nextLine().split(" ");
		double width = Double.parseDouble(s[0]);
		double height = Double.parseDouble(s[1]);
		Shape rc = new Rectangle(width,height);
		
		System.out.println("円の半径を入力してください。");
		double radius = Double.parseDouble(sc.nextLine());
		Shape cr = new Circle(radius);
		
		rc.show();
		cr.show();
	}
}
