package t1;

// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
public class homework_0229_3번 {
	public static void main(String[] args) {
		int i = 1, sum1 = 0;
		
		while (i <= 100) {
			if(i % 3 == 0) {
				sum1 += i;
			}
			i++;
		}
	System.out.println("3의 배수의 총합은 "+sum1+" 개입니다.");
	
	 
	}
}
