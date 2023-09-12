package day10;

import java.util.Random;

/*
 * 난수 발생(Random number) 발생
 * 
 * 1) Random 클래스: 'Random 객체 생성'-->"Random rd=new Random();"
 * cf) Scanner 객체 생성 :
 * ->rd.nextInt(10) : 0이상 9이하의 정수 하나 난수 발생.
 * ->rd.nextInt() : int형으로 가능한 숫자 중 하나 난수 발생.
 * ->rd.nextDouble: 0.0이상 1.0미만 ==Math.random()
 * 
 * 2)Math.random() : 0.0이상 1.0미만의 수 중 하나 난수 발생
 * 0,1,2---> Math.random()
 * 0.0~2.999999 ---> math.random()*3
 * 0,1,2 ---> (int)(math.random()*3)
 * 
 * 1.2.3.4--->(int)(Math.random()*4)+1
 * 
 * seed값 : 패턴 다양화를 위해
 * ms단위-->system.currentTimeMillis()
 * 
 * 
 * 
 * 
 */
public class Ex1002 {
	public static void main(String[] args) {
		
	// 1~6
	int r=(int)(Math.random()*6)+1;
	
	
	
	Random rd=new Random();
	//rd.setSeed(System.currentTimeMillis());--> 
	//rd.setSeed(9500);
	for(int i=1;i<=10;i++) {
	int r2=rd.nextInt(6)+1;
		
			System.out.print(r2+" ");
			
	}
	}
}
