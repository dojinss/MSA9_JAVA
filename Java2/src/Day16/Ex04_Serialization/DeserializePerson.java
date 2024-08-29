package Day16.Ex04_Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializePerson {
	
	public static void main(String[] args) {
		// Person.dat 파일을 역질렬화하여 객체로 입력
		try (
				FileInputStream fis = new FileInputStream("Person.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
			)
		{
			Person person = (Person) ois.readObject();
			System.out.println("Person.dat 파일 데이터를 역질렬화하여 Person객체로 가져옴");
			System.out.println(person);
		} catch (Exception e) {
			System.err.println("파일을 불러오는데 실패하였습니다.");
			e.printStackTrace();
		}
	}
}
