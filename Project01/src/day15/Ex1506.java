package day15;
/*
 * 파라미터/ 인수
 * 
 * 연습1
 * 아래 메서드를 호출한 결과 "YG, 안녕하세요"가 출력되도록 메서드 정의
 * 
 * 연습 2
 * 아래 메서드를 호출한 결과 1 2 3 4 5 출력되도록 메서드 정의
 */
public class Ex1506 {
	
	static void m(int num) { // int num : '파라미터(parameter)'
		System.out.println("m : "+num);
	}
	
	static void Hello(String s) {
		System.out.println(s+", 안녕하세요");
	}
	
	
	static void CountNum(int num) {
		
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
		
	}
	public static void main(String[] args) {
		
		m(3); //3---> 인수(argument)
		m(30);
		
		Hello("HR");
		CountNum(5);
		
	}
}
