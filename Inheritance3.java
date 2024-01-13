class a{
    int a;
    void set_value(int x){
        a=x;
    }
}
 public class Inheritance3 extends a{
    int b,product;
     void set_value2(int x){
        b=x;
    }
    void set_product(){
        product=a*b;
        System.out.println("product of the calculation"+" "  +product);
    }
    public static void main(String args[]){
        Inheritance3 obj=new Inheritance3();
        obj.set_value2(5);
        obj.set_value(5);
        obj.set_product();
    }
}
