//inheritance example
class subject{
    public String subject1_name(){
        String a="English";
       System.out.println(a);

       return a;
    }
}
    class favourite extends subject{
    public String subject2_name(){
        String b="Science";
       System.out.println(b);

       return b;
    }
}
class third extends favourite{
    public String subject3_name(){
        String b="Science";
       System.out.println(b);

       return b;
    }
}

public class Inheritance2 {
    public static void main(String[] args)
    {
        third g = new third();
        g.subject1_name();
        g.subject2_name();
        g.subject3_name();
    }
}

