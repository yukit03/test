package print13.questions07;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//1
		System.out.print("乱数を発生させる数を指定してください :");
		//2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//3
		System.out.print("探したい数字を指定してください :");
		int key = sc.nextInt();
		//4
		Set<Integer> set = getSet(n);
		//5
		int index = getNum(set,key);
		//6
		printIndex(index);
		//7
		showSet(set);
	}
	
	
	public static LinkedHashSet<Integer> getSet(int n) {
		//1
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		//2
		Random rand = new Random();
		while(set.size() != n) {
			set.add(rand.nextInt(n * 2));
		}
		//3
		return set;
	}
	
	public static int getNum(Set<Integer> set,int key) {
		int index = 0;
		//1
		for(int i : set) {
			//2
			if(i == key) {
				return index;
			}
			index++;
		}
		
		return -1;
	}
	
	public static void printIndex(int index) {
		//1
		if(index < 0) {
			System.out.println("その値は要素に存在しません");
		}else {	//2
			System.out.println("その値は" + index + "番目にあります");
		}
	}
	
	public static void showSet(Set<Integer> set) {
		//1
		for(int i : set) {
			System.out.println(i);
		}
	}
}
