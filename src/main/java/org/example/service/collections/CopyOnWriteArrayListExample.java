package org.example.service.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteList = new CopyOnWriteArrayList<>();
        ArrayList<String> al = new ArrayList<String>();
        // Initial state: empty list

        // Thread 1: Add elements
        new Thread(() -> {
            copyOnWriteList.add("One");
            copyOnWriteList.add("Two");
            copyOnWriteList.add("Three");

            Iterator<String> iterator = copyOnWriteList.iterator();
            while (iterator.hasNext()) {
                copyOnWriteList.add("Four");
                System.out.println("Printing list by thread 1: " + iterator.next());
            }

        }).start();

        // Thread 2: Iterate over elements
        new Thread(() -> {
            Iterator<String> iterator = copyOnWriteList.iterator();
            while (iterator.hasNext()) {
                System.out.println("Printing list by thread 2: " + iterator.next());
            }
        }).start();
    }
}

