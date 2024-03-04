package Test2;

// #1. 3,6,9 게임
// 1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌, '짝'이라는 문자로 대치하시오.
// 예) 1 2 짝 4 5 짝 7 ~~~~~ 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 41 42 짝 44 ~~~ 100
public class homework_0304_1 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {    //i가 3,6,9를 포함하거나, 3,6,9로 나누어 떨어지는 경우 "짝"출력
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9 ) {
				if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
					System.out.print("짝짝 ");
				else System.out.print("짝 ");
			}
			else {
				if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				System.out.print("짝 ");
				else System.out.print(i + " ");
			}
      if (i % 10 == 0) System.out.print("\n"); 
		}
	}
}
