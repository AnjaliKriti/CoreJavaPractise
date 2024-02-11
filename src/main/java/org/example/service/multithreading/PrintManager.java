package org.example.service.multithreading;

import java.util.PriorityQueue;

class PrintJob implements Comparable<PrintJob> {
    private String document;
    private String priority;

    public PrintJob(String document, String priority) {
        this.document = document;
        this.priority = priority;
    }

    public String getDocument() {
        return document;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public int compareTo(PrintJob other) {
        // Custom comparison logic based on priority
        if (this.priority.equals("High")) {
            return -1; // Higher priority
        } else if (this.priority.equals("Low") && other.priority.equals("Normal")) {
            return -1; // Higher priority
        } else {
            return 1; // Lower priority
        }
    }
}

class PrintQueue {
    private PriorityQueue<PrintJob> queue = new PriorityQueue<>();

    public synchronized void addPrintJob(PrintJob job) {
        queue.add(job);
        notify(); // Notify any waiting threads that a new job is added
    }

    public synchronized PrintJob getNextPrintJob() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Wait if there are no jobs in the queue
        }
        return queue.poll();
    }
}

class PrinterThread extends Thread {
    private PrintQueue printQueue;

    public PrinterThread(String name, PrintQueue printQueue) {
        super(name);
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                PrintJob job = printQueue.getNextPrintJob();
                System.out.println("Printer " + getName() + " printing document: " + job.getDocument() +
                        " with priority: " + job.getPriority());
                sleep(1000); // Simulate printing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PrintManager {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();

        PrinterThread managerPrinter = new PrinterThread("Manager Printer", printQueue);
        PrinterThread hrPrinter = new PrinterThread("HR Printer", printQueue);
        PrinterThread normalPrinter = new PrinterThread("Normal Printer", printQueue);

        managerPrinter.setPriority(Thread.MAX_PRIORITY);
        hrPrinter.setPriority(Thread.NORM_PRIORITY);
        normalPrinter.setPriority(Thread.MIN_PRIORITY);

        managerPrinter.start();
        hrPrinter.start();
        normalPrinter.start();

        // Adding print jobs with different priorities
        printQueue.addPrintJob(new PrintJob("Document1", "High"));
        printQueue.addPrintJob(new PrintJob("Document2", "Normal"));
        printQueue.addPrintJob(new PrintJob("Document3", "Low"));
        printQueue.addPrintJob(new PrintJob("Document4", "High"));
        printQueue.addPrintJob(new PrintJob("Document5", "Normal"));
        printQueue.addPrintJob(new PrintJob("Document6", "Low"));
    }
}
