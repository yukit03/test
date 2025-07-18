package print1.questions07;

//問7
//int型の変数ｘに数値5を代入して、ｘの値を2乗、3乗した結果をコンソール画面に表示しましょう。
//累乗した値を取得するには、Math.pow(①,②);を使う。
//①	繰り返し掛け算する数。　②何回かけ合わせたかを表す数
public class Main {
	
	public static void main(String[] args) {
		int x = 5;		
		double a = Math.pow(x, 2);
		double b = Math.pow(x, 3); 
		
		System.out.println("xの2乗：" + a);
		System.out.println("xの3乗：" + b);
//		System.out.println("xの2乗：" + Math.pow(x, 2));
//		System.out.println("xの3乗：" + Math.pow(x, 3));
	}

}
