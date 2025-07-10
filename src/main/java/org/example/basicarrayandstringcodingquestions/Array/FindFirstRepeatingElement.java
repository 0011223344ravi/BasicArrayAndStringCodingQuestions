package org.example.basicarrayandstringcodingquestions.Array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatingElement {
     public static int findFirstRepeatingElement(int arr  []){
         Map<Integer, Integer>  hm  = new LinkedHashMap<>();
         int ans  =0;
           for(int i =0; i< arr.length ; i++){
                  if(hm.containsKey(arr[i])){
                     hm.put(arr[i], hm.get(arr[i])+1);
                  }
                   else {
                        hm.put(arr[i], 1);
                  }


           }
         for(Map.Entry<Integer,Integer>  entry : hm.entrySet()){
             if(entry.getValue()>1){
                 ans  =entry.getKey();
                 break;
             }
         }
         return  ans  ;
     }

    public static void main(String[] args) {
           int arr []  = {1,2,3,4,5,5,2,4,3};
            int ans  =findFirstRepeatingElement(arr);
        System.out.println(ans);
     }

}
