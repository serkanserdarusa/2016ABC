package Java;
 /*
    interfaces is blue print of a class.but it is not a class
    it can not be final
    we can not create object with it
    every variable inside of the interface are public,static and final
    if variable is final needs to be initiliaze immediately
    there is abstract begining of the method even if it is not written

      List,Set,Map,WebDriver,WebElement,Javascriptexecuter.....
     */

//interface-interface==>extends
//class-interfaces==>implement
interface Cat {
    final String c = "Java";

    public abstract void voice();

    default void defaultmethod() {
        System.out.println("default");
    }

    static void staticmethod() {
        System.out.println("static");
    }

}

interface Dog {
    int a = 5;

    public abstract void eat();

    public void test();

}

interface Tiger {
    final double b = 5.5;

    public void speed();

}

public class Day_7_Interface implements Cat, Dog, Tiger {

    public void voice() {
        System.out.println("mirr");
    }

    public void eat() {
        System.out.println("ham");
    }

    public void test() {
        System.out.println("hi");
    }

    public void speed() {
        System.out.println("vin");
    }


    public static void main(String[] args) {

        Day_7_Interface obj = new Day_7_Interface();
        Cat.staticmethod();
        obj.defaultmethod();
        obj.eat();
        obj.speed();
        obj.test();
        obj.voice();
//         Cat obj2=new Day_7_Interface();
//      referance type       object
//              super         sub
    }


}
