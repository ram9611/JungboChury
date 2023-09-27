package day21;
/*
 * Q1902. 메서드의 이름이 'printMessage'이고
	파라미터가 각각 int, double, String인 3개의 메서드를 작성해 보세요.
	각각 "정수형인 메서드", "실수형인 메서드", "문자열인 메서드"라고 출력.

 * 
 */
public class Q1902 {
	
	static int printMessage(int n) {
		
		System.out.println("정수형인 메서드");
		return n;
	}
	
	static double printMessage(double n) {
		
		System.out.println("실수형인 메서드");
		return n;
	}
	
	static String printMessage(String s) {
		
		System.out.println("문자열인 메서드");
		return s;
	}
	public static void main(String[] args) {
		
		int pM1 = printMessage(10);
		double pM2 = printMessage(1.4567);
		String pM3 = printMessage("안녕하세요");
		
		System.out.println(pM1);
		System.out.println(pM2);
		System.out.println(pM3);
		}
}
