package Java;/*
   local variable=it used in method or block

  public void test(int a){//local variable
  int b=20;local variable
  }
  for(int i=0.......){
  local variable
  }
  instance variable=it is declared inside of the class but outside of the method
  it is belongs to the object.Every object has its own copy.
  Changes made to the variable don't reflect in other object.

  what is a class variable?
  class variables are declared with static keyword.
  There is only one copy of that variable is shared by all object(global).
  if there is any changes on variable all other variable effect by this changes.

    */


public class Day_5_1_InstanceAndStaticVariable {
   static String name;//static variable
          String name1;//instance variable

   public static void main(String[] args) {

   Day_5_1_InstanceAndStaticVariable abc=new Day_5_1_InstanceAndStaticVariable();
   abc.name1="mike";//instance
   abc.name="suzan";//static
      System.out.println(abc.name1);//mike
      System.out.println(abc.name);//suzan

      Day_5_1_InstanceAndStaticVariable abc1=new Day_5_1_InstanceAndStaticVariable();
      abc1.name1="scott";
      abc1.name="ayse";
      System.out.println(abc1.name1);//scott
      System.out.println(abc1.name);//ayse
      System.out.println(abc.name1);//mike
      System.out.println(abc.name);//ayse

      Day_5_1_InstanceAndStaticVariable abc2=new Day_5_1_InstanceAndStaticVariable();
      abc2.name1="ali";//instance
      abc2.name="fatma";//static
      System.out.println(abc2.name1);//ali
      System.out.println(abc2.name);//fatma==>final static variable printed everytime
      System.out.println(abc1.name1);//scott
      System.out.println(abc1.name);//fatma==>final static variable printed everytime
      System.out.println(abc.name1);//mike
      System.out.println(abc.name);//fatma==>final static variable printed everytime

   }
   }

