/*
 * 변수와 상수
 * 
 * 변수 : 값이 변할 수 있다.
 * 		데이터 타입 변수이름(선언)
 * 
 * 상수 : 항상 그 값이다.
 * 		변수의 선언 앞에 Final(선언)
 */
public class Ex106 {

	public static void main(String[] args) {
		
		int a=5;
		a=10;
		System.out.println(a);	//10
		
		
		final int b=5;	// b는 상수: 저장된 값을 두 번 다시 바꿀 수 없다!
		//b=10;				상수는 값을 변경할 수 없다
		System.out.println(b);	//15
		
		//참고로, 상수의 이름을 전체 대문자로 쓰는 사람들이 있음.
		final double PI=3.141592;
		
		
	}

}
