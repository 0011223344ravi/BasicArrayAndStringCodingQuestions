package org.example.basicarrayandstringcodingquestions.Multithreading;

public class PrintHelloEvery2Sec {
     public static  void printHello(){
         Thread t  = new Thread(()->{
             System.out.println("Hello");
         });
         t.start();
         try {
             t.sleep(2000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }

    public static void main(String[] args) {
        while(true){
            printHello();
        }
    }
}
