package Java;


//public,protected,default,private

class Data{
    public String name="mike";
    private int num=2;
    protected byte age=44;
    double salary=8000.5;

    public void A(){
        System.out.println("public access modifier");
    }
    protected void B(){
        System.out.println("protected access modifier");
    }
     void C(){
        System.out.println("default access modifier");
    }
    private void D(){
        System.out.println("private access modifier");
    }
}

public class Day_7_AccessModifier extends Data {
    public static void main(String[] args) {
        Day_7_AccessModifier obj=new Day_7_AccessModifier();
        System.out.println(obj.age);//protected
        System.out.println(obj.name);//public
        System.out.println(obj.salary);//default
        //System.out.println(obj.num);//private
        obj.A();//public
        obj.B();//protected
        obj.C();//default
        //obj.D();//private

    }

}
