package day7;
/*
 * 
 * 1-100까지 출력 
 * 무한반복문+break이용
 * 
 */
public class Ex709 {
	public static void main(String[] args) {
		
		int i=0; // int형 변수 i 선언, 0으로 초기화
		while(true){

		i++; //i 증감연산자 수행
		System.out.println(i); // i 출력

		if(i==100) // i==100이라면 true->break으로 무한반복문 탈출 
		break;

		}
		
		
	}
}
