package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {


		
		int k=0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n�Է��������� ��� ���ϴ� ���� �Դϴ�.(����:-1)");
		while(k!=-1) {
			System.out.print("�����Է�>>>");
			k=sc.nextInt();
			if(k!=-1)
			sum +=k;
			
		}
		System.out.println("sum =" + sum);
		sum=0;
		k=0;
		System.out.println("\n\n�Է��������� ��� ���ϴ� ���� �Դϴ�.[ver2.0](����:-1)");
		do {
			sum+=k;
			System.out.print("�����Է�>>>");
			k=sc.nextInt();
			
		}while(k!=-1);
		System.out.println("sum =" + sum);

		
		sum=0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ°��� �Դϴ�.[ver2.2](����:-1)");
		
		while(true)	{
			System.out.print("�����Է�>>>");
			k=sc.nextInt();
			
			if(k==-1)	break;	//�׻� ���϶�, Ż��(����) ���ǰ� break�� ����մϴ�.
			sum+=k;
			
			
		}
		System.out.println("sum =" + sum);

		sum=0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ°��� �Դϴ�.[ver2.3](����:-1)");
		boolean isState =true;
		while(isState) {
			System.out.print("�����Է�>>>");
			k=sc.nextInt();
			
			if(k==-1)	isState=false;
			else sum+=k;
			
		}
		System.out.println("sum =" + sum);
		//continue�� ���� : �Էµ� ���� 10�� ����̸� sum �� ������ �ʴ´�.

		sum=0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ°��� �Դϴ�.[ver2.3](����:-1)");
		while(true) {
			System.out.println("�����Է�>>>");
			k=sc.nextInt();
			if(k==-1) break;
			if(k%10==0) continue;	//�Ʒ� ��ɾ� �������� �ʰ� �ٽ� �ݺ� ó������
			sum+=k;
			
		}
		
		
		System.out.println("sum =" + sum);
		sc.close();
	}
	
	
	
	
	
	
	
	
	
}


/*	for(int i=0;i<5;i++)
System.out.println("hello!("+(i+1)+")");

//while�� ����
//loop counter ���� ����
int j=0;
while(j<5)	{
System.out.println("hello!("+(j+1)+")");
j++;

}
*/