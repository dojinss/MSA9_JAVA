package Day04.Class;

public class Jiwoo {
	public static void main(String[] args) {
		//객체 생성
		//- 클래스타입 객체명 = new 클래스명();
		
		Pikachu pikachu = new Pikachu();
		
		// (.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
		
		System.out.println(":::::: 피카츄 :::::::");
		System.out.println("에너지 \t: " + pikachu.energy);
		System.out.println("타입 \t: " + pikachu.type);
		System.out.println("공격A \t: " + pikachu.aAttack());
		System.out.println("공격B \t: " + pikachu.bAttack());
		System.out.println();

		Pikachu pikachu20 = new Pikachu(150,"진화");
		
		// (.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
		
		System.out.println(":::::: 피카츄 :::::::");
		System.out.println("에너지 \t: " + pikachu20.energy);
		System.out.println("타입 \t: " + pikachu20.type);
		System.out.println("공격A \t: " + pikachu20.aAttack());
		System.out.println("공격B \t: " + pikachu20.bAttack());
		System.out.println();
		
		Raichu raichu = new Raichu();
		
		System.out.println(":::::: 라이츄 :::::::");
		System.out.println("에너지 \t: " + raichu.energy);
		System.out.println("타입 \t: " + raichu.type);
		System.out.println("공격A \t: " + raichu.aAttack());
		System.out.println("공격B \t: " + raichu.bAttack());
		System.out.println("공격C \t: " + raichu.cAttack());
		System.out.println();
	}
}
