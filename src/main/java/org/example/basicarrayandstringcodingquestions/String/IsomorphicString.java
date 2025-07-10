package org.example.basicarrayandstringcodingquestions.String;

import java.util.Map;
import java.util.TreeMap;

public class IsomorphicString {


         public static  boolean isIsomporphic(String str1  , String str2 ){

             Map<Character, Integer>   hm1  = new TreeMap<>();
             Map<Character, Integer>   hm2  = new TreeMap<>();
              for(int i =0; i< str1.length(); i++){
                  if(hm1.containsKey(str1.charAt(i))){
                      hm1.put(str1.charAt(i), hm1.get(str1.charAt(i))+1);
                  }
                   else{
                       hm1.put(str1.charAt(i),1);
                  }
              }

             for(int i =0; i< str2.length(); i++){
                 if(hm2.containsKey(str2.charAt(i))){
                     hm2.put(str2.charAt(i), hm2.get(str2.charAt(i))+1);
                 }
                 else{
                     hm2.put(str2.charAt(i),1);
                 }
             }
             System.out.println("hm1 "+hm1 +"hm2 "+ hm2);
              if(hm1.size() != hm2.size())
                  return  false;
               for(Map.Entry<Character,Integer>  entry : hm1.entrySet()){

                    if(hm1.values() !=hm2.values()){
                        return false;
                    }
               }
                return true;
         }

    public static void main(String[] args) {
        String str1  = "add";
        String str2 = "gge";
       boolean ans  =  isIsomporphic(str1,str2);
        System.out.println(ans);
    }
}
