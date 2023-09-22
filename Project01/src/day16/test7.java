package day16;

import java.util.Random;

/*
 * 
 * - 배열 기본 문제 모두 (주사위 2개 / 로또번호생성1 포함)
 * 
 */
public class test7 {
	public static void main(String[] args) {
		
		boolean[] dice=new boolean[6];
		Random rd=new Random();
		
		for(int i=0;i<=1;i++) {
			
			int num=rd.nextInt(6);
			
			if(dice[num]) {
				i--;
				continue;
			}
			
			
			dice[num]=true;
			
			
			
		}
		
		
		for(int i=0;i<dice.length;i++) {
			
			if(dice[i])
				System.out.print((i+1)+" ");
			
		}
		
	}
}
