public class Day_7_InstanceAndStaticBlock {

    public Day_7_InstanceAndStaticBlock(){
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
        Day_7_InstanceAndStaticBlock ab=new Day_7_InstanceAndStaticBlock();
        Day_7_InstanceAndStaticBlock ab1=new Day_7_InstanceAndStaticBlock();
        System.out.println("main method2");
    }
}
