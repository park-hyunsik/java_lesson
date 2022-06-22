package koreait.day11;
//main 메소드는 클래스로 만들어진 애플리케이션입니다. 추상클래스로 완성된 애플리케이션에서 새로운 추상메소드를 만들려면?
import java.util.Set;

public class AShapeTest {

	public static void main(String[] args) {
		Triangle tri = new Triangle(100, 84);
		System.out.println(tri);
		System.out.println("넓이 = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("넓이= " + cir.getArea());
		
		
		
	}
	//AShapeTest
	/*
	 * 참고 : 메소드 재정의 할때 접근 한정자
	 * 부모 public -> 자식 default:오류
	 * 부모 default -> 자식 public :가능
	 */

}

abstract class AShape{		//도형
	protected String shapeNmae;
	protected int width;	
	protected int height;	
	
	public AShape() {	//AShape()는 객체는 직접 못만들고 자식객체 만들어질때 실행
		System.out.println("AShape 디폴트 생성자 동작합니다");
	
	}
	
	//추상클래스는 커스텀생성자 만드나요
	public AShape(int width,int height) {
		System.out.println("AShape 커스텀 생성자 동작합니다");
		this.width=width;
		this.height=height;
	}
	
	public abstract double getArea();	//도형의 넓이
	//추상클래스도 인스턴스 메소드 정의해서 자식 클래스가 재정의 할수 있습니다.
	public Object explain() {	// 애플리케이션 완료후 추상메소드 추가 오류 발생하므로 인스턴스 메소드 추가
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
	private int radius;	//반지름
	

		@Override
			public double getArea() {
				return radius*radius*3.14;
		}								//반지름*반지름*3.14


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


