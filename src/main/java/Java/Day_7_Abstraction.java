package Java;
/*
    it is a process of hiding implementation
    Abstract class allows us to create functionality and implement or override from subclasses
    abstract class can contain regular method or abstract  method without body
    if regular class extends  an abstract class,then abstract method meant to be overridden.(not regular method)
    Access modifier should be same or more visible(in sub class)
    we can not create object by using abstract class or interface
    class-class==>extends
    interface-interface==>extends
    class-interface==>implement
    abstract class cannot be private,final and static
     */
class father extends  Day_7_Abstraction{//father sub class Day_7_Abstraction super class
    public  void salary(){
        System.out.println("my salary is $4000");
    }

}
class mother extends Day_7_Abstraction{
//    public mother(){
//        super();
//        System.out.println("mother");
//    }
public  void salary(){
    System.out.println("my salary is $5000");
}


}
public  abstract class Day_7_Abstraction {//super class
//    public Day_7_Abstraction(){
//
//        System.out.println("main");
//    }
    protected abstract void salary();
    public void child(){

        System.out.println("I am a child");
    }

    public static void main(String[] args) {
        //Day_7_Abstraction obj=new Day_7_Abstraction();
        father obj=new father();
             obj.salary();
             obj.child();
        mother obj2=new mother();
        obj2.salary();
        obj2.child();
    }

}
