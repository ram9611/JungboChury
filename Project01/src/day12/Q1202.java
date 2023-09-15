package day12;

import java.util.Arrays;

/*
 * Q1202(고급). 
	크기가 10인 int형 배열을 만들고
	이 배열을 1~20 사이의 난수로 채운 후
	1) 배열의 내용을 출력하고
	2) 이 배열에 중복값이 있는지 여부를 출력.
	(ex) ---> [3, 9, 8, 4, 5, 13, 19, 18, 14, 5] --> 5라는 값이 중복이에요~
	     ---> 출력: "이 배열에는 중복값이 있음!"	
 * 
 * 
 * 
 */
public class Q1202 {
	public static void main(String[] args) {
		
		int[] num=new int[10];
		
		for(int i=0;i<num.length;i++) {
			
			num[i]=(int)(Math.random()*20+1);
			
		}
		
		System.out.println(Arrays.toString(num));
		
		int count=0;
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=i;j<num.length;j++) {
				
				if(num[i]==num[j])
					count++;
				
			}
			
		}
		
		if(count>=1) {
			System.out.println("이 배열에는 중복값이 있음");
		}
		
	}
}
