package day5;
/*
 * 반복문
 * for/ while/ do~while
 * 
 * 
 * 
 */
public class Ex506 {
	public static void main(String[] args) {
		// 1 2 3 4
		for(int i=1;i<=4 ;i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		System.out.println("===============");
		
		int i=1;
		while(i<=4) {
			System.out.println(i+" ");
			i++;
		}
		
		i=1;
		 do{
			System.out.println(i+" ");
			i++;
		} while(i<=4);
		 System.out.println();
	}
	
}
