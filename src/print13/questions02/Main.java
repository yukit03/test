package print13.questions02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("入力回数を指定してください：");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("入力:");
			list.add(sc.nextInt());
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++) {
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println("最小値：" + min);
	}

}
