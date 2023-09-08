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
public class Ex708 {
	public static void main(String[] args) {
		//난수발생: 0,1,2 중에서 하나를 선택.
		
		int num=(int)(Math.random()*3); // int형 변수 num 선언, Math 메소드를 통해 난수 생성 후 int형으로 형 변환한 값으로 초기화  
		System.out.println(num);
		
		//string com= 가위, 바위, 보
		String com=new String[] {"가위","바위","보"}[num]; //String형 변수 com선언, num값에 따라 가위,바위,보 입력
		System.out.println(com);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("가위/바위/보: ");
		String player=sc.next();
		// todo: player: 승! or player:패! or 무승부 입력
		
		if((player.equals("가위")&&com.equals("보")) //player값 com값 && 조건 true시 출력 수행  
				||(player.equals("바위")&&com.equals("가위")) 
				||(player.equals("보")&&com.equals("주먹"))) {
			
			System.out.println("player: 승!");
		}
		
		else if(player.equals(com)) { // player값 com값 똑같다면 true-> 출력 수행
			System.out.println("무승부");
		} else System.out.println("player: 패!");
		
		
		
		
		
		
	}
}
