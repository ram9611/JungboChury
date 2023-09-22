package day15;
/*
 * 
 * 
 * 메서드를 호출-->자바는 어떤 메서드를 실행할 지 '메서드+파라미터 구성'으로 찾음(메서드 이름만으로 찾는게 아님)
 * 파라미터는 2개 이상일 수도 있음.
 */
public class Ex1507 {
	
	static void m1() {
		System.out.println("m1");
		
	}
	
	static void m2(int a,int b) {
		
		System.out.println(a+"*"+b+"="+a*b);
		
	}
	
	public static void main(String[] args) {
		
		m1();
		//m1(5); err
		m2(3,5); //출력 : 3*5=15
	}
}
