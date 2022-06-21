package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		
		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");
		System.out.println("--------------------");
		System.out.println("사나\t1996.12.29\t27");
		System.out.println("지효\t1997.02.01\t26");
		System.out.println("미나\t1998.03.24\t25");
		System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%-12s%s%5d\n","momo","1999.04.23",24);
		System.out.printf("%-12s%s%5d\n","nayon","1997.06.14",27);
		//System.out.printf("%-12s%5d\n","nayon","1997.06.14");
		
		//+++++연습++++++++++
		System.out.printf("%-10s%s%4d\n","현식","1996.07.09",27);
		System.out.println("박현식");
		System.out.println("현식\t1996.07.09\t27");
		
		System.out.println("호랑이\t\t\t\t\t\t\t\t사자");
		
		System.out.printf("%12s%4d.%1d.%2d%5d\n","dayeon",1998,5,28,25);
		System.out.printf("%-12s%4d.%1d.%2d%5d\n","momo",1999,4,23,24);
		System.out.printf("%-12s%4d.%1d.%2d%5d\n","nayon",1997,6,14,27);
		//여기까지는 데이터를 직접 리터럴로 표현해서 출력헀습니다.
		
		
		//진도방향 : 변수(데이터를 저장하고 있는 기억장소 이름) 사용
	//	System.out.printf("%-12s%4d.%1d.%2d%5d\n","nayon",name,year,month,day,age);
		
	}
	/*출력에 사용되는 형식
	*\(역슬래쉬) 사용하는 이스케이프 문자:\n (줄바꿈) , \t(tap)
	*형식지정문자 %기호 사용 : %s(문자열) , %d(w정수) 자리수를 지정해서 쓸수 있습니다.
	*									ㄴ남은 자리0으로 채울때에는 #03d 와같이사용
	* "" 안에 표시된 숫자는 정수가 아닙니다. 문자열입니다.
	*
	*
	*
	*
*/



}




