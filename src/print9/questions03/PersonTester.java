package print9.questions03;

import java.util.Scanner;

public class PersonTester {

	public static void main(String[] args) {

		//問5(2)
		Scanner sc = new Scanner(System.in);
		System.out.println("本日の日付を入力してください");
		System.out.print("年:");
		int year = sc.nextInt();
		System.out.print("月:");
		int month = sc.nextInt();
		System.out.print("日:");
		int day = sc.nextInt();
		System.out.println();

		final Day TODAY = new Day(year,month,day);

		//問5(3)
		Student[] students = { 
				new Student(TODAY, "悠仁", 2008, 3, 20),
				new Student(TODAY, "恵", 2007, 12, 22),
				new Student(TODAY, "野薔薇", 2007, 8, 7),
				new Student(TODAY, "優太", 2006, 3, 7),

		};

		//問5(4)
		for(Student st : students) {			
			st.printTestResult();
			st.introduce();			
		}

		//問5(5)
		Teacher satoru = new Teacher(TODAY, "悟", 1994, 12, 7, students);

		//問5(6)
		satoru.introduce();

		//問5(7)
		System.out.println(satoru.getTeachingSubject()+"が得意教科の生徒は"+satoru.getFavoriteSubjectCount()+"人です。");

		//問5(8)
		System.out.printf("担当生徒のテスト平均点：%2f\n" , satoru.getAverageScore());

		//問5(9)
		satoru.printStudentNames();

		//問5(10)
		satoru.printStudentByAverageScore();

		//問5(11)
		satoru.printStudentNames();

	}
}
