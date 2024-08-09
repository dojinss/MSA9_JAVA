package doitEx;

public class P90_Q1 {
	public static void main(String[] args) {
		// [빈칸] : [=]
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge>25);
		System.out.println(value);
		
		// [빈칸] : [==]
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		// [빈칸] : 1. [?] , 2. [:]
		ch = (myAge > teacherAge)?'T':'F';
		
		System.out.println(ch);
	}
}
