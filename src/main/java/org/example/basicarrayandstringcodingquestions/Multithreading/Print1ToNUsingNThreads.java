package org.example.basicarrayandstringcodingquestions.Multithreading;

public class Print1ToNUsingNThreads {


    public static  void  print(){
        for(int  i  =0; i< 10; i++){
            int finalI = i;
            Thread t = new Thread(()->{

                System.out.println(" Thread with name :-  "+ Thread.currentThread().getName() +"printed "+ finalI);
            });
            t.start();
        }
    }

    public static void main(String[] args) {
        print();
    }
}
