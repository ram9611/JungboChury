package day16;
/*
 * - 1부터 100까지 홀수 (또는 짝수) 출력.
 * 
 * - 1부터 100까지 n의 배수 출력.
 * 
 * 
 * 
 */
public class test2 {
	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			
			if(i%2!=0)
				System.out.print(i+" ");
			
		}
		
		
		System.out.println();
		int i=0;
		
		while(i<100) {
		i++;
		if(i%2==0)
			System.out.print(i+" ");}
		
		System.out.println();
		
		int j=0;
		do{j++;
		
		if(j%3==0)
		System.out.print(j+" ");		
				
		}while(j<100);
	}
}
