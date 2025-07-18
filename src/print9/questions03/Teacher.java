package print9.questions03;

public class Teacher extends Student{

	//問4(2)
	private String teachingSubject;
	private Student[] students;

	//問4(3)(5)
	public Teacher(Day today, String name, int birthYear, int birthMonth, int birthDay,Student[] students) {
		super(today, name, birthYear, birthMonth, birthDay);
		setStudents(students);
		setTeachingSubject();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//問4(4)
	public String getTeachingSubject() {
		return teachingSubject;
	}

	public void setTeachingSubject() {
		int index = rand.nextInt(getSUBJECTS().length);
		teachingSubject = getSUBJECTS()[index];
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	//問4(6)
	
	//(6-1)自己紹介を表示する
	@Override
	public void introduce() {
		System.out.println("こんにちは。私の名前は"+getName()+"です");
		System.out.println("年齢は"+ calculateAge()+"歳です");
		System.out.println("得意科目は"+getTeachingSubject()+"です。");

	}
	
	//(6-2)担当生徒の全科目の平均点を求める
	@Override
	public double getAverageScore() {
		double totalScore = 0.0;
		for(Student student : getStudents()) {
			totalScore += student.getAverageScore();

		}
		return totalScore / getStudents().length;
	}

	//(6-3)担当科目と担当生徒の得意科目が一致している人数をカウントする
	public int getFavoriteSubjectCount() {
		int count =0;
		for(Student student : getStudents()) {
			if(getTeachingSubject().equals(student.getFavoriteSubject())) {
				count++;
			}		
		}
		return count;
	}
	
	//(6-4)配列studentsの生徒の名前を、インデックス0から順に表示する
	public void printStudentNames() {
		
		for(int i = 0; i< getStudents().length;i++) {
			System.out.println("【"+(i+1)+"番】"+ getStudents()[i].getName());
			
		}
		System.out.println();
	}

	//(6-5)配列studentsを平均点の高い順に並び変える
	public void printStudentByAverageScore() {
		/*   students[]
		 *   index     0       1      2      3
		 *   名前      a       b      c      d
		 *   平均点    50     70      65     75
		 *   
		 *   
		 *   i = 0   j = 0+1   maxIndex = 0
		 * 
		 * 
		 */

		int n = getStudents().length;
		for(int i = 0;i<n-1;i++) {
			int maxIndex = i;
			for(int j =i+1;j<n;j++) {
				if(getStudents()[j].getAverageScore() > getStudents()[maxIndex].getAverageScore()) {
					maxIndex = j;
				}
			}
			if(maxIndex != i) {
				Student temp = getStudents()[i];
				getStudents()[i] = getStudents()[maxIndex];
				getStudents()[maxIndex] = temp;
			}
		}


	}


}
