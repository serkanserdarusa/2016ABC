package Java;

import java.util.Arrays;
import java.util.Collections;

public class Day_4_ArrayList {
    public static void main(String[] args) {
        //ArraysList
        //Arraylist size is dynamic,accept just wrapper and there is no multiple arrays
        Integer[] arr = {1, 2, 3, 4, 8, 9};
        java.util.ArrayList<Integer> array1 = new java.util.ArrayList<>(Arrays.asList(arr));
        array1.add(0, 1);
        array1.add(1, 2);
        array1.add(2, 3);
        array1.add(3, 4);
        array1.add(4, 5);
        array1.add(5, 8);
        System.out.println(array1);
        array1.set(1,3);
        System.out.println(array1);
        array1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(array1);
        Collections.sort(array1);
        System.out.println(array1);
        array1.remove(0);
        System.out.println(array1);
        array1.removeAll(Arrays.asList(3, 4));
        System.out.println(array1);
        array1.remove(Integer.valueOf(2));//wrapper.delete number
        System.out.println(array1);
        array1.remove(Integer.parseInt("8"));//primitive.delete index
        System.out.println(array1);

    }
}



