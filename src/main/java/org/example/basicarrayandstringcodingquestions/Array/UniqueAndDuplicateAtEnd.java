package org.example.basicarrayandstringcodingquestions.Array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UniqueAndDuplicateAtEnd {

    public static int [] sortUnique(int arr []){
    int ans  [] = new int [arr.length];
        Map<Integer, Integer> hm = new ConcurrentHashMap<>();

        for(int i  =0; i< arr.length; i++){
             if(hm.containsKey(arr[i])){
                 hm.put(arr[i], hm.get(arr[i])+1);

             } else{
                 hm.put(arr[i], 1);
             }
        }
         int j  =0;
         for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
             if(entry.getValue() ==1){
                 ans[j]  = entry.getKey();
                 j++;
             }
         }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){

            if(entry.getValue() >1){

                for(int i  =0; i< entry.getValue(); i++){
                    ans[j]  = entry.getKey();
                    j++;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr  [] = {1,2,3,4,2,3,6,7,8,1};
      int ans  []  = sortUnique(arr);
        for(Integer i : ans){
            System.out.println(i);
        }
    }
}
