package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {

	//�͸�Ŭ���� : anonymous. �̸��� ���� Ŭ����
	public static void main(String[] args) {

		//�������
		//�͸� ����(Inner) Ŭ���� ���� 1��ȸ�� Ŭ����
		AShape sha = new AShape() {
			//�߻�޼ҵ� ������
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		
		};
		AShape sha2 = new AShape() {
			@Override
			public double getArea() {
				return width+height;
			}
		
		};
		System.out.println("sha ���� = " + sha.getArea());
		System.out.println("sha2 ���� = " + sha2.getArea());
		
		//���� : �߻�Ŭ���� �ƴҶ��� �޼ҵ� �������ؼ� ���� �͸�Ŭ����ó�� ���� ����?
		//Ȯ���ϱ�	//�� : �����ϴ�. �׷��� ������ �߻�޼ҵ� �������ϸ� �͸�Ŭ���� ���� ���ϴ�.
		
		Animal snake = new Animal() {
			
			int length;

			@Override
			public void act() {
				setName("�̱��ƴ�");
				setColor("�����");
				length = 3;
				System.out.println("action : ���ٴϱ� ");
				
			}
			
			@Override
			public String toString() {
				return "length=" + length ;
				}
				
		};
		
		
		snake.act();
		System.out.println(snake);
		
	}
}