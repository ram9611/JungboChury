package day8;

import java.util.Random;
import java.util.Scanner;

/*
 * 
 * "숫자야구".
		※ sc.next(); ---> 문자열 입력
		  String s = sc.next();   // 521 (엔터)
		  s.charAt(0) ----> '5'
		  s.charAt(1) ----> '2'
		  s.charAt(2) ----> '1'
 * 
 */
public class Q815 {
	public static void main(String[] args) {
		
		Random rd=new Random();
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자야구 Start!");
		
		int ball=0;
		int strike=0;
		
		int num=rd.nextInt(999);
		
		while(true) {
		
		
		
		
		if(num>100) {
		System.out.println(num);
		String game=Integer.toString(num); // 게임값 입력
		
		System.out.print("숫자 세자리를 입력하세요: "); //player값 입력
		String player=sc.next();
		
		
		
		if(player.charAt(0)==game.charAt(1)||player.charAt(0)==game.charAt(2)) {
			ball++;
		} else if(player.charAt(1)==game.charAt(0)||player.charAt(1)==game.charAt(2)){ 
			ball++;
		} else if(player.charAt(2)==game.charAt(0)||player.charAt(2)==game.charAt(1)) {
			ball++;
		} else if(player.charAt(0)==game.charAt(0)) {
			strike++;
		}else if(player.charAt(1)==game.charAt(1)) {
			strike++;
		}else if(player.charAt(2)==game.charAt(2)) {
			strike++;
		}
		
		System.out.println("player:"+player+" ball:"+ball+" strike:"+strike);
		
		
			
		if(strike==3) {
			System.out.println("You win!");
			break;
		}	
			
		
		
		
		}
		
		
		
		}
	}
}
