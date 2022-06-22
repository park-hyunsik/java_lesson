package koreait.day11;
//main �޼ҵ�� Ŭ������ ������� ���ø����̼��Դϴ�. �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �������?
import java.util.Set;

public class AShapeTest {

	public static void main(String[] args) {
		Triangle tri = new Triangle(100, 84);
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("����= " + cir.getArea());
		
		
		
	}
	//AShapeTest
	/*
	 * ���� : �޼ҵ� ������ �Ҷ� ���� ������
	 * �θ� public -> �ڽ� default:����
	 * �θ� default -> �ڽ� public :����
	 */

}

abstract class AShape{		//����
	protected String shapeNmae;
	protected int width;	
	protected int height;	
	
	public AShape() {	//AShape()�� ��ü�� ���� ������� �ڽİ�ü ��������� ����
		System.out.println("AShape ����Ʈ ������ �����մϴ�");
	
	}
	
	//�߻�Ŭ������ Ŀ���һ����� ���峪��
	public AShape(int width,int height) {
		System.out.println("AShape Ŀ���� ������ �����մϴ�");
		this.width=width;
		this.height=height;
	}
	
	public abstract double getArea();	//������ ����
	//�߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ� Ŭ������ ������ �Ҽ� �ֽ��ϴ�.
	public Object explain() {	// ���ø����̼� �Ϸ��� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
		return null;
	}
	
	
	
		@Override
		public String toString() {
			return "AShape [shapeNmae=" + shapeNmae + ", width=" + width + ", height=" + height + "]";
		}

	
}	//AShape


class Triangle extends AShape{ //w*h/2
	
	
	public Triangle(int width,int height) {
		super(width,height);
	}
	
	@Override
	public double getArea() {
		return width*height/2;
	}
	
	
	
}

class Circle extends AShape{
	private int radius;	//������
	

		@Override
			public double getArea() {
				return radius*radius*3.14;
		}								//������*������*3.14


		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", shapeNmae=" + shapeNmae + ", width=" + width + ", height=" + height
					+ "]";
		}



		public void setRadius(int radius) {
			this.radius = radius;
		}
		
		
		
}

class Rectangle extends AShape{											//w*h
	@Override
	public double getArea() {
		return width*height;
	}
}


