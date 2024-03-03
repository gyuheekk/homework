package t1;

/*
  중첩 for문을 이용하여 방정식 2x + 3y = 30의 모든 해를 구해서 (x,y) 형태로 출력해보세요.
  단, x와 y는 10이하의 자연수입니다.
 */
public class homework_0229_5번 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y <=10; y++) {
				if((2*x + 3*y) == 30) {
					System.out.println("(x="+x+", y="+y+")");
					cnt++;
				}
			}
		}
		System.out.println("조건을 만족하는 개수는? "+cnt+" 입니다.");
	}
}
