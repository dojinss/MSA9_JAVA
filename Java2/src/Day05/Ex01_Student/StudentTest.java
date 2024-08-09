package Day05.Ex01_Student;

public class StudentTest {
	public static void main(String[] args) {
		// Student 객체 생성
		Student student = new Student();
		
		student.name	= "김도현";
		student.age		= 20;
		student.stdNo	= "T10001";
		student.major	= "전기전자과";
		int scores[]	= {100, 80, 90, 50, 75};
		
		System.out.println(":::::: 학생1 ::::::");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		student.study("전기회로");
		
		System.out.println("학생1 - 중간고사 점수" + student.getAverage(100,90));
		System.out.println("학생1 - 기말고사 점수" + student.getAverage(100,85,70));
		System.out.println("학생1 - 최종 점수" + student.getAverage(scores));
		
		//------------------------
		Student student3 = new Student();
		
		student3.name	= "김동진";
		student3.age	= 35;
		student3.stdNo	= "T20002";
		student3.major	= "디지털미디어";
		int scores2[]	= {60, 80, 90, 50, 75};
		
		System.out.println(":::::: 학생1 ::::::");
		System.out.println("학생1 - 이름 \t\t: " + student3.name);
		System.out.println("학생1 - 나이 \t\t: " + student3.age);
		System.out.println("학생1 - 학번 \t\t: " + student3.stdNo);
		System.out.println("학생1 - 전공 \t\t: " + student3.major);
		student3.study("자료구조");
		
		System.out.println("학생1 - 중간고사 점수 \t: " + student3.getAverage(95,55));
		System.out.printf("학생1 - 기말고사 점수 \t: %.1f",student3.getAverage(64,78,94));
		System.out.println();
		System.out.println("학생1 - 최종 점수 \t\t: " + student3.getAverage(scores2));
	}
}
