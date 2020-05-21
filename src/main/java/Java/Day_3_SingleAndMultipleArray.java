package Java;

import java.util.Arrays;

public class Day_3_SingleAndMultipleArray {
    public static void main(String[] args) {
        //ARRAY
        //Array size is fixed,array accept both primitive and wrapper,array multiple


        //Single Array
        int[]arr={6,7,9,2,1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int each:arr){
            System.out.println(each);//enhanced loop
        }


        //Multiple Array
        int[][]arr1={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][2]);
        System.out.println(arr1[1][2]);

        for(int[] each:arr1){
            for(int each1:each){
                System.out.println(each1);
            }

        }

        //                   0              1
//                        0       1      0     1
        //                  0  1           0  1
        int[][][]arr2={{{1,2},{3,4}},{{5,6},{7,8}}};
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(arr2.length);
        System.out.println(Arrays.deepToString(arr2[0]));
        System.out.println(Arrays.deepToString(arr2[1]));
        System.out.println(Arrays.toString(arr2[0][0]));
        System.out.println(Arrays.toString(arr2[0][1]));
        System.out.println(Arrays.toString(arr2[1][0]));
        System.out.println(Arrays.toString(arr2[1][1]));
        System.out.println(arr2[0][0][0]);
        System.out.println(arr2[1][0][1]);

        for( int[][]each:arr2){
            for( int []each1:each){
                for(int each2:each1){
                    System.out.println(each2);
                }
            }
        }

    }
}
