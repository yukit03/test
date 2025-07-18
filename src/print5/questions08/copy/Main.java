package print5.questions08.copy;

public class Main {
	/*
	 * 以下の配列の要素を2倍にしてください。その後配列の中身を全て表示してください。
     * 配列：int[] arrays = {4,6,3,8,7};
	 */
	public static void main(String[] args) {
		int[] arrays = {4,6,3,8,7};
		
		for(int i = 0;i<arrays.length;i++) {
			arrays[i] *= 2;
		}
		
		for(int i=0;i<arrays.length;i++) {
			System.out.print(arrays[i] + " ");
		}
	}

}
