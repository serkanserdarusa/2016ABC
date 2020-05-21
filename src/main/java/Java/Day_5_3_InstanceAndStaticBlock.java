package Java;

public class Day_5_3_InstanceAndStaticBlock {

    public Day_5_3_InstanceAndStaticBlock(){

        System.out.println("constructor");//belongs to object
    }

    static{
        System.out.println("static block");
    }

    {
        System.out.println("instance block");//belongs to object
    }

    public static void main(String[] args) {
        System.out.println("main method1");
        Day_5_3_InstanceAndStaticBlock ab=new Day_5_3_InstanceAndStaticBlock();
        Day_5_3_InstanceAndStaticBlock ab1=new Day_5_3_InstanceAndStaticBlock();
        System.out.println("main method2");
    }
}
