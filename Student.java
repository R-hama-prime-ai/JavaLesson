package jp.co.aforce.sample;

public class Student {
	String name;
	int engScore;
	int mathScore;

	void display() {
		System.out.println(name + "さんの成績は" + getGrade() + "です");
	}

	void checkScore(int eng, int math) {
		engScore = eng;
		mathScore = math;

	}

	double getAvg() {
		double avg = (engScore + mathScore) / 2.0;
		return avg;
	}

	String getGrade() {
		double avg = getAvg();

		if (avg >= 80) {
			return "A";
		} else if (avg >= 70) {
			return "B";
		} else if (avg >= 60) {
			return "C";
		} else {
			return "D";
		}

	}

	public static void main(String args[]) {
		Student stu1 = new Student();
		Student stu2 = new Student();

		stu1.name = "山田";
		stu1.engScore = 85;
		stu1.mathScore = 50;

		stu2.name = "佐々木";
		stu2.engScore = 74;
		stu2.mathScore = 68;

		stu1.display();
		stu1.checkScore(85, 50);
		stu1.getAvg();

		stu2.display();
		stu2.checkScore(74, 68);
		stu2.getAvg();

	}

}
