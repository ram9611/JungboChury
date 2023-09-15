package day12;
/*
 * Q1205.	크기가 6인 int형 배열을 만들고
	난수 발생(1~10)해서 배열을 채운 후
	1) 배열의 내용을 출력 (단, Arrays.toString() 사용 금지)
	2) 평균 값을 출력(double형)
	3) 평균 값보다 큰 요소들을 출력.

 * 
 */
public class Q1205 {
	public static void main(String[] args) {
		
		
		int[] arr=new int[6];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		
		double avr= (double) sum/arr.length;
		
		
		System.out.println();
		System.out.println("평균 : "+avr);
		System.out.print("평균보다 큰 요소:");
		for(int i=0;i<arr.length;i++) {
			
			if(avr<arr[i])
				System.out.print(arr[i]+" ");
		}
	
		
		
		
		
		
		
	}
}
