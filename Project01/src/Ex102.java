/*
 * 5 vs 5.0?
 * 
 * 정수 (ex.5)---> int
 * 실수 (ex. 5.0)-->double
 * 문자열 : 문자들의 나열---> 따움표(")를 사용 String
 * 문자 : 한 글자 -----> 홑따옴표(')-->char
 * 
 */
public class Ex102 {

	public static void main(String[] args) {
		int n=5; //(표현 이해) "변수의 선언과 동시에 초기화"
		System.out.println("n: "+n);
		
		double n2=5.0; //5.0->5로 고쳐도 에러 없음
		System.out.println("n2: "+n2);
		
		double n3=5; //5.0->5로 고쳐도 에러 없음
		System.out.println("n2: "+n3);

		String s ="abc";
		System.out.println("s : "+s);
		
		char c='A'; // 한 글자(문자)
		System.out.println(c);

	}

}
