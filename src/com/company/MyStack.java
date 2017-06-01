package com.company;

/**
 * Created by mathu on 2017-02-15.
 * Class myStack consist of various functions used to manipulate a stack.
 * A stacks is similar to a link list in that it consists of objects that
 * are linked to each other using pointers. In a stack the head or front
 * if the stack can be added,removed or looked at.
 */
public class MyStack {
    Student_info head;                      //Head is the object on the top of the stack
    int numInList = 0;

    boolean stackIsEmpty(){                 //this functions checks if your stack is empty
        if (numInList < 1){
            return true;                    //returns true if the stack is empty
        }else return false;
    }



    void push (Student_info itemToAdd){     //This function adds an object to the top of the stack
        numInList ++;
        itemToAdd.setNext(this.head);
       this.head = itemToAdd;
    }

    void pop(){                             //This function prints the head and removes it
        if (stackIsEmpty()) {
            System.out.println("your stack is empty");
        }
        else{
            numInList = numInList - 1;
            head.printItem();
            head = head.getNext();
        }
    }
    void peek(){
        if (!stackIsEmpty())head.printItem();
    }   // This functions prints what the head of the stack


    void removeitem(int item){                              //not a standard functionality of a stack.
        Student_info currentlist = head;                    //Allows one to remove an item from anywhere on the stack.
        Student_info to_remove;
        if (item < numInList && item > 1){
            for(int x=0 ; x < item-2; x++){
                currentlist = currentlist.getNext();
            }
            to_remove = currentlist.getNext();
            currentlist.setNext(to_remove.getNext());
            to_remove.setNext(null);
            numInList = numInList -1;
        }else{
            System.out.println("cannot delete");
        }
    }


    void displayStack(){                                    //displays all the objects in the stack
        Student_info currentlist = head;
        while (currentlist != null){
            currentlist.printItem();
            currentlist = currentlist.getNext();
        }


    }


}
