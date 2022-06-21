package koreait.day04;

import java.util.Scanner;

public class C21_StringEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;

		System.out.print("사용할 이메일 입력하세요. >>> ");
		email = sc.nextLine(); // 키보드 입력을 문자열로 처리합니다.
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
						System.out.println("오류 : $,%는 사용할 수 없는 기호입니다.");
						isValid=false;
					}
					
				}else {
					System.out.println("오류 :계정이름은 6글자 이상이어야 합니다.");
					isValid=false;
				}
				
			}else {
				isValid=false;
				System.out.println("오류 :도메인 이름이 틀립니다.");
			}
			
		}else {
			System.out.println("오류 :올바른 이메일 형식이 아닙니다.");
			isValid = false;
		}
		
		System.out.println(isValid);

	}

}
