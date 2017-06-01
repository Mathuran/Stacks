package com.company;


public class Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack();                  // instantiates the class MyStack
/***
 * adds student info to stacks using stack.push
 * use pop to remove from head
 * use peek to look at the head
 * use delete item to delete a specific student
 *
 */

        Student_info someStudent = new Student_info();
        someStudent.setFirstName("Abilarsh");
        someStudent.setLastName("Viji");
        someStudent.setStudentNum(521823);
        stack.push(someStudent);

        someStudent = new Student_info();
        someStudent.setFirstName("Mabilarsh");
        someStudent.setLastName("Sada");
        someStudent.setStudentNum(786542);
        stack.push(someStudent);


        someStudent = new Student_info();
        someStudent.setFirstName("A");
        someStudent.setLastName("B");
        someStudent.setStudentNum(111111);
        stack.push(someStudent);

        someStudent = new Student_info();
        someStudent.setFirstName("C");
        someStudent.setLastName("D");
        someStudent.setStudentNum(222222);
        stack.push(someStudent);

        someStudent = new Student_info();
        someStudent.setFirstName("Egg");
        someStudent.setLastName("White");
        someStudent.setStudentNum(333333);
        stack.push(someStudent);

        someStudent = new Student_info();
        someStudent.setFirstName("Potato");
        someStudent.setLastName("Head");
        someStudent.setStudentNum(444444);
        stack.push(someStudent);

        someStudent = new Student_info();
        someStudent.setFirstName("Lemon");
        someStudent.setLastName("Fresh");
        someStudent.setStudentNum(555555);
        stack.push(someStudent);

        stack.pop();
        stack.peek();

        stack.removeitem(1);
        stack.displayStack();
    }
}
