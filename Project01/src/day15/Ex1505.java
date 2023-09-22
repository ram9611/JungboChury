package day15;
/*
 * 
 * 메서드에서 다른 메서드를 호출할 수 있음
 * 
 * 1,2,3 출력순서
 */
public class Ex1505 {
	
	static void m1() {
		
		System.out.println("m1 메서드 실행");
		System.out.println(1);
	}
	
	static void m2() {
		System.out.println("m2 메서드에서 m1 메서드 호출");
		m1(); //메서드에서 다른 메서드 호출 가능
		System.out.println(2);
	}
	
	public static void main(String[] args) { // main->얘도 '메서드'에요
		
		m1();
		m2();
		System.out.println(3);
	}
}
