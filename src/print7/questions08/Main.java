package print7.questions08;

public class Main {
	/*
	 * 問8【文字列分割】
	   以下のString文字列を各名前ごとに分割し配列に格納してください。
	   String name = “Bob,Alice,Carol,Charlie,John,Ivan”;
	   その後、for文とif文を使い配列の要素の中から、「Carol」が格納されている配列のインデックスを求め表示してください。
	 */

	public static void main(String[] args) {
		String name = "Bob,Alice,Carol,Charlie,John,Ivan";
		String[] names = name.split(",");
		
		int index = -1;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals("Carol")) {
				index = i;
			}
		}
		System.out.println(index);
	}
}
