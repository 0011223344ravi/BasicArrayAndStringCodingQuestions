package org.example.basicarrayandstringcodingquestions.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeJava8 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "HR", 50000, 30),
                new Employee(2, "Jane", "IT", 70000, 28),
                new Employee(3, "Tom", "IT", 80000, 32),
                new Employee(4, "Alice", "Finance", 90000, 45),
                new Employee(5, "Bob", "HR", 60000, 26),
                new Employee(6, "Eve", "IT", 85000, 25),
                new Employee(7, "Charlie", "Finance", 75000, 38)
        );

        // 1. Get names of all employees in "IT" department sorted by salary

        List<Employee> it = employees.stream().filter(e -> e.getDepartment().equals("IT"))
                .sorted(Comparator.comparing(Employee::getSalary , Comparator.reverseOrder())).collect(Collectors.toList());

      //  System.out.println(it);

      //  2. Find employee with highest salary

        List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .limit(1)
                .collect(Collectors.toList());
      //  System.out.println(collect);

        //🔹 3. Group employees by department

        Map<String, List<Employee>> collect1 = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment()));

       // System.out.println(collect1);

        //🔹 4. Count employees per department

        Map<String, Long> collect2 = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
       // System.out.println(collect2);

        //🔹 5. Find average salary by department
        Map<String, Double> collect3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
       // System.out.println(collect3);

        //🔹 6. Find the oldest employee in each department

        Map<String, Optional<Employee>> collect4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getAge))));


       // System.out.println(collect4);
        //🔹 7. List employee names per department (flat format)

        Map<String, List<String>> collect5 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        //System.out.println(collect5);

        Map<Boolean, List<Employee>> collect6 = employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() >= 75000));
       // System.out.println(collect6);

        //🔹 9. Increase salary of all "HR" employees by 10%
        List<Employee> collect7 = employees.stream().map(e -> {
            if (e.getDepartment().equals("HR")) {
                new Employee(e.getId(), e.getName(), e.getDepartment(), e.getSalary() * 1.1, e.getAge());
            }
            return e;
        }).collect(Collectors.toList());
     //   System.out.println(collect7);

        List<Employee> collect8 = employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(collect8);
    }
}
