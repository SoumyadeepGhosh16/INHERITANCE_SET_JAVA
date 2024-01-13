//inheritance example


class base{
    int x;
    public base(int _x){
        this.x=_x;
    }
}

class derived extends base{
    int y;
    public derived(int _x,int _y){
        super(_x);
        this.y=_y;
        
    }
    public void display(){
        System.out.println("x=" +x +","+ "y=" +y);
    }
}
public class Inheritance5 {
    public static void main(String args[]){
        derived d=new derived(10,20);
        d.display();
        
    }
}



