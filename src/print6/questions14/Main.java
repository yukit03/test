package print6.questions14;

public class Main {

		public static void main(String[] args) {
			int a = 10;
			int[] arrayA = {4,8,2,10,9,3};
	
			int b = 50;
			int[] arrayB = {20,40,60,80,50};
	
			message(a, searchIndex(a,arrayA));
	
			message(b, searchIndex(b,arrayB));
		}
	
		public static int searchIndex(int val , int[] array) {
	
			int index = -1;
			for(int i=0;i<array.length;i++) {
				if(val == array[i]) {
					index = i;
					break;
				}
			}
			return index;
		}
		
		public static void message(int val, int index) {
			if(index == -1) {
				System.out.println(val + "は、配列の中には存在しません");
			}else {
				System.out.println(val + "は、配列の" + index + "番目に存在します。");
			}
		}
	}

//	public static void main(String[] args) {
//		int a = 10;
//		int[] arrayA = {4,8,2,10,9,3};
//
//		int index1 = -1;
//		for(int i=0;i<arrayA.length;i++) {
//			if(a == arrayA[i]) {
//				index1 = i;
//				break;
//			}
//		}
//		if(index1 == -1) {
//			System.out.println(a + "は、配列の中には存在しません");
//		}else {
//			System.out.println(a + "は、配列の" + index1 + "番目に存在します。");
//		}
//
//		int b = 50;
//		int[] arrayB = {20,40,60,80,50};
//
//		int index2 = -1;
//		for(int i=0;i<arrayB.length;i++) {
//			if(b == arrayB[i]) {
//				index2 = i;
//				break;
//			}
//		}
//		if(index2 == -1) {
//			System.out.println(b + "は、配列の中には存在しません");
//		}else {
//			System.out.println(b + "は、配列の" + index2 + "番目に存在します。");
//		}
//
//	}
//}
