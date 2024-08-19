package Day09.Ex07_Review.인터페이스;

public class Main {
	public static void main(String[] args) {
		String[] arr = new String[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "ㄱㅁㄴㅇ";
		}
		
		arr[3] = null;
		
		for (int i = 3; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];			
		}
		arr[arr.length-1] = null;
		
		for (String string : arr) {
			System.out.println(string);
		}
	}
	
}
