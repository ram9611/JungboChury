package day3;
/*
 * 표현범위
 * byte: -128~127(128+1+127=256가지의 값)
 * 256=2의 8승. (bit가 8개 있어서)
 * 
 * [고급] MSB(Most sig...)
 * -128: 1 0 0 0 0 0 0 0 음수처리방법 (1의 보수화->1을 더함)
 *  127: 0 1 1 1 1 1 1 1  
 *  ->byte b=127;
 *  b++;
 *  syso(b); //-128
 * 
 */

public class Ex0302 {
	public static void main(String[] args) {
		byte b=3;
		short s=b;
		int i=s;
		long lo=i;
		float f=lo;
		double d=f;
		System.out.println(d); //3.0
		
		int num= (int) d; // 강제 형변환: "(데이터타입) 값"
		//3.0->3
		System.out.println(num);//3
		System.out.println(d);// 3일까? X
		
		d=3.63;
		int num2=(int) d;
		System.out.println(num2); //3
		System.out.println(d); //3.63
		// 실수-> 정수: "소수점 이하를 잃어버림"
		//3.63->3 (정보가 소실되었는데 오케이 개발자가 동의)
		
		
		int num3=-65;
		char c_2=(char)num3;
		System.out.println(c_2);
		
		
		System.out.println("=============");
		
		//한 문자를 저장-->char형 변수를 저장. char:2바 정수(0~65535)
		
		char c='B';
		c=65;// 표: 유니코드표, 아스키코드표
		System.out.println(c);
		
		
		char c1='B';
		c1=70;// 
		System.out.println(c1);
		
		char c3='a';
		c3=97;
		System.out.println(c3);
		System.out.println((int)c3);
					    
					    
	}
}
