class test{
    public void test(){
        System.out.println("constructor called from parent class");
    }
}

class derived extends test{
     derived(){
        System.out.println("contructor called from child class");
     }
}
public class Inheritance4 {
    public static void main(String args[]){
   
        derived d=new derived();
        d.test();
    }
}

