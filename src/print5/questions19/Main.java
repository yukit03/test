package print5.questions19;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		//1 int型配列arraysを要素数５で宣言してください
		int[] arrays = new int[5];
		//2 乱数を用いてarrays配列の各要素に０～９９のランダムな値を代入してください。
		for(int i=0;i<arrays.length;i++) {
			arrays[i] = rand.nextInt(100);
		}
		//3 arrays配列を順番に表示してください
		for(int i=0;i<arrays.length;i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
		
		//4 int型配列newArraysを要素数10で宣言してください
		int[] newArrays = new int[10];
		//5 for文を回して、newArrays配列に、arraysの中身をコピーしてください。
		for(int i=0;i<arrays.length;i++) {
			newArrays[i] = arrays[i];
		}
		//6 newArrays配列のインデックスが５以降には値を代入していないため、インデックス５以降の要素に乱数を用いて０～９９の値を代入していってください
		for(int i=arrays.length;i<newArrays.length;i++) {
			newArrays[i] = rand.nextInt(100);
		}
		
		//7 newArrays配列の要素を全て表示してください。
		for(int i=0;i<newArrays.length;i++) {
			System.out.print(newArrays[i] + " ");
		}
	}
}
