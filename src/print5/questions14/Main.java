package print5.questions14;

public class Main {
	/*
	 * 以下の要素を持つ配列scores及び配列ranksを宣言し、指示された操作を行ってください。
     * scores = {50,95,80,70,85} , ranks = {1,4,2,3,0}
     * scoresは得点を表します。
     * ranksはscores内で高い得点が入っている要素順に値が並んでいます。
     * ※ranks[0]には1が入っています。これはscoresの1番目に一番高い得点が入っていることを指します。次にranks[1]には4が入っており、これはscoresの4番目が2番目に高い得点であることを指しています。
	 */
	public static void main(String[] args) {
        int[] scores = { 50, 95, 80, 70, 85 };
        int[] ranks = { 1, 4, 2, 3, 0 };


        //(1) scores配列の要素を順番に表示してください
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "番：" + scores[i] + "点");
        }
        
        System.out.println();
    
        //(2) ranksの順に表示
        for (int i = 0; i < scores.length; i++){
            System.out.println((i+1) + "位：" + scores[ranks[i]] + "点");
        }
    }
}
