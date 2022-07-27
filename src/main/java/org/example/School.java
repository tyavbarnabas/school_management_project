package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int TotalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students, int totalMoneyEarned, int totalMoneySpent) {
        this.teachers = teachers;
        this.students = students;
        this.TotalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }


    //this will add a teacher to the school
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
        System.out.println(teacher);
    }

    //this will add a student to the school
    public void addStudent(Student student){
        students.add(student);
    }

    public void updateTheTotalMoneyEarned(int moneyEarned){
        TotalMoneyEarned += moneyEarned;
        System.out.println("total money Earned:" + TotalMoneyEarned);
    }

    public void updateTotalMoneySpent(int moneySpent){
        totalMoneySpent = totalMoneySpent -  moneySpent;
    }


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }


    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}
