package Java;

public class Day_5_2_InstanceAndStaticVariable2 {

    static String name="john";//static variable
           String name1="christy";//instance variable

     public Day_5_2_InstanceAndStaticVariable2(){//constructor
     System.out.println("constructor");
     }

    public static void test(){//static method
        System.out.println("static method");
    }

    public  void test1(){//instance method

         System.out.println("instance method");
    }

    public static void main(String[] args) {

        Day_5_2_InstanceAndStaticVariable2 abc=new Day_5_2_InstanceAndStaticVariable2();

        System.out.println(name);//by variable name==>static
        System.out.println(Day_5_2_InstanceAndStaticVariable2.name);//by class==>static
        System.out.println(abc.name);//by created object==>static

        System.out.println(abc.name1);//by created object==>instance

        test();//static method
        Day_5_2_InstanceAndStaticVariable2.test();//static method
        abc.test();//static method

        abc.test1();//instance







    }
}
