package day2;
/*
 * 비교 연산자 --> 연산의 결과, true 또는 false
 *  > <(크냐 작냐) 
 *  >= <= (이상이냐 이하냐)
 *  == != (같냐 다르냐) 
 *  
 *  
 *  [암기] 8가지 기본 데이터 타입(primitive)
 *  
 *  byte short int long float double char boolean
 *   1    2     4   8    4      8      2    1
 *  *. char의 표현 범위(참고) : 0-655535
 *  *. short의 표현 범위(참고) : -32768~32767
 *  *. boolean의 표현범위 : true, false
 *  
 *  
 *  
 */
public class Ex206 {
	public static void main(String[] args) {
		int a=3;
		int b=2;
		System.out.println(a>b); // 결과값 true로 대체
		System.out.println(a<=b); // 결과값 false로 대체
	}
}
