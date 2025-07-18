package print2;

import java.util.Scanner;

public class Questions11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("四則演算を行います");
		System.out.print("数値を入力してください＞＞");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("数値を入力してください＞＞");
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("算術演算子を入力してください＞＞");
		String s = sc.nextLine();
		/*
		switch(s) {
		case "+":
			System.out.println(a + "+" + b + "=" + (a + b));break;
		case "-":
			System.out.println(a + "-" + b + "=" + (a - b));break;
		case "*":
			System.out.println(a + "×" + b + "=" + (a * b));break;
		case "/":
			System.out.println(a + "÷" + b + "=" + (a / b));break;
		default:
			System.out.println("存在しない演算子です");
		}
		*/

		//または
		switch(s) {
		case "+" ->{
			System.out.println(a + "+" + b + "=" + (a + b));
			System.out.println("Hello");
		}
		case "-" ->
			System.out.println(a + "-" + b + "=" + (a - b));
		case "*" ->
			System.out.println(a + "×" + b + "=" + (a * b));
		case "/" ->
			System.out.println(a + "÷" + b + "=" + (a / b));
		default ->
			System.out.println("存在しない演算子です");
		}
	
	}
	
}
