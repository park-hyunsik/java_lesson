package koreait.day05;

import java.util.Arrays;

public class C27_IntArray {

	public static void main(String[] args) {

		//�迭����
		int[] arr1 = {67,45,98,12,45,66,95};	//�ʱⰪ ����
		int[] arr2 = new int[7];				//�迭�� ũ�⸸ ����. �⺻�ʱⰪ �ֳ���?
		
		System.out.println("\n�迭�̸�(����������)���� ���");
		System.out.println(arr1);	//16����
		System.out.println(arr1.hashCode()); //10����
		
		//�迭 ��Ұ� 1�� ���
		System.out.println("\n�迭 ��Ұ� 1�� ���(�ε��� 3��)");
		System.out.println("arr1[3] = ?" + arr1[3]);
		System.out.println("arr2[3] = ?" + arr2[3]);
		
		System.out.println("\n�迭 ��Ұ� 1�� ����(�ε��� 3��)");
		arr1[3]=999;
		arr2[3]=999;
		
		//����� �迭�� ���� ��� ����� �� �ִ� ���ڿ��� ��ȯ��Ű�� �޼ҵ�
		String temp = Arrays.toString(arr1);
		System.out.println();
		System.out.println("arr1:"+temp);
		System.out.println("arr2:"+Arrays.toString(arr2));
		
		//��¿��� : arr1[0] = 67 �������� ��簪�� ����ϰ� �ʹ�. ->for ��
		System.out.println("\nfor������ �迭��Ұ� ���(arr1)");
		for(int i=0;i<7;i++)
			System.out.println("arr1["+i+"] = "+ arr1[i]);
		
		System.out.println("\nfor������ �迭��Ұ� ���(arr2)");
		for(int i=0;i<arr2.length;i++) {	//�迭�� �迭����� ����(ũ��)�� �����ִ� �ʵ� length �� �ֽ��ϴ�
			String t =  String.format("arr2[%d] = %d",i,arr2[i]);
			System.out.println(t);
			
			System.out.println("\n�迭�� ũ��(����Ʈ)");
			System.out.println("arr1�迭" + arr1.length*Integer.BYTES + "����Ʈ");
			System.out.println("arr2�迭" + arr2.length*Integer.BYTES + "����Ʈ");
			
			System.out.println("\s���� ���� �޼ҵ�� �迭�� ���");
			arrayPrint(arr1, "arr1");
			arrayPrint(arr2, "arr2");
			
		}
		
	}
		public static void arrayPrint(int[] array,String name) { //���� : int �迭, string 2��
			//int �迭�� ���ڷ� ���޹޾Ƽ� arr1[0] = 67 �������� ���� ���
			for(int i=0;i<array.length;i++) {	//�迭�� �迭����� ����(ũ��)�� �����ִ� �ʵ� length �� �ֽ��ϴ�
				String t =  String.format("%s[%d] = %d",name,i,array[i]);
				System.out.println(t);
				
		
			
			}
		}	
	}