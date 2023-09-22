package day15;
/*
 * 메서드 : (작은) 코드 조각
 * 	-정의하는 법
 * 		static void 메서드이름(){...}
 * 
 * 	-호출하는 법(사용).
 * 		메서드이름();
 * 
 * ex)
 * 무한 반복{
 * 배경을 그림()
 * 플레이어를 그림()
 * 적들을 그림()
 * 플레이어 이동()
 * }
 */
public class Ex1504 {
	
	static void methodA() { // 메서드 정의
		System.out.println("메서드A 실행");
	}
	
	static void methodB() {
		System.out.println("메서드B 실행");
	}
	
	public static void main(String[] args) {
		
		methodA();//메서드 호출(call)
		methodB();//메서드 호출(call)
		
	}
}
