package Java;

public class Day_6_Constructor {

    public Day_6_Constructor(){

        //this(6);
        System.out.println("default constructor");

    }

    private Day_6_Constructor(int tall){
      this();
        System.out.println("non-default constructor "+tall);
    }

    protected Day_6_Constructor(double salary,int age){
       this(5);
        System.out.println("non-default constructor2"+salary+age);
    }




    public static void main(String[] args) {
        Day_6_Constructor cons=new Day_6_Constructor();
        Day_6_Constructor cons1=new Day_6_Constructor(5);
        Day_6_Constructor cons2=new Day_6_Constructor(4500.6,44);
        /*
        constructor belongs to object
        Access modifier and class name
        constructor can call from another constructor
        this(),super()
        constructor can not called itself
        Access modifier can be different
         */

    }

}
