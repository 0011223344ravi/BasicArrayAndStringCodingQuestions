package org.example.basicarrayandstringcodingquestions.Java8;

import org.apache.el.lang.FunctionMapperImpl;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import org.example.basicarrayandstringcodingquestions.Java8.Employee;

public class Java8 {
    private static Object Employee;

    public static void main(String[] args) {
         //second highest
    List<Integer> al   = List.of(5, 9, 11, 2, 8, 21, 1);
        Optional<Integer> first = al.stream().sorted(Comparator.comparing(Integer::intValue, Comparator.reverseOrder()))
                .skip(1).findFirst();
        Integer i = al.stream().filter(e -> e % 2 == 0).reduce((a, b) -> a + b).get();
        System.out.println("sum is "+i);
        //  System.out.println(first.get());

         // First non repeated

         String input  = "stress";
        Character c1 = input.chars().mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst().orElse(null);
        //System.out.println(c1);


        //Get max length string
         String [] str  = {"apple", "bat", "ball", "at", "zebra"};
        Optional<String> max = Arrays.stream(str).max(Comparator.comparing(String::length));
       // System.out.println(max);

         //Group by length of string

        Map<Integer, List<String>> collect = Arrays.stream(str).collect(Collectors.groupingBy(String::length));

       // System.out.println(collect);

        Map<Character, Long> collect1 = input.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(collect1);

 //Partitions by even and odd
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collect2 = list.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
      //  System.out.println(collect2);


        //Add Prefix and Sufix

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        String collect3 = fruits.stream().collect(Collectors.joining(" ", "[", "]"));

      //  System.out.println(collect3);

        //max salary  of employee


        List<Employee> employees = Arrays.asList(
                new Employee("John", 40000),
                new Employee("Jane", 50000),
                new Employee("Tom", 60000)
        );

        double maxSalary = employees.stream()
                .mapToDouble(org.example.basicarrayandstringcodingquestions.Java8.Employee::getSalary)
                .max()
                .orElse(0);

    //    System.out.println("Max Salary: " + maxSalary);



    }


}
