package day3;

/*
 * 
 * 
 * 실수의 사용에는 오차가 따를 수 있음
 * 실수: '근사값'으로 표현하기 때문.
 * 		'근사값'이기 때문에 '오차'가 존재.
 * 
 * [고급]실수의 표현, floating-point representation(부동소수점 표현법)
 * 		float(4바)-> Single precision
 * 		double(8바)-> double precision
 * 
 * 
 */
public class Ex0303 {
	public static void main(String[] args) {
		float f=0.1f;
		float f2=0.2f;
		System.out.println(f+f2);
		
		f=0.0f;
		for(int i=1; i<=100;i++) {
			f+=0.1f; // 또는 f=f+0.1f;
		}
		
		System.out.println(f); //10.000002
	}
}
