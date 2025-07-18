package print6.sample;

public class Sample {

	public static void main(String[] args) {
						//1回目の呼び出し
		System.out.println(add(3));
	}
						 //値は3
	public static int add(int num) {
		if(num == 0) {
			return 0;
		}			//2回目の呼び出し(引数は3-1)
		return num + add(num-1);
	}
	//↴						   値は2
	//	public static int add(int num) {
	//		if(num == 0) {
	//			return 0;
	//		}			//3回目の呼び出し(値2-1)
	//		return num + add(num-1);
	//	}
		//↴						  //値は1
		//	public static int add(int num) {
		//		if(num == 0) {
		//			return 0;
		//		}            //4回目の呼び出し(値は1-1)
		//		return num + add(num-1);
		//	}
	        //↴						  //値は0
			//	public static int add(int num) {
			//		if(num == 0) {
			//			return 0;ここでreturn
			//		}            //呼び出しなし
			//		return num + add(num-1);
			//	}
}