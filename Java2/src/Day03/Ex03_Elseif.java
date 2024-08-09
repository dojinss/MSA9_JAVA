package Day03;

import java.util.Scanner;

public class Ex03_Elseif {
	public static void main(String[] args) {
		//성적을 입력 받아서, 성적에 따른 학점 A~F를 출력하시오.
			
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 : ");
		int score = sc.nextInt();
		char grade = 'F';
		/*
		 * if (score >= 90 ) { System.out.println(score + "학점은 A입니다."); } else if (score
		 * >= 80 ) { System.out.println(score + "학점은 B입니다."); } else if (score >= 70 ) {
		 * System.out.println(score + "학점은 C입니다."); } else if (score >= 60 ) {
		 * System.out.println(score + "학점은 D입니다."); } else if (score < 60 ) {
		 * System.out.println(score + "학점은 F입니다."); }
		 */
		if (score > 100 || score < 0)	 System.out.println("학점은 0 ~ 100안에 정수만 입력가능합니다.");
		if (score >= 90 && score <= 100) grade = 'A';
		if (score >= 80 && score < 90)	 grade = 'B';
		if (score >= 70 && score < 80)	 grade = 'C';
		if (score >= 60 && score < 70)	 grade = 'D';
		if (score < 60)					 grade = 'F';
		
		//if ~ else if ~ else
		if (score >= 90) 		grade = 'A';
		else if (score >= 80) 	grade = 'B';
		else if (score >= 70) 	grade = 'C';
		else if (score >= 60) 	grade = 'D';
		else					grade = 'F';
		
		System.out.println(score + "학점은 " + grade + "입니다.");
		sc.close();

	}
}
