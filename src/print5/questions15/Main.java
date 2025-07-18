package print5.questions15;

public class Main {

	public static void main(String[] args) {
		//(1) int型の二次元配列を変数名matrix、要素数3×３の形で宣言してください
		int[][] matrix = new int[3][3];
		
		//(2)[0][0]には10、[0][1]には20、[0][2]には30
		//   [1][0]には50、[1][1]には99、[1][2]には10
		//   [2][0]には40、[2][1]には60、[2][2]には20　を代入してください。

		matrix[0][0] = 10;
		matrix[0][1] = 20;
		matrix[0][2] = 30;
		matrix[1][0] = 50;
		matrix[1][1] = 99;
		matrix[1][2] = 10;
		matrix[2][0] = 40;
		matrix[2][1] = 60;
		matrix[2][2] = 20;
		
		//3 変数matrixを表示してください
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		//4 要素が99のものを70に変更してください
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j] == 99) {
					matrix[i][j] = 70;
				}
			}
		}
		
		System.out.println();
		
		//5 再度、変数matrixを表示してください
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		//6 各列の値を合計するための一次元配列変数sumを用意してください。
		int[] sum = new int[3];
		
		//7 列ごとの数値を足して、(6)で宣言した配列に列合計を格納していってください。
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
			//	sum[j] += matrix[i][j];
				sum[i] += matrix[j][i];
			}
		}
		
		System.out.println();
		//8 配列変数sumの中身を表示してください。
		for(int i=0;i<sum.length;i++) {
			System.out.print(sum[i] + " ");
		}
	}
}
