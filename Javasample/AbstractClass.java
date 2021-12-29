abstract class Shape{
	String objectName=" ";
	Shape(String name){
		this.objectName=name;
	}
	abstract public double area();
	abstract public void draw();
}
class Rectangle extends Shape{
	int length, width;
    Rectangle(int length,int width,String name){
		super(name);
		this.length=length;
		this.width=width;
	}
	public void draw(){
		System.out.println("Rectangle is drawn");
	}
	public double area(){
        return (double) (length*width);
    }
}
class Circle extends Shape{
	double pi=3.14;
	int radius;
	Circle(int radius, String name){
		super(name);
		this.radius=radius;
	}
	public void draw(){
		System.out.println("Circle has been drawn");
	}
	public double area(){
		return(double)((pi*radius*radius)/2);
	}
}
class AbstractClass{
	public static void main(String[] args){
		Shape rect=new Rectangle(20,30,"Rectangle");
		System.out.println("Area of rectangle: "+rect.area());
		Shape circle=new Circle(20,"Circle");
		System.out.println("Area of circle: "+circle.area());
	}
}