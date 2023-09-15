package day13;
/*
 * 
 * 로또번호 생성1
 * -(1~45중에서 6)
 * -boolean[] 배열 사용
 * 
 */
public class Ex1302 {
	public static void main(String[] args) {
		
		boolean[] arr=new boolean[45];
		
		for(int i=1;i<=6;i++) {
			
			int idx=(int)(Math.random()*45);
			if(arr[idx]) {
				i--;
				continue;
			}
			
			arr[idx]=true;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i])
				System.out.print(i+1+" ");
			
		}
		
	}
}
