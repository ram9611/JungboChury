package day10;
/*
 * 배열 : 데이터의 목록을 다루는 것
 * ex) 300명 학생의 성적 리스트
 * 
 * 
 * 
 */
public class Ex1005 {
	public static void main(String[] args) {
		// 세 학생의 점수: 95, 90, 100
		//3명--?30명?-->300명?
		
		/*int score1=95;
		int score2=90;
		int score3=100;
		
		//총점
		System.out.println(score1+score2+score3*1.0);
		
		
		//평균
		System.out.println((score1+score2+score3)/3.0);*/
		
		
		int[] scores= {95,90,100};
		int total=0;
		
		for(int i=0;i<=2;i++) {
			
			total+=scores[i]; //인덱스 주소 필요
			
			
		}
		
		System.out.println(total);
		System.out.println(total/3.0);
		
		
	}
}
