package Java;

public class Day_6_Overloading {
    /*
    it occurs when 2 or more methods in one class have same method name but different parameters.
    return type can be same or different
    access modifier can be same or different
     */
    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }

    public void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {

        Day_6_Overloading overl=new Day_6_Overloading();
        overl.sum(1,2,3,4);
        System.out.println(overl.sum(5,6));
        System.out.println(overl.sum(5,6,8));

    }

}
