package print13.questions06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);
		System.out.print("乱数を作成する個数を入力：");
		int n = sc.nextInt();
		//2
		ArrayList<Integer> list = getListData(n);
		//3
		showListData(list);
	}
	/*
	 * 処理内容：
	 * 引数で受け取った整数の回数だけ乱数を発生させリストに追加する。
	 * 
	 * 引数：int a
	 * return：ArrayList<Integer> list
	 */
	public static ArrayList<Integer> getListData(int a){
		//1
		ArrayList<Integer> list = new ArrayList<Integer>();
		//2
		Random rand = new Random();
		for(int i=0;i<a;i++) {
			list.add(rand.nextInt(100));
		}
		//3
		return list;
	}
	
	/*
	 * 処理内容：
	 * ArrayListの中身を表示する
	 * 
	 * 引数：ArrayList<Integer> list
	 * retrun：void
	 */
	public static void showListData(ArrayList<Integer> list) {
		for(int a : list) {
			System.out.println(a);
		}
	}
}
