package print13.questions01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		//1
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		//2
		ArrayList<String> b = new ArrayList<String>();
		
		//3 追加する場合はadd()
		a.add(1);
		a.add(10);
		a.add(100);
		a.add(5);
		a.add(50);
		a.add(500);
		
		//4
		b.add("のび太");
		b.add("すねお");
		b.add("ジャイアン");
		b.add("しずかちゃん");
		b.add("出木杉君");
		
		//5
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		//6
		Iterator<String> it = b.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
		//7　iが2のとき、a.get(2)は100なのでremoveされる。そのあと本来get(3)にある要素が前にずれてインデックスが2になる。
		for(int i=0;i<a.size();i++) {//removeされるとsizeが変更される。
			if(a.get(i) >= 100) {
				a.remove(i);
				i--;//removeメソッドを呼び出すと、要素のインデックスが変わるため、ループインデックスを減算する必要がある
			}
		}
		
		//8
		for(int m : a) {
			System.out.println(m);
		}
		
		//9 ソートにはsortメソッド
		a.sort(null);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		//10
		a.clear();
		
		//11
		if(a.isEmpty()) {
			System.out.println("変数aの中身は空です");
		}else {
			System.out.println("変数aの中身は空ではありません");
		}
		
	}

}
