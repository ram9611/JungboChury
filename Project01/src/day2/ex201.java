/*
 * [암기] 자동 형변환 규칙
 *	6가지 데이터 타입(자료형)
 * byte-> short-> int-> long-> float-> double(실수)
 * 
 * 1	   2	 	4	 8         4      8
 * 
 * ex)
 * int num=5;
 * double num2=5 / int 5에서 double 5.0으로 자동 형변환
 * 
 * byte b=55;
 * short s=b;  / byte 55가 아닌 short 55로 s로 들어감
 * 
 * double d=5.0;
 * long num=d; / double에서 long으로 형변환 X ->err
 * 
 * 
 * [암기] '스캐너 객체 생성' 문장
 * Scanner sc= new Scanner(System.in);
 * 
 * 
 * [암기] 스캐너 이용해서 정수 값 하나 입력
 * "sc.nextInt()"
 */

package day2;

public class ex201 {
	public static void main(String[] args) {
		int a=33;
		double b=3.14;
		char c='가';
		System.out.printf("%d, %f, %c\n",a,b,c);
		
		System.out.println("=============");
		
		int x=5;
		int y=3;
		int z=x+y;
		System.out.println(z);
		System.out.println("=============");
		
		final double PI=3.14;
		int r=10;
		System.out.println(r*r*PI);
		
		
	}
}

}
