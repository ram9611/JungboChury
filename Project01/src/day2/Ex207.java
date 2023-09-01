package day2;
/*
 * [정리]
 * AND 연산 : 둘다 True여야 True이다
 * (비가 온다) 그리고 (나는 밖에 나간다) 
 * &&(shift+7) ampersand
 * 
 * OR 연산 : 둘 중에 하나라도 True이면 True
 * (비가 온다) 또는 (눈이 온다)
 * ||(shift+ \\) pipe
 * 
 */
public class Ex207 {
	public static void main(String[] args) {
		int a=5;
		//1) a가 5이거나 6이냐?
		System.out.println((a==5)||(a==6)); // (a가 5냐) || (a가 6이냐)
		//System.out.println(a==5||6);  err
		
		//2) a가 5이거나 6이거나 7이냐?
		System.out.println((a==5)||(a==6)||(a==7));
	}
}
