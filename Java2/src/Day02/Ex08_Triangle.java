package Day02;

import java.util.Scanner;

public class Ex08_Triangle {
	public static void main(String[] args) {
		// 삼각형 넓이 : 밑변 * 높이 / 2
		// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하고 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 밑변 : ");
		double width = sc.nextDouble();
		System.out.print("삼각형의 높이 : ");
		double height = sc.nextDouble();
		System.out.println("--------------");
		System.out.println("삼각형의 밑변 : " + (double)width);
		System.out.println("삼각형의 높이 : " + (double)height);
		System.out.println("삼각형의 넓이 : " + (double)((width*height)/2));
		sc.close();
	}
}
