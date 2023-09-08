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
public class Ex712 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("몇 판 입력 :");
		int game=sc.nextInt();
		
		int count=0;
		int i=0;
		
		while(true) {
		
		i++;
			
		int num=(int)(Math.random()*3);
		System.out.println(num);
		
		String com=new String[]{"가위","바위","보"}[num];
		System.out.println(com);
		
		String player=sc.next();
			
		if((player.equals("가위")&&com.equals("보"))
				||(player.equals("바위")&&com.equals("가위")) 
				||(player.equals("보")&&com.equals("바위"))) {
			
			System.out.println("player: win!");
			count++;
			if(count>game/2)
			{
				System.out.println("You're winner!");
				break;
			}
				
				
		} else if(player.equals(com)) {
			System.out.println("무승부");
		} else {System.out.println("player: lose");}
		
		
		
		if(i==game)
		{System.out.println("Game end...");	
		break;}
		
		}
		
	}
}
