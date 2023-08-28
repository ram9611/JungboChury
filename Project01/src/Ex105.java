/* 변수의 표현범위
 * ++, --
 * ex) int num=5;
 * 			num++; // num의 값이 1 증가
 * 			syso(num);
 * 
 * 
 */
public class Ex105 {

	public static void main(String[] args) {
		byte b=127;
		System.out.println(b);
		
		b++;	// overflow (참고)
		System.out.println(b);//128----> -128 [고급]
		
		// 1) byte 타입의 변수는 절대로 128을 표현할 수 없다!
	}

}
