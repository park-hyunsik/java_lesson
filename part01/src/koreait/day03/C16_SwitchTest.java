package koreait.day03;
import java.util.Scanner;
public class C16_SwitchTest {
	public static void main(String[] args) {
		// switch 문은 if ~ else if 를 대신하는 명령문 입니다.
		Scanner sc = new Scanner(System.in);
		int item_no;
		int pay=0;
		System.out.println("상뭄목록 : 1.2200원🍕🍕 2.1900원🌭🌭 2.3600원  4.2870원");
		System.out.println("상품을 선택해서 장바구니에 넣으세요. >>>");
		item_no = sc.nextInt();  //여기서 값 입력하고 아래 값검사 !!
		
		switch (item_no) {	//조건식 작성 했을 때와 같이 비교할 변수
		case 1:
			pay=2200;
			break;
		case 2:
			pay=1900;
			break;
		case 3:
			pay=3600;
			break;
		case 4:
			pay=2870;
			break;

		default:	//case문에서 해당되지 않은 값.
			System.out.println("상품 선택이 잘못되었습니다.");
			pay=99999;
			break;
		}
		System.out.println("결제금액" + pay + "입니다.");
		
		//위으 switch 문을 if~ else if 로 바꿔어서 실행하기-> 이제 이것 하면 되요 
		
		
		
		
		System.out.println("결제금액2 : " + pay + "입니다.");
		
		
		
		

	
		
		if(item_no == 1) {
			pay = 2200;
		}else if(item_no == 2) {
			pay = 1900;
		}else if(item_no == 3) {
			pay = 3600;
		}else if(item_no == 4) {
			pay = 2870;
		}else {
			System.out.println("상품 선택이 잘못되었습니다");
			pay = 999999999;
		}
		System.out.println("결재 금액2 : "+ pay +"원입니다.");

		
	}

}
		
	




