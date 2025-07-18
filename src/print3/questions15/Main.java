package print3.questions15;

public class Main {
	
	public static void main(String[] args) {
		//1 for文を使い、☆を１０個横に並べてください。
		for(int i=0;i<10;i++) {
			System.out.print("☆");
		}
		System.out.println();
		
		//2 for文とif文を使い、３の倍数個目は「★」、
		//それ以外は「☆」にして合計１０個並べてください。
		for(int i=1;i<=10;i++) {
			if(i % 3 == 0) {
				System.out.print("★");
			}else {
				System.out.print("☆");
			}
		}
		System.out.println();
		
		//3「☆　　★　　★　　☆」の形になるようにfor文とif文で表示してください。
		for(int i=1;i<=10;i++) {
			if(i ==  1|| i == 10) {
				System.out.print("☆");
			}else if(i == 4 || i == 7) {
				System.out.print("★");
			}else {
				System.out.print("　");
			}
		}
	}

}
