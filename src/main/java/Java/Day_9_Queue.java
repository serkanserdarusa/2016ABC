package Java;


import java.util.*;

/*
        priorityQueue==implemenet==>Queue
        linkedList====implemenet==>DeQueue
        ArrayDeque====implemenet==>DeQueue

         */
public class Day_9_Queue {
    public static void main(String[] args) {

        Queue<Integer>q1=new PriorityQueue<>();
        //not ordered(randomly),no get index,FIFO(first in first out)
        q1.add(10);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println(q1);//not ordered
        //System.out.println(q1.get(1));//no get index
        q1.poll();
        System.out.println(q1);
        int a=q1.poll();
        System.out.println(q1);


        Deque<Integer> q2=new ArrayDeque<>();
        //add(),addFirst(),addLast(),removeLast(),removeFirst(),getFirst(),getLast().
        // no get index,not accept null value,ordered as it is(insertion order)
        q2.add(4);
        q2.add(1);
        q2.add(9);
        q2.add(3);
        System.out.println(q2);
        q2.addFirst(5);//5.....
        System.out.println(q2);
        q2.addLast(7);//.....7
        System.out.println(q2);
        //System.out.println(q2.get(0));no get index
        //q2.add(null);//not accept null value
        //System.out.println(q2);//NullPointerException
        q2.removeFirst();
        System.out.println(q2);
        q2.removeLast();
        System.out.println(q2);
        System.out.println(q2.getFirst());
        System.out.println(q2.getLast());
        System.out.println("=======================");

        Deque<Integer> q3=new LinkedList<>();
        //add(),addFirst(),addLast(),removeLast(),removeFirst(),getFirst(),getLast().
        // no get index,accept null value,ordered as it is(insertion order)
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        q3.add(0);
       System.out.println(q3);
        q3.addFirst(5);//5.....
        System.out.println(q3);
        q3.addLast(7);//.....7
        System.out.println(q3);
        //System.out.println(q3.get(0));no get index
         q3.add(null);//not accept null value
        System.out.println(q3);
        q3.removeFirst();
        System.out.println(q3);
        q3.removeLast();
        System.out.println(q3);
        System.out.println(q3.getFirst());
        System.out.println(q3.getLast());


    }
}



