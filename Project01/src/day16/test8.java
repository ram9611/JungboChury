package day16;

import java.util.Random;

/*
 * 
 * - 배열 기본 문제 모두 (주사위 2개 / 로또번호생성1 포함)
 */
public class test8 {
	public static void main(String[] args) {
		
		Random rd= new Random();
		boolean[] Lotto=new boolean[45];
		
		for(int i=0;i<6;i++) {
			
			int num=rd.nextInt(45);
			
			if(Lotto[num]) {
				i--;
				continue;
			}
			
			Lotto[num]=true;
			
		}
		
		for(int i=0;i<Lotto.length;i++) {
			
			if(Lotto[i])
				System.out.print((i+1)+" ");
			
		}
		
	}
}
