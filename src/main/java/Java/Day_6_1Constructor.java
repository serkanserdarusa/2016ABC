package Java;

class test{
    public test(){
        System.out.println("A");
    }

    public test(int a){
        this();
        System.out.println("B");
    }
        }

public class Day_6_1Constructor extends test {

    public Day_6_1Constructor(){

        super();
        System.out.println("C");
    }
    public Day_6_1Constructor(int b){

       // super(8);
        // super();
       // this();
        System.out.println("D");
    }

    public static void main(String[] args) {

       // test con=new test(6);
       Day_6_1Constructor cons=new Day_6_1Constructor();

    }

}
