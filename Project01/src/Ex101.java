/*'변수' : 값을 저장할 수 있는 그릇
 * '변수의 선언' : 이름을 선언 (이때부터 자바가 그 이름을 알고 있음)
 * '변수의 초기화': 변수에 최초로 값을 저장하는 사건. '초깃값'
 * 
 * 변수의 선언[정리]
 * 1) String 이름; 문자열 저장할 수 있는 변수의 선언
 * 2) int 이름: 정수 값을 저장할 수 있는 변수의 선언
 * 3) double: 실수 값을 저장할 수 있는 변수의 선언
 * 
 */

public class Ex101 {

	public static void main(String[] args) {
		int num; // num이라는 변수를 선언. (정수 값을 저장)
		num=5;	 // ----->'대입 연산자' : 오른쪽을 정의해서 왼쪽에 담는다
		
		System.out.println("num: "+num); // 문자열과 무언가를 더하면 결과는 문자열이 된다
		System.out.println("num: "+5); // 문자열과 무언가를 더하면 결과는 문자열이 된다
		System.out.println("num: "+"5"); // 문자열과 무언가를 더하면 결과는 문자열이 된다
		
		
		System.out.println("num: "+num+num);
		System.out.println(num+num);
		
		double num2;	// 실수 값을 저장할 수 있는 변수 num2를 선언.
		num2=3.14;
		System.out.println("num2: " +num2);
		
		int num3;
		//System.out.println("num3: "+num3); 안됨
		
		// num4=5.15; 안됨
		
		
		
		
		// 연습1. 정수형 변수 a를 선언, 10이라는 값으로 초기화
		//"a: 10"이렇게 출력해보세요
		
		int a=10;
		System.out.println("a: "+a);
		
		//연습2. 실수형 변수 b를 선언하고, 11.1이라는 값으로 초기화
		//"b:11.1" 이렇게 출력해보세요
		
		double b=11.1;
		System.out.println("b: "+b);
	}

}
