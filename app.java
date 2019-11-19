//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method

abstract class CShape
{
  protected String color;
  public void setColor (String str)
  {
    color=str;  
  }
  public abstract void show();
}
class CRectangle extends CShape
{
  protected int width,height;
  public CRectangle(int w , int h)
  {
    width=w;
    height=h;
  }
  public void show()
  {
    System.out.print("color=" + color + ",  ");
    System.out.println("area=" + width*height);
  }
}
class CCircle extends CShape
{
  protected double radius;
  public CCircle(double r)
  {
    radius=r;
  }
  public void show()
  {
    System.out.print("color=" + color + ",  ");
    System.out.println("area=" + 3.14*radius*radius);
  }
}
class CTriangle extends CShape
{
  protected double a,b,c;
  public CTriangle(double a,double b,double c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
  }
  public void show()
  {
    System.out.print("color=" + color + ",  ");
    System.out.println("area=" + 0.5*a*b);
  }
}
public class app
{
  public static void main(String args[])
  {
    CRectangle rect = new CRectangle(5,10);
    rect.setColor("Yellow");
    rect.show();
    
    CCircle cir = new CCircle(2.0);
    cir.setColor("Green");
    cir.show();
    
    CTriangle tri = new CTriangle(3,4,5);
    tri.setColor("Red");
    tri.show();
  }
}