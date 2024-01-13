//multiple inheritance using interface
interface one{
    public void print_m1();
}

interface two extends one{
    public void print_m2();
}

interface three extends one,two{
    public void print_m3();
}

class number implements three{
    public void print_m1(){
        System.out.println("Inheritance doesn't support multiple inheritance");
    }
    public void print_m2(){
        System.out.println("Because of diamond problem");
    }
    public void print_m3(){
        System.out.println("so multiple inheritance is done using interface");
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        
        number n1=new number();
        n1.print_m1();
        n1.print_m2();
        n1.print_m3();
    }
}
