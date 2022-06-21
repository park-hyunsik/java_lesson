package koreait.day11.test;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		//����ð� : ms , ns ( 1970�� 1��1�� ������ �������� �������� ī��Ʈ �Ѱ��Դϴ�.)
		
		//1��, 1���� ���� �� ms �ϱ��1�� 1000ms(1ms=0.001��)
		//1����=24�ð� *60�� *60�� *1000 =>result ������ �����غ�����.
		int result =24*60*60*1000;
		System.out.println("1���� " + result + " ms �Դϴ�");
		//int��������� overflow �Դϴ�. long��ȯ �ʿ�
		System.out.println("1���� " + result*365L + " ms �Դϴ�");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1���� " + df.format(result) + " ms �Դϴ�");
		System.out.println("1���� " + df.format(result*365L)+ " ms �Դϴ�.");
		//String.format("%15s",~)���� �ϸ� �ڸ� ���� ��ġ�� ����� �ֽ��ϴ�.
		
		
		/*
		 *1) ��¥�� �ð������� �ٷ�� �ڹ�Ŭ������ �����մϴ�. 2)java.util.Date Ŭ���� -> java.util.Calendar Ŭ���� )
		 *3) java 8 ���� java.time.LocalDate(��¥) , LocalTime(�ð�) , LocalDateTime(��¥�� �ð�) Ŭ����
		 *4) 
		 */
		
		LocalDate currentDate = LocalDate.now();	//static �޼ҵ�� ��ü�� ����
		System.out.println("��¥Ȯ��"+ currentDate);
		
		LocalTime currentTime = LocalTime.now();	//static �޼ҵ�� ��ü�� ����
		System.out.println("�ð�Ȯ��"+ currentTime);
		
		LocalDateTime current = LocalDateTime.now();	//static �޼ҵ�� ��ü�� ����
		System.out.println("��¥�ͽð� Ȯ��"+ current);
		
		
		//of() �޼ҵ�� Ư�� �ð� �� ��¥ ��ü ����
		LocalDate mybirth = LocalDate.of(1996, 7, 9);
		System.out.println("�� ź���� Ȯ�� : " + mybirth);
		
		  LocalTime mybirth_time = LocalTime.of(6, 6);
		  System.out.println("�� ź�� �ð� : " + mybirth_time);
		
		//LocalTime mybirth_time = LocalTime.of(6, 6);
		//System.out.println("�� ź�� �ð� : " + mybirth_time);
		
		//�� ���� Ŭ������ ��¥ ������ ���� ��� Ŭ������ �ֽ��ϴ�. (���� �¾�� ��� ? ���? ����)
		Period between = Period.between(mybirth, currentDate);
		System.out.println("���� �¾�� " + between.getYears() + "��(years)");
		System.out.println(" " + between.getMonths()+ "����(months)");
		System.out.println("���� �¾�� " + between.getDays() + "��(days)");
		
		System.out.println("�����¾�� : " + ChronoUnit.DAYS.between(mybirth, currentDate)+"�� �������ϴ�.");
		
		//Duration Ŭ����
		//ChronoUnit Ŭ����
	}

}
