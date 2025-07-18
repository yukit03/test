package print9.questions02;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//長方形のインスタンスを作る
		System.out.println("長方形クラスのインスタンスを作成します。");
		System.out.println("「縦 横」の形で半角スペースで数字を区切って１行で入力してください。");
		String [] str = sc.nextLine().split(" ");
		Quadrilateral rc = new Quadrilateral(Integer.parseInt(str[0]),Integer.parseInt(str[1]));

		//正方形のインスタンスを作る
		System.out.println("正方形のインスタンスを作成します。");
		System.out.println("一辺の長さを入力してください。");
		int sippen = Integer.parseInt(sc.nextLine());
		Square sq = new Square(sippen);

		//直方体のインスタンスを作る
		System.out.println("直方体のインスタンスを作成します");
		System.out.println("「縦 横 高さ」の形で半角スペースで数字を区切って１行で入力してください。");
		String [] str2 = sc.nextLine().split(" ");
		Ractangular rr = new Ractangular(Integer.parseInt(str2[0]), Integer.parseInt(str2[1]), Integer.parseInt(str2[2]));

		//立方体のインスタンスを作る
		System.out.println("立方体のインスタンスを作成します。");
		System.out.println("一辺の長さを入力してください。");
		int cippen = Integer.parseInt(sc.nextLine());
		Cube cb = new  Cube(cippen);

		//長方形の面積を表示
		System.out.println("長方形の面積 : " + rc.getAreaOfFigure());

		//正方形の面積を表示
		System.out.println("正方形の面積 : " + sq.getAreaOfFigure());

		//直方体の表面積を表示
		System.out.println("直方体の表面積 : " + rr.getAreaOfFigure());

		//直方体の体積を表示
		System.out.println("直方体の体積 : " + rr.getVolume());

		//立方体の表面積を表示
		System.out.println("立方体の表面積 : " + cb.getAreaOfFigure());

		//立方体の体積を表示
		System.out.println("立方体の体積 : " + cb.getVolume());
	}

}
