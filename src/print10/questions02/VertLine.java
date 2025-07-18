package print10.questions02;

public class VertLine extends AbstLine{

	VertLine(int length) {
		super(length);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<getLength();i++) {
			System.out.println(getVERTLINE());
		}
	}
	
	

}
