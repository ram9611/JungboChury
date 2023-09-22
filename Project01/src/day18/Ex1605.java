
package day18;

public class Ex1605 {
	
	static void sayHello(String name) {
		
		// return; 메소드 실행 종료.
		System.out.println(name+"님, 안녕하세요!");
	}
	
	
	static String sayhello2(String name) {
		
		return name+"님, 안녕하세요!";
	}
	
	public static void main(String[] args) {
		
		sayHello("HR");
		System.out.println(sayhello2("HR"));
		
	}
}
