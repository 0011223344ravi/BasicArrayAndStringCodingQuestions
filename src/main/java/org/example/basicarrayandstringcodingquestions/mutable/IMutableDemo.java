package org.example.basicarrayandstringcodingquestions.mutable;

import java.util.ArrayList;
import java.util.List;

public final class IMutableDemo {

    // 6 rules
    //make class final
    // make all fields private and final
    //no setters
    // only getters
    //initialize all in constructor
    //return cloned copy for mutable fields


   private final String field1;
   private final  String getField2;
   private final List<Integer> al ;

    public IMutableDemo(String field1, String getField2, List<Integer> al) {
        this.field1 = field1;
        this.getField2 = getField2;
        this.al = al;
    }

    public List<Integer> getAl() {
        return new ArrayList<>();
    }

    public String getField1() {
        return field1;
    }

    public String getGetField2() {

        return getField2;
    }

    @Override
    public String toString() {
        return "IMutableDemo{" +
                "field1='" + field1 + '\'' +
                ", getField2='" + getField2 + '\'' +
                ", al=" + al +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> al  = new ArrayList<>();
        al.add(1);
        al.add(2);
        IMutableDemo im  = new IMutableDemo("abc","xyz", al);
        im.getAl().add(3);
        System.out.println(im);
    }
}

