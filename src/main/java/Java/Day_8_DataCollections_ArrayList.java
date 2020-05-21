package Java;


import java.util.ArrayList;
import java.util.Iterator;

public class Day_8_DataCollections_ArrayList {
    public static void main(String[] args) {
         //1-ArrayList
        //2-CollectionsFramework
        //3-Map
        // Integer[]arr={1,2,3,4,5};
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       // list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        Iterator it1=list.iterator();//it is interface.
        while(it1.hasNext()){//hasNext mean cursor pointer will look at there is a value or not(true&false)
            System.out.println(it1.next());
        }

//        System.out.println(it1.next());
//        System.out.println(it1.next());
//        System.out.println(it1.next());
//        System.out.println(it1.next());//it return us no such element exception,because there is no more value


        }
    }




