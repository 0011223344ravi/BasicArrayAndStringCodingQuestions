package org.example.basicarrayandstringcodingquestions.Array;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfEachElement {

     public static Map<Integer, Integer> frequency(int arr []){
           Map<Integer, Integer>  hm  = new HashMap<>();
          for (int i  =0; i< arr.length ; i++){
              if(!hm.containsKey(arr[i])) {
                  hm.put(arr[i],1);
              }
               else{
                   hm.put(arr[i], hm.get(arr[i])+1);
              }
          }
           return hm;
     }

    public static void main(String[] args) {
        int arr  []  = {1,2,3,1,1,2,4,3,5,6,4};
       Map<Integer,Integer>  hm  = frequency(arr);
        System.out.println(hm);
         for(Map.Entry<Integer,Integer> entry :hm.entrySet()){
              if(entry.getValue() ==1){
                  System.out.println(entry.getKey());
              }
             System.out.println("keys "+entry.getKey() + " values " +entry.getValue());

         }
     }
}
