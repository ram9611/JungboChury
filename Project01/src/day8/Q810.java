package day8;
/*
 * 1부터 100까지의 정수 중 7의 배수가 아니면서 13의 배수인 수를 출력.
	(+고급화) 무한반복 + break + continue로.
 * 
 */
public class Q810 {
	public static void main(String[] args) {
		
		int i=0;
		
		while(true){

			i++;

			if(i%7!=0&&i%13==0)
			System.out.println(i);

			if(i==100)
			break;


			}
		
		
	}
}
