package Day02;

import java.util.Scanner;

public class Ex07_Boolean {
	public static void main(String[] args) {
		// Boolean
		// : true , false 논리값만 가지는 자료형
		
		boolean check1 = false;
		boolean check2 = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("true or false :");
		boolean on = sc.nextBoolean();
		
		if (on) {
			System.out.println("전원 On");
		}else {
			System.out.println("전원 Off");			
		}
		
		sc.close();

	}
}
