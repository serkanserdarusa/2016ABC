package first;


import Java.Day_7_AccessModifier;

public class Day_7_protected_public extends Day_7_AccessModifier {
    public static void main(String[] args) {
        Day_7_protected_public obj=new Day_7_protected_public();
        System.out.println(obj.age);//protected
        System.out.println(obj.name);//public
        obj.A();//public
        obj.B();//protected
        //obj.C(0);//default


    }
}
