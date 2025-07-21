package org.example.basicarrayandstringcodingquestions.Multithreading;

import org.example.basicarrayandstringcodingquestions.String.PrintAllDuplicatesFromString;

public class PrintEvenAndOddUsing2Threads   implements  Runnable{
     public Object object;
     private static int count =1;

    public PrintEvenAndOddUsing2Threads(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

          while(count<=10){
            synchronized (object){
                if(count %2==0 && Thread.currentThread().getName().equals("even")){
                    System.out.println("The number printed by even thread + "+ Thread.currentThread().getName()+ " is :- " + count );
                  count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                  if(count%2!=0 && Thread.currentThread().getName().equals("odd")){
                    System.out.println("The number printed by odd thread + "+ Thread.currentThread().getName()+ " is :- " + count );
                     count++;
                    object.notify();
                }
            }


          }

    }

    public static void main(String[] args) {
        Object obj  = new Object();
        Thread t1  = new Thread(new PrintEvenAndOddUsing2Threads(obj), "even");
        Thread t2  = new Thread(new PrintEvenAndOddUsing2Threads(obj),"odd");
        t1.start();
        t2.start();
    }
}
