package koreait.day05;

public class C_22_AssignTests {

	public static void main(String[] args) {

		//���� : ���������� , ��࿬����
		int i=10, sum=0;
		i=i+1;	//i=11
		i+=1;	//i=12
		i++;	//i=13 (��ġ:postfix
		++i;	//i+14 (��ġ:prefix
		
		System.out.println("i++ ?" + i++); 
		System.out.println("++i ? "+(++i));
		
		sum = sum+i;	//sum=16;
		sum+=i;	//sum=32
		System.out.println("sum?"+sum);
		
		sum = sum - 10;
		sum -=10;
		
		
		
		
	}

}
