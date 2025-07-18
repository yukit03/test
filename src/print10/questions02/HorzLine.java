package print10.questions02;

public class HorzLine extends AbstLine{

	HorzLine(int length) {
		super(length);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<getLength();i++) {
			System.out.print(getHORZLINE());
		}
		System.out.println();
	}

}
