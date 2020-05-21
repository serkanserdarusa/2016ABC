package Java;

public class Day_1_StringAndReverse {
    public static void main(String[] args) {
        //What are different way to create string object in java
        String first="Mike";
        String second=new String("Suzan");

        char[]ch={'s','c','o','t','t'};
        String third=new String(ch);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        //String is a class.String is a sequence of character.String is immutable
        String name="mike";
        String name2=new String("mike");

        name.concat("suzan");//stack memory
        name=name.concat("suzan");//heap memory
        System.out.println(name);

        //convert int or Integer to string
        int num=123;
        String abc=Integer.toString(num);
        System.out.println(abc);

        int nums=1234; ;
        String k=String.valueOf(num);
        System.out.println(k);

        //convert String to integer
        String number = "10";
        int result = Integer.parseInt(number); //parse convert string to primitive.
        System.out.println(result);//none

        String number1 = "10";
        int result1 = Integer.valueOf(number); //value of convert string to Wrapper.
        System.out.println(result1);//unboxing


        //Reverse
        //FIRST WAY.letter by letter

        String a="Java is fun";
        StringBuilder sb=new StringBuilder(a);
        System.out.println(sb.reverse());
        System.out.println(sb.append(" & Phyton"));
        System.out.println(sb.delete(0,1));//delete index 0.
        System.out.println(sb.insert(2,"a"));//insert a to the 2.index

        //SECOND WAY.letter by letter

        String b="Java is fun";
        String reverse="";
        for(int i=b.length()-1;i>=0;i--){
            // reverse+=b.charAt(i);
            reverse+=b.substring(i,i+1);

        }

        System.out.println(reverse);

        //THIRD WAY.letter by letter
        String name5 = "Java is easy";

        for (int i = name5.length() - 1; i >= 0; i--) {
            System.out.print(name5.charAt(i));
        }
        System.out.println();

        //FOURTH WAY.word by word
        String word="Today is cold";
        String reverse1="";
        String[]arr=word.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            reverse1+=arr[i]+" ";

        }
        System.out.println(reverse1);


            }
        }






