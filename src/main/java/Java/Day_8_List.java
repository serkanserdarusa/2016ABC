package Java;

import java.util.*;

public class Day_8_List {
    public static void main(String[] args) {


        //list==>it is ordered(as it is),there is get(index),accept dublicate
        List<String> list=new ArrayList<>();
//        List<String> list1=new LinkedList<>();
//        List<String> list2=new Vector<>();
//        List<String> list3=new Stack<>();
        list.add(0,"A");
        list.add(1,"B");
        list.add(2,"C");
        list.add(3,"D");
        System.out.println(list);
        System.out.println(list.get(3));
        list.add(4,"A");
        System.out.println(list);

        List<String> list1=new LinkedList<>();
        list1.add(0,"K");
        list1.add(1,"L");
        list1.add(2,"M");
        list1.add(3,"N");
        System.out.println(list1);
        System.out.println(list1.get(3));
        list1.add(4,"L");
        System.out.println(list1);

        //linkedlist provide doublylinked but ArrayList dosent.
        // That is why add and remove are faster in linkedlist than ArrayList but iterator slow

        Vector<Integer>vt=new Vector<>();
        //it is synchronized  and thread safe means only one thread at a time can access the code.
        // it is slower than other
        vt.add(1);
        vt.add(2);
        vt.add(3);
        vt.add(4);
        System.out.println(vt);
        vt.add(2);
        System.out.println(vt);
        System.out.println(vt.get(2));

        Stack<Integer>st=new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(2);
        System.out.println(st);
        System.out.println(st);
        System.out.println(st.get(2));
        System.out.println("===============");
        //LIFO==>last in First Out

        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        st.pop();
        System.out.println(st);

    }
}
