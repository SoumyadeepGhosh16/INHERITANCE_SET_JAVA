import java.util.*;
//inheritance with constructor 
class circle{
     
    float radius;
    float Radius2;
    float height;
    circle(float r){
        this.radius=r;
    }
   public double area1(){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius");
     float r=sc.nextFloat();
    
    double a=3.14*r*r;
    System.out.println("The area of the circle is:" + " " +a);
    return a;
   }
}
class cylinder extends circle{
     cylinder(float R,float h) {

        super(R);
        this.height=h;
     }
    

public double cylinder1(){
    Scanner sc=new Scanner(System.in);
    System.out.println("The height of the cylinder:");
    float h=sc.nextFloat();
    
    System.out.println("The radius of the cylinder is:");
    float R=sc.nextFloat();

    double area=(2*3.14*R*h)+(2*3.14*R*R);
     System.out.println("the area of the cylinder:" + " " +area);
    return area;
   }
}

public class Inheritance1 {
    public static void main(String[] args){
       cylinder obj=new cylinder(12,15);
       obj.area1();
    }
}
