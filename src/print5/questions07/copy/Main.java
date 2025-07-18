package print5.questions07.copy;

public class Main {
	/*
	 * 線形探索法を用いて、以下の配列から目的の値を取得してください。
	 * String型配列 names = {“Bob”,”John”,”Alice”,”Carol”,”Charlie”}
	 */
	public static void main(String[] args) {
		String[] names = {"Bob","John","Alice","Carol","Charlie"};
		
		//(1) Aliceが何番目にあるか表示してください。
		int index = -1;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals("Alice")) {
				index = i;
				break;
			}
		}
		System.out.println(index + "番目にAliceがあります");
		
		//(2) for文を使い順番に探索し、CarolをEllenに変更したあと、配列の中身を全て表示してください。
		for(int i=0;i<names.length;i++) {
			if(names[i].equals("Carol")) {
				names[i] = "Ellen";
			}
		}
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i] + " ");
		}
	}

}
