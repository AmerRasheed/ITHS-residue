import java.util.*;

public class circle extends Shape1{
  public String color;
  public boolean filled;
  public double radius;

  //Shape1();
  public Shape1(double radius ){
    this.radius=radius;

  }
  public double getRadius (){
  return radius;
  }

  public void setRadius (double radius ) {
  this.radius=radius;
  }

  public String getColor (){
  return color;
  }

  public void setColor (String color ) {
  this.color=color;
  }

  public boolean getFilled(){
  return filled;
    }

  public void setFilled(boolean filled){
  this.filled=filled;
  }

//  System.out.println("Shape");
    //Functions

  public double getArea(double area)
  {
  return 3.14* (radius*radius);
      }

    //getPerimeter(){    }


    //toString(){    }

  }
