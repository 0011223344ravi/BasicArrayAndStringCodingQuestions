package org.example.basicarrayandstringcodingquestions.String;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrintAllDuplicatesFromString {
     public static List<Character>  printAllDuplicates(String str ){
         Map<Character, Integer>  hm  = new LinkedHashMap<>();
          List<Character> listOfDuplicates  = new ArrayList<>();
          for(int i =0; i< str.length() ; i++){
           if(hm.containsKey(str.charAt(i))){
               hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
           }

            else {
                hm.put(str.charAt(i) ,1);
           }
          }
           for(Map.Entry<Character,Integer>  entry  : hm.entrySet()){

               if(entry.getValue()>1){
                   listOfDuplicates.add(entry.getKey());
               }
           }
           return listOfDuplicates;
     }

    public static void main(String[] args) {
         String str  = "ancbdbdnjasaaac";
        List<Character> ch =  printAllDuplicates(str);
        System.out.println(ch);
    }

}
