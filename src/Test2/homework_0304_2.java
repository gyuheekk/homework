package Test2;

import java.util.Scanner;

// #2. 가위/바위/보 게임
// 컴퓨터에게 랜덤하게 '가위/바위/보'중의 하나를 기억시켜놓고, 사용자가 '가위/바위/보'중에서 하나를 입력하면
// 누가 이겼는지를 출력처리한다.(단, '그만'을 입력하면 프로그램을 종료처리한다.)
public class homework_0304_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("📣지금부터 가위바위보 게임을 시작합니다~!📣 ('그만'을 입력하면 게임은 즉시 종료됩니다.)" );
		System.out.println();
		
		while(true) {
			System.out.print("가위, 바위, 보 중 하나를 입력하세요! ");
			String choice = sc.nextLine();
			
			if(choice.equals("그만")) {
				System.out.println("가위바위보 게임을 종료합니다.");
				break;
			}
			int random = (int)(Math.random() * 3);
			String[] opt = {"가위", "바위", "보"};
			String computerchoice = opt[random];
			
			System.out.println();
			System.out.println("컴퓨터는 가위바위보 중 " + computerchoice + "를 냈습니다." );
			System.out.println("[컴퓨터가 낸 것 : "+computerchoice+" , 사용자가 낸 것 : "+choice+"]");
			
				if(choice.equals(computerchoice)) {
					System.out.println("비겼습니다.\n");
				}
				else if 
					(choice.equals("가위") && computerchoice.equals("보") ||
	        choice.equals("바위") && computerchoice.equals("가위") ||
	        choice.equals("보") && computerchoice.equals("바위"))
	         System.out.println("이겼습니다*^^*\n");
				
	      else System.out.println("졌습니다 ㅠㅠ\n");
		}
		sc.close();
	}
}
