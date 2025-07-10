package org.example.basicarrayandstringcodingquestions.Java8;

class Employee {

        int id;
        String name;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String department;
        double salary;
        int age;

        public Employee(int id, String name, String department, double salary, int age) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.age = age;
        }

        // Getters
        public int getId() { return id; }
        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
        public int getAge() { return age; }

        @Override
        public String toString() {
            return name + " - " + department + " - " + salary;
        }

}
