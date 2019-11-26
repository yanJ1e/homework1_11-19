import java.lang.Math; // headers MUST be above the first class


interface Shape
{
  abstract double getArea();
}
class Rectangle implements Shape
{
  double length;
  double width;
  
  public Rectangle (double l,double w)
  {
    length=l;
    width=w;
  }
  
  public double getArea()
  {
    return length*width;
  }
  
  public String toString()
  {
    return "Area=" + getArea();
  }
}
class Triangle implements Shape
{
  double base;
  double height;
  
  public Triangle (double b,double h)
  {
    base=b;
    height=h;
  }
  
  public double getArea()
  {
    return base*height/2;
  }
  
  public String toString()
  {
     return "Area=" + getArea();
  }
}
public class main
{
  public static void main (String args[])
  {
  	Rectangle rec = new Rectangle(10,5);
    System.out.println(rec.getArea());
    System.out.println(rec.toString());
    Triangle tri = new Triangle(10,20);
    System.out.println(tri.getArea());
    System.out.println(tri.toString());
  }
}