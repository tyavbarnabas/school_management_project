package org.example;

public class Teacher {
    private String name;
    private int staffId;
    private  int salary;

    public Teacher(String name, int staffId, int salary) {
        this.name = name;
        this.staffId = staffId;
        this.salary = salary;
    }






    public String getName() {
        return name;
    }

    public int getStaffId() {
        return staffId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
