package Day13_14.Ex03_WildCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class App {
	
	static Scanner sc = new Scanner(System.in);
	static List<Course<?>> courseList = new ArrayList<Course<?>>();
	static List<Person> studentList = new ArrayList<Person>();
	
	public static void main(String[] args) {
		int no = 0;
		do {
			
			menu();						// 메뉴 출력
			no = sc.nextInt();			// 메뉴 번호 입력
			sc.nextLine();				// 엔터 제거
			System.out.println();		// 한줄 게행
			
			// 메뉴 번호 선택
			switch (no) {
				// 과정 등록
				case 1: courseList.add( createCourse() ); break;
				// 수강생 등록
				case 2: addStudent(); break;
				// 과정 확인
				case 3: printCourseList(); break;
				// 수강생 확인
				case 4: printStudent(); break;
			}
			
		} while (no != 5);
		System.out.println("시스템종료");
	}
	
	// 메뉴 호출
	static void menu() {
		System.out.println("::::: 수강생 등록 프로그램 :::::");
		System.out.println("1. 과정 등록");
		System.out.println("2. 수강생 등록");
		System.out.println("3. 과정 확인");
		System.out.println("4. 수강생 확인");
		System.out.println("5. 종료 하기");
		System.out.println(":::::::::::::::::::::::::::");
		System.out.print("번호 : ");
	}
	
	/**
	 * 과정 등록
	 * @return
	 */
	public static Course<?> createCourse() {
		System.out.print("- 과정 종류 (일반인, 직장인, 학생) : ");
		String type = sc.nextLine();
		System.out.print("- 과정 명 : ");
		String name = sc.nextLine();
		Course<?> course = switch (type) {
			case "일반인" -> {
				Course<Person> newCourse = new Course<Person>();
				yield newCourse.createCourse(name, newCourse);
			}
			case "직장인" -> {
				Course<Worker> newCourse = new Course<Worker>();
				yield newCourse.createWorkerCourse(name, newCourse);
			}
			case "학생" -> {
				Course<Student> newCourse = new Course<Student>();
				yield newCourse.createStudentCourse(name, newCourse);
			}
			default -> throw new IllegalAccessError("유효하지 않은 과정 종류 : " + type);
		};
		return course;
	}
	/**
	 * 	과정 확인
	 */
	public static void printCourseList() {
		System.out.println("::::: 과정 목록 :::::");
		
		for (Course<?> course : courseList) {
			System.out.println(course);
		}
		System.out.println(":::::::::::::::::::");
	}
	
	static Course<?> addList(String type,String name){
		
		Course<?> course = switch (type) {
			case "일반인" -> {
				Course<Person> newCourse = new Course<Person>();
				yield newCourse.createCourse(name, newCourse);
			}
			case "직장인" -> {
				Course<Worker> newCourse = new Course<Worker>();
				yield newCourse.createWorkerCourse(name, newCourse);
			}
			case "학생" -> {
				Course<Student> newCourse = new Course<Student>();
				yield newCourse.createStudentCourse(name, newCourse);
			}
			default -> throw new IllegalAccessError("유효하지 않은 과정 종류 : " + type);
		};

		return course;
	}
	 
	/**
	 * 	수강생 등록
	 */
	static void addStudent() {
		System.out.print("- 수강생 종류 (일반인, 직장인, 학생, 중학생, 고등학생) : ");
		String type = sc.nextLine();
		System.out.print("- 수강생 이름 : ");
		String name = sc.nextLine();
		System.out.print(" - 등록할 과정 명 : ");
		String courseName = sc.nextLine();
		
		Course<?> selectedCourse = new Course<>();
		
		for (int i = 0; i < courseList.size(); i++) {
			Course<?> course = courseList.get(i);
			
			// 입력한 과정명과 등록된 과정명이 일치하면
			if ( course.getName().equals(courseName)) {
				selectedCourse = course;
				break;
			}
		}
		// 선택된 과정에서 수강생 목록을 가져온다.
		
		
				
		
		// 수강생 목록에 지금 입력한 수강생을 추가한다.
		// * 수강생 종류에 맞게 객체를 생성하여 추가한다.
		switch (type) {
			case "일반인" -> {
				Course<Person> course = (Course<Person>) selectedCourse;
				List<Person> students = (List<Person>)selectedCourse.getStudents();
				Person student = new Person(name);
				students.add(student);	
				studentList.add(student);
			}
			case "직장인" -> {
				Course<Worker> course = (Course<Worker>) selectedCourse;
				List<Worker> students = (List<Worker>)selectedCourse.getStudents();
				Worker student = new Worker(name);
				students.add(student);	
				studentList.add(student);
			}
			case "학생" -> {
				Course<Student> course = (Course<Student>) selectedCourse;
				List<Student> students = (List<Student>)selectedCourse.getStudents();
				Student student = new Student(name);
				students.add(student);
				studentList.add(student);
			}
			case "중학생" -> {
				Course<MiddleStudent> course = (Course<MiddleStudent>) selectedCourse;
				List<MiddleStudent> students = (List<MiddleStudent>)selectedCourse.getStudents();
				MiddleStudent student = new MiddleStudent(name);
				students.add(student);		
				studentList.add(student);
			}
			case "고등학생" -> {
				Course<HighStudent> course = (Course<HighStudent>) selectedCourse;
				List<HighStudent> students = (List<HighStudent>)selectedCourse.getStudents();
				HighStudent student = new HighStudent(name);
				students.add(student);
				studentList.add(student);
			}
			default-> throw new IllegalArgumentException("Unexpected value: " + type);
		};
		
		
		
		
	}
	/**
	 * 	수강생 확인
	 */
	static void printStudent() {
		System.out.print("- 수강생 이름 : ");
		String name = sc.nextLine();
		
		boolean check = false;			// 등록 여부 확인
		for (int i = 0; i < studentList.size(); i++) {
			Person person = studentList.get(i);
			if ( person.getName().equals(name)) {
				System.out.println("* 등록된 수강생 입니다 : " + name);
				check = true;			// 수강생 등록 O
				break;
			}
		}
		// check : false 그대로 남아있는 경우 - 등록 X
		if (!check) {
			System.out.println("* 등록되지 않은 이름입니다.");
			return;
		}
		
		// 등록된 수강생인 경우 수강 중인 과정을 출력
		System.out.println("::::: 수강중인 과정 :::::");
		for (int i = 0; i < courseList.size(); i++) {
			// 해당 과정의 수강중인 학생목록
			List<Person> students = (List<Person>) courseList.get(i).getStudents();
			// 과정명
			String courseName = courseList.get(i).getName();
			
			// 해당 과정에 수강생 목록을 확인하여, 입력한 이름과 일치하는 경우가 있으면
			// 해당 수강생이 수강하는 과정을 출력한다.
			for (int j = 0; j < students.size(); j++) {
				if ( students.get(j).getName().equals(name)) {
					System.out.println("- " + courseName);
				}
			}
		}
		System.out.println(":::::::::::::::::::");
	}
}
