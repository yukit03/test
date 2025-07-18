package print2;

import java.util.Scanner;

public class Questions09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("点数を入力:");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("優秀");
		}else if(score >=80 && score < 90) {
			System.out.println("良好");
		}else if(score >=70 && score < 80) {
			System.out.println("普通");
		}else if(score >=60 && score < 70) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
		
	}
}
