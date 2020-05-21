package Java;
/*
        Map<Key,Value>......==>Map interface
        HashMap,LinkedHashMap,HashTable==>class
        class==>implement==>interface
        SortedMap(interface)
        TreeMap==>class
        TreeMap==>implement==>Sorted Map
        TreeMap and SortedMap ==>ascending order
         */

import java.util.*;

public class Day_9_Map {
    public static void main(String[] args) {

        Map<Object,Object> map=new LinkedHashMap<>();//Object is parent for all wrapperclasses datatype
        //both key and value ordered,there is get index
        //not duplicate key but value
        //accept null key and value
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        System.out.println(map);
        map.put("A",6);//not accept duplicate.if you add same key more than one it return us last one
        System.out.println(map);
        map.put("F",4);
        System.out.println(map);
        System.out.println( map.get("C"));//get key
        map.put(null,7);
        System.out.println(map);
        map.put(null,8);
        System.out.println(map);
        map.put("G",null);
        System.out.println(map);
        map.put("H",null);
        System.out.println(map);
        System.out.println(map.containsKey("K"));
        System.out.println(map.containsValue(8));

        System.out.println("=================");

        Map<String,Integer> map1=new HashMap<>();
        //not ordered,there is get index
        //not duplicate key but value
        //accept null key and value
        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);
        map1.put("D",4);
        map1.put("E",5);
        System.out.println(map1);
         map1.put("D",7);
        System.out.println(map1);
        map1.put("F",7);
        System.out.println(map1);
        map1.put(null,8);
        System.out.println(map1);
        map1.put("K",null);
        System.out.println(map1);
        System.out.println(map1.containsKey("K"));
        System.out.println(map1.containsValue(8));


       // Iterator it1=map1.iterator(); dosen't allow

        for(Map.Entry<String,Integer>name : map1.entrySet()){
            System.out.println("key is : "+name.getKey()+" value is :"+name.getValue());

        }
        System.out.println("======================");
        Map<String,Double>map3=new Hashtable<>();
          //Hashtable thread safe and synchorized so it is slow
        map3.put("A",1.1);
        map3.put("B",2.2);
        map3.put("C",3.3);
        map3.put("D",4.4);
        map3.put("E",5.5);
        System.out.println(map3);
        map3.put("D",7.7);
        System.out.println(map3);
        map3.put("F",8.8);
        System.out.println(map3);
        map3.put(null,9.9);//nullpointerException
        System.out.println(map3);
        map3.put("G",null);//nullpointerException
        System.out.println(map3);


    }
}
