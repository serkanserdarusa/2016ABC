package Java;

public class Day_5_4_Switch {

    public static void main(String[] args) {



        int day = 1;
        switch (day) {
            case 1:
                System.out.println("monday");
            case 2:
                System.out.println("tuesday");
            case 3:
                System.out.println("wednesday");
            case 4:
                System.out.println("thursday");
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("wrong day");

        }
        //break==>exit the loop and switch
        //continue==>exit iteration
        //return==>exit method();
        //you can not write anything after break,continue and return
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int each : arr) {
            if (each == 4) {
                // continue;==>1,2,3,5,6
                break;//==>1,2,3

            }
            System.out.println(each);
        }
        System.out.println("something");
        System.out.println();

        System.out.println( test(4,5));
    }
                public static int test(int a,int b){
                 a=4;
                 b=5;
                    System.out.println(a*b);
                    System.out.println("ssssss");
                    return a+b;


        }
        }


