package koreait.day14;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;


public class C60_CharSequence {

	
	//CharSequence �������̽� ����ü : String, StringBuffer, StringBuilder...
	public static void main(String[] args) {

		String result = new String();	//resul="result"; result = new String("test"_;
		System.out.println("result :" + result );
		System.out.println("1. String Ÿ�� �׽�Ʈ");
		for(int i=2;i<6;i++) {
			//���ڿ� ������ �ٲ�� ���ڿ� ��ü ��ġ�� �޶����ϴ�.
			result += i+"/";
			System.out.println("result :" + result );
		}
		
		StringBuffer sb = new StringBuffer();	//StringBuilder�� �Բ� ������ ���
		System.out.println("2. StringBuffer Ÿ�� �׽�Ʈ");
		//StringBuffer ��ü�� ���ڿ� ������ �ٲ� ���� ��ü�� �߰��Ǵ� ������ �մϴ�.
		//�ݺ��Ǵ� ���� ������ ���� ��� String? String Buffer O ȿ�����Դϴ�.
		for(int i=2;i<6;i++) {
			sb.append(i).append(":");		//���ڿ� ���� ���� + �� ���� ������
			System.out.println("sb : "+sb);
		}
		//CharSequence �������̽� ��� : cotains�޼ҵ��� �ŰԺ���Ÿ��
		// boo
		String sample ="abc2/3/4/5/xyz";
		System.out.println("3. contains�޼ҵ� Ȯ��");
		System.out.println("contains(result)"+sample.contains(result));	//true
		System.out.println("contains(sb)"+sample.contains(sb));
		
		//�޼ҵ��� ���� �Ǵ� �ٸ����� ���ĵ��� Ȯ���Ҷ� : 1Ŭ����or�������̽� 2. �������̽��϶� ����ü�� �����ΰ�?
		//���� : Arraylist �����Ҷ� ���� ���� List �������̽� Ÿ������ �սô�
		List<String> names = new ArrayList<>();
		names = new Vector<>();
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		map = new TreeMap<String,Integer>();
	}
	
}
