package print9.questions03;

import java.util.Random;

public class Student extends Person{

	//問3(2)
	private final String[] SUBJECTS = {"国語","算数","理科","社会","英語"};
	private int[] scores;
	Random rand = new Random();

	//問3(3)(6)
	public Student(Day today,String name,int birthYear,int birthMonth,int birthDay) {

		super(today,name,birthYear,birthMonth,birthDay);
		takeTest();

	}

	//問3(4)
	public String[] getSUBJECTS() {
		return SUBJECTS;
	}

	public int[] getScores() {
		return scores;
	}

	//問3(5)
	public void takeTest() {

		scores = new int [SUBJECTS.length];
		for(int i = 0; i<scores.length; i++) {
			scores[i] = rand.nextInt(71)+30;

		}
	}
	//問3(7)

	//(7-1)テストの平均点を求める
	public double getAverageScore() {

		double totalScore = 0.0;
		for(int score : scores) {
			totalScore += score;

		}		
		return totalScore / scores.length;
	}

	//(7-2)テストの結果の一覧を表示する
	public void printTestResult() {

		System.out.println("【"+ getName() + "のテストの結果】");
		for(int i =0;i<scores.length;i++) {
			System.out.println(getSUBJECTS()[i]+":"+scores[i]);
		}
		System.out.println("平均点:"+getAverageScore());
		System.out.println();
	}

	//(7-3)最高得点のインデックス番号を求めて返す
	public int getBestScoreIndex() {
		int index =0;
		int bestScore = scores[0];

		for(int i =1;i<scores.length;i++) {
			if(bestScore < scores[i] ) {
				bestScore = scores[i];
				index = i;
			}
		}
		return index;
	}
	
	//(7-4)最高得点の科目を返す
	public String getFavoriteSubject() {
		
		return SUBJECTS[getBestScoreIndex()];
	}

	//(7-5)自己紹介を表示する
	@Override
	public void introduce() {		
		System.out.println("こんにちは。私の名前は"+ getName()+"です。");
		System.out.println("年齢は"+ calculateAge()+"歳です");
		System.out.println("得意科目は"+getFavoriteSubject()+"です。");
	}



}
