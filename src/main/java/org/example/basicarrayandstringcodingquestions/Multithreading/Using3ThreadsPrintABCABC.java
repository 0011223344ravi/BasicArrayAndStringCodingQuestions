package org.example.basicarrayandstringcodingquestions.Multithreading;

import lombok.Synchronized;

public class Using3ThreadsPrintABCABC  implements Runnable {

     private  static Object object;

    public Using3ThreadsPrintABCABC(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
            while(true){
                synchronized (object){
                     if(Thread.currentThread().getName().equals("A")){
                         System.out.println("A");
                         try {
                           object.  wait();
                         } catch (InterruptedException e) {
                             throw new RuntimeException(e);
                         }
                     }
                     if(Thread.currentThread().getName().equals("B")){
                         System.out.println("B");
                         notifyAll();
                     }
                    if(Thread.currentThread().getName().equals("C")){
                        System.out.println("C");
                        notifyAll();
                    }
                }

            }
    }

    public static void main(String[] args) {
        Object obj  = new Object();
        Thread t1  = new Thread(new Using3ThreadsPrintABCABC(obj),"A");
        Thread t2  = new Thread(new Using3ThreadsPrintABCABC(obj),"B");
        Thread t3  = new Thread(new Using3ThreadsPrintABCABC(obj),"C");
         t1.start();
         t2.start();
         t3.start();
    }
}
