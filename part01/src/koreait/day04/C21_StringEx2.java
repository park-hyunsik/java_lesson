package koreait.day04;

import java.util.Scanner;

public class C21_StringEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;

		System.out.print("����� �̸��� �Է��ϼ���. >>> ");
		email = sc.nextLine(); // Ű���� �Է��� ���ڿ��� ó���մϴ�.
		int idx = email.indexOf('@');
		String account, domain;
		if(idx != -1 && idx == email.lastIndexOf('@')) {
			account = email.substring(0, idx);
			domain = email.substring(idx+1, email.length());
			System.out.println(domain);
			System.out.println(account);
			if(domain.equals("gmail.com")) {
				if(account.length() >=6) {
					if(!(account.indexOf('$')== -1 && account.indexOf('%')==-1)) {
						System.out.println("���� : $,%�� ����� �� ���� ��ȣ�Դϴ�.");
						isValid=false;
					}
					
				}else {
					System.out.println("���� :�����̸��� 6���� �̻��̾�� �մϴ�.");
					isValid=false;
				}
				
			}else {
				isValid=false;
				System.out.println("���� :������ �̸��� Ʋ���ϴ�.");
			}
			
		}else {
			System.out.println("���� :�ùٸ� �̸��� ������ �ƴմϴ�.");
			isValid = false;
		}
		
		System.out.println(isValid);

	}

}
