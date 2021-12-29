interface Shape{
void draw();
double area();
}
class Rectangle implements Shape{
int length, width;
Rectangle(int length,int width){
this.length=length;
this.width=width;
}
public void draw(){
System.out.println("Rectangle has been drawn");
}
public double area(){
return (double) (length*width);
}
}
class Circle implements Shape{
double pi=3.14;
int radius;
Circle(int radius){
this.radius=radius;}
public void draw(){
System.out.println("Circle has been drawn");}
public double area(){
return(double)((pi*radius*radius)/2);
}
}
class Abstraction{
public static void main(String[] args){
Shape rect=new Rectangle(20,30);
System.out.println("Area of rectangle: "+rect.area());
Shape circle=new Circle(20);
System.out.println("Area of circle: "+circle.area());
}
}