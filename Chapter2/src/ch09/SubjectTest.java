package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "이순신");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 99);

		Student studentKim = new Student(100, "김좌진");
		studentKim.setKoreaSubject("국어", 50);
		studentKim.setMathSubject("수학", 29);

		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
