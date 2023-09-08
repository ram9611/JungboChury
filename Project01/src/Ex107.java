/*
 * 1. int형 변수에 byte 값을 담기
 * 이해 : 1바이트 공간에 있는 정보를 4바이트 공간으로 가져다 놓을 수 있음.
 * 
 * 2. byte형 변수에 int값을 담기
 * 이해 : 4바이트 공간에 있는 정보를 1바이트 공간으로 가져다 놓을 수 없음.
 * 
 */
public class Ex107 {

	public static void main(String[] args) {
		// 1. int형 변수에 byte 값을 담기
		byte b=10;
		int num=b;
		System.out.println(num);	//이해 : 1바이트 공간에 있는 정보를 4바이트 int에 담는다.
		
		
		 //2. byte형 변수에 int값을 담기
		int num2=10;
		//byte b2=num2; err

	}

}
