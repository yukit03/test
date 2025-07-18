package print5.questions06;

public class Main {
	/*
	 * 線形探索法を用いて、以下の配列から目的の値を取得してください。
	 * int型配列 array = {5,3,10,8,2,4,1,4,7,9,0,4,3,1}
	 */
	public static void main(String[] args) {
		int[] array = {5,3,10,8,2,4,1,4,7,9,0,4,3,1};
		
		//２の値が先頭から何番目に現れるか。
		int index = -1;
		for(int i=0;i<array.length;i++) {
			if(array[i] == 2) {
				index = i;
				break;
			}
		}
		System.out.println("2の値は" + index + "番目に出現します。");
		
		//４の値が何個出現したか
		int count = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i] == 4) {
				count++;
			}
		}
		System.out.println("4の値は" + count + "個出現した");
		
		//最後に現れた３の値は前から何番目か
		int index3 = -1;
		for(int i=0;i<array.length;i++) {
			if(array[i] == 3) {
				index3 = i;
			}
		}
		System.out.println("最後に現れる3の値は前から" + index3 + "番目です");
	}
}
