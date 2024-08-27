package Day13_14.Ex05.Compare.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *	1. Comparator 인터페이스 구현
 *	2. compare() 메소드 오버라이딩
 *		- 정렬 기준1 : 나이 오름차순
 *		- 정렬 기준2 : 이름 내림차순
 */
/**
 * 
 */
class User implements Comparator<User>{
	
	String id;
	String name;
	int age;
	// construct
	public User() {
		this("-","-",0);
	}
	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	// getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compare(User o1, User o2) {
		// 정렬1 : 나이 오름차순
		// 정렬2 : 이름 내림차순
		
		// o1 : 해당 객체
		// o2 : 비교 객체
		
		// 1. 각 객체의 나이를 가져와서 age1, age2로 선언
		// 2. 각 객체의 이름을 가져와서 name1, name2로 선언
		
		// 정렬 로직 장석
		// o1 이 더 큰 객체 -> 양수
		// o1 과 o2 같은 객체 -> 0
		// o1이 더 작은 객체 -> 음수
		
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		String name1 = o1.getName();
		String name2 = o2.getName();
//		if(age1 > age2) return 1;
//		if(age1 < age2) return -1;
//		if(age1 == age2) {
//		
//			
//			int gap = name1.compareTo(name2);
//			if(gap < 0) return 1;
//			if(gap > 0) return -1;
//			if(gap == 0) return 0;
//		}
		int ageCheck = (age1 - age2);					// 정렬1 나이 오름차순
		int nameCheck = -(name1.compareTo(name2));		// 정렬2 이름 내림차순
		// 나이가 같은 경우에만 정렬2 적용
		return ageCheck == 0 ? nameCheck : ageCheck;

	}
	
	
	
}

public class ComparatorEx {
	
	public static void main(String[] args) {
		List<User> userList = Arrays.asList(
			new User("joeun1","황조은",24),
			new User("joeun2","김조은",24),
			new User("joeun3","박조은",25),
			new User("joeun4","유조은",25),
			new User("joeun5","심조은",27),
			new User("joeun6","강조은",23),
			new User("joeun7","임조은",40)
		);
		
		System.out.println("* 정렬 전");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("======================");
		
		// 정렬
		Collections.sort(userList, new User());
		
		System.out.println("* 정렬 후");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("======================");
		
		
		List<User> userList2 = Arrays.asList(
			new User("joeun1","황조은",24),
			new User("joeun2","김조은",24),
			new User("joeun3","박조은",25),
			new User("joeun4","유조은",25),
			new User("joeun5","심조은",27),
			new User("joeun6","강조은",23),
			new User("joeun7","임조은",40)
		);
		
		// Collections.sort( 컬렉션, 정렬기준객체 )
		// * 익명구현객체를 사용하여, 이 시점에서 정렬기준 적용 가능
		// * 익명구현객체를 사용한 1회성 정렬기준
		Collections.sort(userList2, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				int idSort = -(o1.getId().compareTo(o2.getId()));
				return idSort;
			}
			
		});
		
		System.out.println("* 아이디 내림차순");
		for (User user : userList2) {
			System.out.println(user);
		}
		System.out.println("======================");
	}
	
}
