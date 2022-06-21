package koreait.day05;

public class C23_Fortest {

	public static void main(String[] args) {

		//명령문의 반복1
				System.out.println("hello!");
				System.out.println("hello!");
				System.out.println("hello!");
				System.out.println("hello!");
				System.out.println("hello!");

				
				//명령문의 반복2
				System.out.println("hello!(1)");
				System.out.println("hello!(2)");
				System.out.println("hello!(3)");
				System.out.println("hello!(4)");
				System.out.println("hello!(5)");
				
//				for(변수초기값;실행조건식;증감식)		//변수는 loop counter (반복문 횟수 제어하는 역할)
				for(int i=0;i<5;i++)	{		//i를 for() 안에서 선언하면 for에서만 사용할수 있습니다.(for { }의 지역변수)
					//i는 0부터 4까지 변경되면서 실행합니다.
					System.out.println("헬로우 !");		//i=0 , 0<5 참 -> 출력 실행 -> i++
					System.out.println(i);
					System.out.println("////////");		//i=1 , 1<5 참 ->    " -> i++
				}										//i=2, 2<5 참 ->     "    -> i++
										//	:
										//i=5, 5<5 거짓 -> for종료
				System.out.println("--------------------------------------------------");
				//다른 예시
				for(int i=0;i<10;i+=2)			{
					System.out.println("HELLO!!!!!");  
					System.out.println(i);
				}
				
				for(int i=0;i<0;i++) 	{
					System.out.println("헬로우!!!!!");
					System.out.println(i);
	}
					
				for(int i=10;i>0;i--)			{
					System.out.println("헬로우 !");	
					System.out.println(i);
					System.out.println("////////");	

				}

				for(int i=0;i<5;i++)
					System.out.println("hello!("+(i+1)+")");
				
				

			}							
		}
