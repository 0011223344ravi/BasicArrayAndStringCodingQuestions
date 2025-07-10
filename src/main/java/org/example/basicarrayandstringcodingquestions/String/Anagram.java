package org.example.basicarrayandstringcodingquestions.String;

public class Anagram {
   public static boolean  anagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        else if(str1.length() == str2.length()){
             for(int i =0;  i< str1.length(); i++){
                 if(!str2.contains(String.valueOf(str1.charAt(i)))){
                     return false;
                 }
             }

        }
         return  true ;
     }

    public static void main(String[] args) {
          String str1  = "triangle";
          String str2  = "integral";
         boolean ans  = anagram(str1,str2);
        System.out.println(ans);
    }
}
