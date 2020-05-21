package Java;

public class Day_7_2Accessmodifier {
    public static void main(String[] args) {
        Day_7_AccessModifier obj=new Day_7_AccessModifier();
        obj.A();//public
        obj.B();//protected
        obj.C();//default
        //obj.D();//private
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.salary);
        //System.out.println(obj.num);//private


    }
}
