/*
 * 
 * -영타연습(SpeedCoder)
 * -따옴표("), 홀따옴표(')
 * 
 * 주석 작성하는 방법:
 * 1) //부터 그 문장 끝까지
 * 2) /*부터 
 * 
 * 글자크기 : ctrl+(+/-)
 * 저장 : ctrl + s
 * 실행: ctrl + F11
 * 한줄 삭제: ctrl + D
 * 
 */
public class Ex100 {

	public static void main(String[] args) {
		
		System.out.println("hello, world!"); // 화면 출력.
		System.out.println("hello, world! Haha"); //"문자열"
		System.out.println(123); // 정수
		System.out.println(3.14); // 실수 
		
		String s1;	//s1이라는 이름을 선언('변수')
		s1="Hello ";
		
		String s2;
		s2="world";
		
		System.out.println(s1+s2); // 문자열 + 문자열('결합')
		
		System.out.println(5+3);
		System.out.println("5"+"3");
		System.out.println("s1+s2"); //24행과 비교
		System.out.println("System.out.println(3);");
		
		// practice : 아래 빈 줄을 채워서 I'm___이름___식으로 출력
		
		String name="Haram Kim";
		System.out.println("I'm "+name);
		
	}

}


