package org.example.basicarrayandstringcodingquestions.DesignPattern;

public class SingletonDemo {

     private  static SingletonDemo instance ;

    public SingletonDemo() {
        System.out.println(" singleton object is created");
    }

    public static SingletonDemo getInstance(){
          if(instance == null){
              instance  = new SingletonDemo();
          }
         return instance;
     }

    public static void main(String[] args) {
        SingletonDemo d1 = getInstance();
        SingletonDemo d2 = getInstance();

        System.out.println(d1.hashCode() == d2.hashCode());
    }

}
