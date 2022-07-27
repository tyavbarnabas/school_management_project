package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher barnabas = new Teacher("barnabas",001,20000);
        Teacher lizzy = new Teacher("lizzy",002,3000);
        Teacher Vera = new Teacher("Vera",003,20000);
        Teacher patricia = new Teacher("Patricia",004,35000);

        Student kelvin = new Student(2,"kelvin",6,1000,50000);
        Student lisa = new Student(2,"lisa",4,20000,50000);
        Student katrina = new Student(3,"katrina",6,10000,5000);
        List<Student>StudentList = new ArrayList<>(Arrays.asList(kelvin,lisa,katrina));
        List<Teacher>teacherList = new ArrayList<>(Arrays.asList(lizzy,Vera,patricia,barnabas));

        School school = new School(teacherList,StudentList,0,0);
        Student student = new Student(01,"perry",4,1000,50000);
        student.updateFeesPaid(10000);
        student.balanceLeft();


    }
}