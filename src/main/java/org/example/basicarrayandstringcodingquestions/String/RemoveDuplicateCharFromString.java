package org.example.basicarrayandstringcodingquestions.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString
{
     public static String removeDuplicateCharacter(String str ){
         Set<Character>  hs = new LinkedHashSet<>();
          for(int i  =0; i<     str.length() ; i++){
              hs.add(str.charAt(i));
          }

           StringBuffer sb = new StringBuffer();
          for(Character ch  : hs){
              sb.append(ch);
          }
           return sb.toString();
     }

    public static void main(String[] args) {
         String str  = "programming";
       String ans  =   removeDuplicateCharacter(str);
        System.out.println(ans);
    }
}
