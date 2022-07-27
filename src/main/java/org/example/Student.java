package org.example;

public class Student {
    private int id;
    private String name;
    private int studentClass;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int studentClass, int feesPaid, int feesTotal) {
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
        this.feesPaid = 0;
        this.feesTotal = 50000;
    }

    // takes an integer called fees an and added to the fees paid
    public void updateFeesPaid(int fees){
        this.feesPaid += fees;

        System.out.println(name + " ,feesPaid :" + "N"+this.feesPaid );
    }
    public void balanceLeft(){
       feesTotal -= feesPaid;
        System.out.println(name + " your have a balance of " + "N"+feesTotal + " to pay");
    }


    //getters are used to get a field from a class
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    //use to update the student grade
    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }
}
