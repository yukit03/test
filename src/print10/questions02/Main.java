package print10.questions02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape[] s = new Shape[4];
		s[0] = new Point();
		
		System.out.println("長方形の幅は：");
		int width = Integer.parseInt(sc.nextLine());
		System.out.println("長方形の高さは：");
		int height = Integer.parseInt(sc.nextLine());
		s[1] = new Rectangle(width,height);
		System.out.println("水平直線の長さは：");
		int horz_length = Integer.parseInt(sc.nextLine());
		s[2] = new HorzLine(horz_length);
		System.out.println("垂直直線の長さは：");
		int vert_length = Integer.parseInt(sc.nextLine());
		s[3] = new VertLine(vert_length);
		
		for(int i=0;i<s.length;i++) {
			s[i].draw();
			System.out.println();
		}
	}

}
