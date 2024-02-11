package org.example.service.collections;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    UUID id;
    String name;
    String designation;
    int salary;

    public Employee(UUID id, String name, String designation, int salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Company {
    private Set<Employee> employees = new HashSet();

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public int getCompanySize() {
        return employees.size();
    }

    public List<Employee> getEmployeesBySalaryDesc(){
        //Implement this method

        List<Employee> sortedSalary =   employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)
                .reversed()).collect(Collectors.toList());
        return sortedSalary;
    }


    public List<Employee> getTop100EmployeesBySalary(int k){
        //Implement this method
        return null;
    }
}

public class TestEmployee{
    public static void main( String[] args){
        UUID u1 = UUID.fromString("076099ac-0a5b-4078-a3c3-2498da43342b");
        Company c = new Company();

        // how many records will be there 1 or 2
        //Implement method getEmployeesBySalaryDesc

        c.addEmployee(new Employee(u1, "name1", "SDE", 10000));
        c.addEmployee(new Employee(u1, "name1", "SDE", 10000));
        c.getEmployeesBySalaryDesc().forEach(s -> System.out.println(s.salary));

        System.out.println(c.getCompanySize());
    }
}



// Company class, you are using a HashSet to store employees.
// While you are adding two Employee objects with the same UUID,
// the HashSet considers them distinct because the hashCode() and equals() methods are not overridden in the Employee class.
// As a result, the set considers the two objects different based on their memory addresses.


