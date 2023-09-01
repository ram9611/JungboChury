package day3;
/*
 * 변수의 선언: 데이터타입 변수이름
 * 변수를 사용하기전에 : 1)선언 2)초기화
 * 
 * [암기] 8가지 기본 데이터 타입(primative datatypes)
 * byte, short, int, long + float, double + char + boolean
 *  1      2     4     8      4      8        2       1
 * [암기]자동 형변환 규칙 -> 정보의 소실
 * byte->short->int->long->float->double
 * 1       2     4     8     4      8
 * 
 *        char->
 */
public class Ex0301 {
	public static void main(String[] args) {
		int num; // 변수의 선언: "데이터타입 변수이름"
		num=5;   // 변수의 '초기화' 변수에 최초로 값을 저장하는 사건
		
		System.out.println(num); // 변수를 사용 : 사용하기 전에 선언과 초기화 확인
	}
}
