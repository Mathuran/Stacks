package com.company;

/**
 * Created by mathu on 2017-02-15.
 * This class stores the object student and its information.
 * The set functions can be used to define an aspect of the student.
 * the get function returns the aspect of the object
 */
public class Student_info {
    private int studentNum;             //stores the student school number id
    private String firstName;           //stores the first name of student
    private String lastName;            //stores the last name of student
    private Student_info Next = null;   // set the reference of a student to null


    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student_info getNext() {
        return this.Next;
    }

    public void setNext(Student_info next) {
        this.Next = next;
    }

    public void printItem(){                                    //prints the first and last name of the student
        System.out.println(firstName+" "+lastName);
    }

}

