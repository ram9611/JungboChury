package day5;
/*
 * 쉬프트 연산자
 * [정리] 
 * <<1 : 왼쪽으로 1비트씩 이동. 빈자리->0으로 채움
 * >>1 : 오른쪽으로 1비트씩 이동. 빈 자리->MSB로 채움
 * >>>1: 오른쪽으로 1비트씩 이동. 빈 자리->0으로 채움 
 * 
 */

public class Ex503 {
	public static void main(String[] args) {
		//16진수 한 자리 = 2진수 네 자리 =16가지를 표현
		//16진수 두 자리 = 2진수 여덟 자리=256가지(2의 8승)표현=바이트
		int a=0x00000002; // 00000000 00000000 00000000 00000010
		a=a<<1;	// 00000000 00000000 00000000 00000100
		System.out.println(a); //4
		
		a=a<<2;	//00000000 00000000 00000000 00010000
		System.out.println(a);//16
		System.out.println("==================");
		
		a=128; // 00000000 00000000 00000000 10000000
		a=a>>1;	// _0000000 00000000 00000000 10000000
				// 00000000 00000000 00000000 01000000
		System.out.println(a);//64
		System.out.println("==================");
		/*
		 * 고급
		 * a=0xffffff80; :-128 이해= 고급
		 * 
		 */
		
		a=0xffffff80; //:-128 //이해= 고급
		a=a>>1; //-64
		System.out.println(a);
		
		a=0xffffff80; // 11111111 11111111 11111111 1000000
		a=a>>>1;	// 01111111 11111111 11111111 1100000
		System.out.println(a);
		
		a=0x7fffffc0;
		System.out.println(a);
	}
}
