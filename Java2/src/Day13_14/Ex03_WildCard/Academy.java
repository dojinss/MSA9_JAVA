package Day13_14.Ex03_WildCard;

import java.util.ArrayList;
import java.util.List;

public class Academy{

	public static void main(String[] args) {
		
		// 일반인 과정 생성
		List<Person> personList = new ArrayList<Person>();
		personList.add( new Person("김조은"));
		personList.add( new Worker("이조은"));
		personList.add( new Student("박조은"));
		personList.add( new HighStudent("황조은"));
		personList.add( new MiddleStudent("백조은"));
		Course<Person> personCourse = new Course<Person>(personList);
		personCourse.createCourse("일반인과정", personCourse);
		personCourse.printStudentList(personCourse);
		
		// 직장인 과정
		List<Worker> workerList = new ArrayList<Worker>();
		workerList.add( new Worker("김백수"));
		workerList.add( new Worker("안기욱"));
		workerList.add( new Worker("김부장"));
		workerList.add( new Worker("장그래"));
		Course<Worker> workerCourse = new Course<Worker>(workerList);
		Course<?> createdWorkerCourse = workerCourse.createWorkerCourse("직장인과정",workerCourse);
		Course<?> createdWorkerCourse2 = workerCourse.createWorkerCourse("직장인과정2",personCourse);
//		workerCourse.createWorkerCourse("직장인과정", workerCourse);
//		workerCourse.createWorkerCourse("일반인과정", personCourse);
		workerCourse.printStudentList(createdWorkerCourse);
		workerCourse.printStudentList(createdWorkerCourse2);
		
		// 학생 과정
		List<Student> studentList = new ArrayList<Student>();
		studentList.add( new Student("김학생") );
		studentList.add( new HighStudent("이고딩") );
		studentList.add( new MiddleStudent("박중딩") );
		
		
		List<MiddleStudent> middleStudentList = new ArrayList<MiddleStudent>();
		middleStudentList.add( new MiddleStudent("심중딩"));
		List<HighStudent> highStudentList = new ArrayList<HighStudent>();
		highStudentList.add( new HighStudent("주고딩"));
		
		Course<? extends Student> studentCourse = new Course<Student>(studentList);
		Course<MiddleStudent> middleStudentCourse = new Course<MiddleStudent>(middleStudentList);
		Course<HighStudent> highStudentCourse = new Course<HighStudent>(highStudentList);
		
		studentCourse.createStudentCourse("학생과정", studentCourse);
		studentCourse.createStudentCourse("중학생과정", middleStudentCourse);
		studentCourse.createStudentCourse("고등학생과정", highStudentCourse);
		studentCourse.printStudentList(studentCourse);
		middleStudentCourse.printStudentList(middleStudentCourse);
		highStudentCourse.printStudentList(highStudentCourse);
		
		
	}
	
}
