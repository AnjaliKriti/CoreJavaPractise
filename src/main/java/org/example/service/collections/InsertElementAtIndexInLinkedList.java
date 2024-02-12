package org.example.service.collections;

import java.util.LinkedList;

// insert an element at particular index
public class InsertElementAtIndexInLinkedList {

    public static void main(String[] args){
        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(1);
        newList.add(5);
        newList.add(7);
        newList.add(9);

        System.out.println("InitialList " + newList);


        newList.add(1,3);
        System.out.println("UpdatedList " +newList);


    }
}
