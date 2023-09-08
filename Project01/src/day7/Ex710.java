package day7;
/*
 * 1~100중 3의 배수만 출력
 * 무한반복문+break+continue
 * 
 * 
 */
public class Ex710 {
	public static void main(String[] args) {
		
		int i=0; //int형 변수 i 선언, 0으로 초기화

		while(true){

		i++; //i 증감연산자 수행
		
		if(i%3==0) //조건 true시 i 출력: i에서 3 나머지 연산 결과 0이라면 true
		System.out.println(i);

		if(i==100) // 조건 true시 break문으로 무한반복문 탈출 : i가 100이 된다면 true
		break;


		}
		
	}
}
