package day3;
/*
 * 정수 리터럴: 그냥, 0b, 0, 0x
 * 
 * 연습5 //ctrl+F11을 한 번만!
 * 	12라는 십진수 숫자를
 * -2진수 리터럴
 * -8진수 리터럴
 * -16진수 리터럴
 * 
 * 연습6. //ctrl+F11을 한 번만!
 * 1)8진수 정수 리터럴을 사용하여, 7과 14와 21을 출력
 * 2)16진수 정수 리터럴을 사용하여, 7과 14와 21을 출력
 */
public class Ex0306 {
	public static void main(String[] args) {
		byte b1=127;
		byte b2=0b1111111;
		byte b3=0177; //64+56+7
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		int lit1=12;
		String binary=Integer.toBinaryString(lit1);
		String octal=Integer.toOctalString(lit1);
		String hexa=Integer.toHexString(lit1);
		
		System.out.println("10진수 : "+lit1);
		System.out.println("2진수 : "+binary);
		System.out.println("8진수 : "+octal);
		System.out.println("16진수 : "+hexa);
		
		//연습 5
		byte octal1=07;
		byte octal2=016;   
		byte octal3=025;
		
		System.out.println(octal1);
		System.out.println(octal2);
		System.out.println(octal3);
		
		//연습 6
		byte hexa1=0x7;
		byte hexa2=0xE;
		byte hexa3=0x15;
		
		System.out.println(hexa1);
		System.out.println(hexa2);
		System.out.println(hexa3);
	}
}
