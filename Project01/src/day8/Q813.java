package day8;
/*
 * 
 * 
 * Q812. (실행결과) 1 -4 9 -16 25 -36 49 -64 81 -100
	- 코드의 일부 : for(int i=1; i<=10; i++) { ... }
 * 
 */
public class Q813 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++){

			if(i%2==0)
			System.out.println(-i*i);
			else
			System.out.println(i*i);


			}

		
	}
}
