package day3;
/*
 * [고급] 산술연산(+*=/)에 int형 이하의 정수형 변수가 사용되면, 
 * 		 int 형 변환된 후에 연산됨
 * 
 * [고급]
 * int보다 작은 정수형 변수에 값을 대입할 때, 자동으로 형변환됨.
 * 
 * 상수/ 리터럴
 * -리터럴(literal)
 * 정수, 실수, 문자, 문자열
 * 
 * -상수는 'final'붙여서 선언한 것
 * 
 * 4.문자열 리터럴 :따옴표(")로 묶음
 * 3.문자 리터럴: 홑따옴표(')로 묶음
 * 2.실수 리터럴: 그냥--------------double형
 * 				f(또는 F)를 뒤에 붙이면-->float형
 * 1.정수 리터럴: 언더바(_)쓸 수 있음 : 실행에 영향 없음
 * 
 */
public class Ex0304 {
	public static void main(String[] args) {
		byte b1=100;
		byte b2=10;
		//byte b3= b1+b2; err 이해 필요
		byte b3= (byte)(b1+b2);
		System.out.println(b3);
		
		char ch=65; //65->'A' 97->'a'
		char ch2=(char)(ch+32);
		System.out.println(ch2); // A
		
	}
}
