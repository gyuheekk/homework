package Test1;

import java.util.Scanner;

public class homework_0229_7번 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, choice = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------\n");
			System.out.print("선택> ");
			choice = sc.nextInt();
		 
			switch(choice) {
				case 1:
					System.out.print("예금액을 입력하세요: ");
					int deposit = sc.nextInt();
					balance += deposit;
					System.out.println("예금이 완료되었습니다. 현재잔액: "+balance+"원 입니다.");
					break;
					
				case 2:
					System.out.print("출금액을 입력하세요: ");
					int withdraw = sc.nextInt();
						if(withdraw > balance) {
							System.out.println("잔액이 부족합니다. 현재 잔액: "+balance+"원 입니다."); 
						}
						else if (withdraw <= balance) {
							balance -= withdraw;
							System.out.println("출금이 완료되었습니다. 현재잔액: "+balance+"원 입니다.");
						}
						break;
					
				case 3:
					System.out.println("현재 잔액: "+balance+"원 입니다.");
					break;
					
				case 4:
					System.out.println("프로그램을 종료합니다.");		
					break;
			}
			if(choice == 4) break;
		}
		sc.close();
	}
}
