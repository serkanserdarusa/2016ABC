package Java;

import java.util.*;

public class Day_8_Set {
    public static void main(String[] args) {

        //Set==>dosent accept duplicate, there is no get(index)
        Set<Integer> set=new LinkedHashSet<>();//there is ordered(insertion ordered)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        set.add(1);//there is no duplicate
        set.add(9);
        System.out.println(set);
        //System.out.println(set.get(0));there is no get index

        Set<Integer> set1=new HashSet<>();//there in no ordered
        set1.add(1);
        set1.add(2);
        set1.add(5);
        set1.add(77);
        set1.add(33);
        System.out.println(set1);
        set1.add(8);
        System.out.println(set1);
        //System.out.println(set.get(0));there is no get index

        Iterator<Integer>it=set1.iterator();
        while(it.hasNext()){
            Integer value=it.next();
            System.out.println(value);

            if(value.equals(5)){
                it.remove();
            }

        }
        System.out.println(set1);


        Set<Integer> set2=new TreeSet<>();//Ascending order(increase)
        set2.add(1);//decrease==descending
        set2.add(2);
        set2.add(9);
        set2.add(3);
        set2.add(6);
        set2.add(7);
        System.out.println(set2);

       SortedSet<Integer> set3=new TreeSet<>();//Ascending order(increase)
        set3.add(1);//decrease==descending
        set3.add(2);
        set3.add(9);
        set3.add(3);
        set3.add(6);
        set3.add(7);
        System.out.println(set3);




    }
}
