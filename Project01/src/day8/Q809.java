package day8;
/*
 * 1부터 100까지의 정수 중 "일의 자리"와 "십의 자리"가 같은 수를 출력.
	(11 22 33 ... 88 99 100)
 * 
 */
public class Q809 {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){


			if(i%10==i/10)
			System.out.println(i);


			if(i==100)
			System.out.println(i);

			}

		
		
	}
}
