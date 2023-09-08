package day7;

import java.util.Scanner;

/*
 * 가위/바위/보
 * (1)가위/바위/보 입력-->컴 선택과 비교-->승/패/무 여부 출력.
 * String com=가위 바위 보
 * 
 * (2 고급) 몇 판 입력(홀수승 먼저)? 5 
 * (3 고급) 가위,바위,보 외의 입력--->제대로 입력할 때까지 재입력.
 * 
 */
public class Ex713 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int num=(int)(Math.random()*3);
		String com=new String[]{"가위","바위","보"}[num];
		
		
		while(true) {
		System.out.print("가위/바위/보 입력: ");
		String player=sc.next();
		
		if(player.equals("가위")||player.equals("바위")||player.equals("보")) {
		
		if((player.equals("가위")&&com.equals("보"))||(player.equals("바위")&&com.equals("가위")) ||(player.equals("보")&&com.equals("바위"))) {
			
			System.out.println("player win!");
			break;
			
		} else if(player.equals(com)) {
			System.out.println("무승부");
			break;
			
		} else {
			System.out.println("com win!");
			break;
		}
		
		}else
			System.out.println("다시 입력해주세요!");
		
		}
		
		
	}
}
