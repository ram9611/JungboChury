package day18;
/*
 * 리턴: (값을 되돌려줌) 
 * 메서드를 호출한 쪽으로 값을 되돌려줌.
 * '메서드 호출 표현'을 '리턴 값'으로 바꿔줌
 * 
 */
public class Ex1803 {
	
	static void m3() { // 리턴타입 자리에 void라고 쓴 것--> 리턴하지 않는 메서드라는 뜻.
		
		System.out.println("m3");
		
	}
	
	static String m4() { // 리턴 타입이 String 타입이라는 뜻
		
		return "m4."; //1.메서드 실행 종료  2.리턴값을 메서드 호출한 쪽으로 반환
		
		//return 44; err
		
		
	}
	
	public static void main(String[] args) {
		
		m3();
		// System.out.println(m3()); err
		
		System.out.println(m4()); //메서드 호출 표현 --> m4()
		
	}
}
