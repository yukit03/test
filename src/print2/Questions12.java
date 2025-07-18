package print2;

import java.util.Scanner;

public class Questions12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("年齢を整数で入力してください: ");
        int age = sc.nextInt();
        if (age < 6 || age >= 75  ) {
            System.out.println(age + "歳のお客様の入園料は無料です。");
        } else if (age <= 12) {
            System.out.println(age + "歳のお客様の入園料は500円です。");
        } else {
            System.out.println(age + "歳のお客様の入園料は1000円です。");
        }
    }
}
