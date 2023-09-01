package day4;
/*
 * 문자의 비교, 문자열의 비교
 * 1) 문자의 동등비교: ==
 * 2) 문자열의 동등비교: .equals()---> ex) s1.equals(s2)
 * 
 * 4. 논리연산자/ 비트연산자
 * 	논리연산자: true와 false에 대한 연산
 * 	ex) true 연산자 true
 * ---->논리연산자의 연산의 결과 : boolean
 * 비트연산자: 비트 단위로 연산.
 * 
 * 암기
 * 	^:caret(캐럿)
 *  &:ampersand(앰퍼샌드)
 *  ~: tilde(틸드)
 *  | : pipe(파이프)
 *  
 *  
 *   
 */
public class Ex402 {
	public static void main(String[] args) {
		char c1='a';
		char c2='A';
		System.out.println(c1==c2);
		
		String s1="abc";
		String s2="abc";
		String s3=new String("abc");
		System.out.println(s1+" "+s2+" "+s3);
		System.out.println(s1==s2);// true
		System.out.println(s1==s3);// false-->문자열의 비교는 이렇게 하면 안됨.
		
		System.out.println(s1.equals(s2)); //s1과 s2의 내용이 같나? 문자열
		System.out.println(s1.equals(s3)); //s1과 s3의 내용이 같나? 문자열
	}
}
