package day19;

import java.util.Arrays;

/*
 * 고급1.
사이즈가 10인 정수형 배열을 만들고, 1 이상 100 이하의 정수를 난수발생하여 배열을 채운 후, 
만약에 이 배열이 오름차순으로 구성되어 있으면 “(___번째 시도) arr = [……]” 형식으로 출력하는데, 이를 5백만번 반복하세요. 
단, 리턴타입이 boolean이고 파라미터로 정수형 배열을 하나 받는 메서드 isOrder()를 반드시 정의하세요.
 이 메서드는 파라미터로 넘어온 배열이 오름차순으로 구성되어 있다면 true를, 아니면 false를 리턴하는 메서드입니다.

(실행결과의 예)
	(163522번째 시도) arr = [1, 27, 33, 45, 48, 62, 64, 70, 76, 94]
	(1275192번째 시도) arr = [3, 35, 42, 62, 80, 81, 84, 94, 96, 96]
	(1521172번째 시도) arr = [11, 20, 29, 46, 65, 73, 79, 80, 94, 96]
	(3876839번째 시도) arr = [4, 6, 27, 54, 66, 71, 83, 87, 90, 91]
	(3888780번째 시도) arr = [1, 6, 28, 29, 42, 67, 76, 77, 91, 96]

 * 
 * 
 */
public class Q1907 {
	
	static boolean isOrder(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				
				if(arr[i]>arr[j])
					return false;
				
			}
			
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr=new int[10];
		int cnt=0;
		while(true) {
		cnt++;
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*100+1);
			
		}
		
		if(isOrder(arr)) {
			
			System.out.println(cnt+"번째 시도 arr = "+Arrays.toString(arr));  //(163522번째 시도) arr = [1, 27, 33, 45, 48, 62, 64, 70, 76, 94]
			break;
		}
		
		if(cnt==5000000) {
		System.out.println("오름차순 배열 생성 실패");
		break;}
		
		
		}
		
		
		
	}
}
