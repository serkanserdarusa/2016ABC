package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day_9_Lambda {
    public static void main(String[] args) {
        //after available java 8
        //it used just with interface
        //it provides less coding
        Integer[]arr={1,2,3,4,5,6,7};
        List<Integer> nums=new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums);

//        for(Integer each:nums){
//            if(each>4){
//                System.out.println(each);
//            }
//        }

        nums.removeIf(s->s>=5);
        System.out.println(nums);


          List<String>info=new ArrayList<>();
          info.addAll(Arrays.asList("Ali","Veli","Ayse","Fatma","Serdar"));
        System.out.println(info);

//        for(int i=0;i<info.size();i++){
//
//            if(info.get(i)=="Ali"){
//                info.remove(i);
//            }
//            System.out.println(info);
//        }
         info.removeIf(k->k=="Ali");
         System.out.println(info);
         info.removeIf(c->c.contains("Serdar"));
         System.out.println(info);
         info.removeIf((d->d.endsWith("ma")));
         System.out.println(info);
         info.removeIf((g->g.equals("Veli")));
         System.out.println(info);
        info.removeIf((g->g.startsWith("A")));
        System.out.println(info);

    }
}
