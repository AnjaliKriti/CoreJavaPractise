package org.example.service.multithreading;

import java.time.Instant;

public class ThreadLockTest {

    public static void main(String[] args) {
        ClassWithSyncMethods c1 = new ClassWithSyncMethods();
        ClassWithSyncMethods c2 = new ClassWithSyncMethods();
        ClassWithSyncMethods c3 = new ClassWithSyncMethods();
        ClassWithSyncMethods c4 = new ClassWithSyncMethods();

        Thread t1 = new Thread( () -> {
            try {
                c1.m1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread( () -> {
            try {
                c3.m2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3 = new Thread( () -> {
            try {
                c1.m3();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t4 = new Thread( () -> {
            try {
                c2.m4();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // m1 & m2 are static synchronized method and lock the class itself,
        // so only one thread can be executed (any of static method )at a time
        //m3 & m4 are non-static so  lock is acquired on the instance of the class (instance t1 , t2).
        // Different instances of the class can execute these methods simultaneously.

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class ClassWithSyncMethods {
    public static synchronized void m1() throws InterruptedException {
        System.out.println("m1: " + Instant.now());
        Thread.currentThread().sleep(10000);
    }

    public static synchronized void m2() throws InterruptedException {
        System.out.println("m2: " + Instant.now());
        Thread.currentThread().sleep(10000);
    }

    public synchronized void m3() throws InterruptedException {
        System.out.println("m3: " + Instant.now());
        Thread.currentThread().sleep(10000);
    }

    public synchronized void m4() throws InterruptedException {
        System.out.println("m4: " + Instant.now());
        Thread.currentThread().sleep(10000);
    }
}
