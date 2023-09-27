package day21;
/*
 * [정리]
 * 지역변수의 유효범위(scope)
 * 
 * 1. for문의 괄호() 안에서 선언--> 해당 for문 안에서만 살아있음.
 * 2. if문의 중괄호{} 안에서 선언--> 해당 if문의 중괄호{} 안에서만 살아있음.
 * 3. 메서드 {}안 , 메서드 파라미터도 지역변수
 * 
 * [정리]
 * 변수의 종류
 * -저장하는 값의 성격에 따라
 * 1)기본(primitive) 데이터 타입(8가지) 변수
 * 2)'참조변수'
 * 
 * -만들어지는 위치(영역)에 따라
 * 1)지역변수-stack area
 * 2)___변수
 * 3)___변수
 * 
 * 메서드 오버로딩(Overloading)
 * 	둘 이상의 메서드를 정의할 때, 같은 이름을 써서 정의할 수 있음.
 * 	--->파.개.타(파라미터의 개수가 다르거나 타입이 다르거나)
 * 		ex) m(int n)을 정의
 * 			m(int n, int m)을 정의
 * 			m(String s)을 정의
 * 			m(String s, int m)을 정의
 * 
 * ex) int num=5;
 * 	   int num=15;--> err.(변수의 중복 선언)
 * 
 * ex) void m(){...}
 * 	   void m(){...}--> err. (메서드 중복 정의)
 * 
 * 그런데,
 * ex) void m(){...}
 * 	   void m(int n){...}---> 메서드 오버로딩
 * 	   main(){
 * 
 * 		m();
 * 		m(10);
 * 			}
 * 
 */
public class Ex2101 {
	public static void main(String[] args) {
		
		

	}
}
