package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WorkingWithQueue {

    //A Queue is a collection designed for holding elements before processing.
    // It is typically used to implement FIFO (First In, First Out) order,
    // meaning elements are processed in the same order in which they were added.

    /*      | Class                   | Description                                                                |
            | ----------------------- | -------------------------------------------------------------------------- |
            | `LinkedList`            | A doubly-linked list that implements `Queue`                               |
            | `PriorityQueue`         | A queue where elements are ordered by priority (not necessarily FIFO)      |
            | `ArrayDeque`            | A resizable array implementation of the `Deque` interface, used as a queue |
            | `ConcurrentLinkedQueue` | A thread-safe, non-blocking queue                                          |
     */

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        //ordered queue by value or specific case.
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // 1, 3, 5 (smallest to largest)
        }


        //concurrentLinkedQueue the non blocking queue

        ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        // Adding elements to the queue
        concurrentLinkedQueue.offer("Task 1");
        concurrentLinkedQueue.offer("Task 2");
        concurrentLinkedQueue.offer("Task 3");

        // Polling elements from the queue (thread-safe)
        System.out.println("Polling elements:");
        System.out.println(concurrentLinkedQueue.poll()); // Task 1
        System.out.println(concurrentLinkedQueue.poll()); // Task 2

        // Viewing the front element without removing it (thread-safe)
        System.out.println("Peek front: " + concurrentLinkedQueue.peek()); // Task 3

        // Size of the queue
        System.out.println("Queue size: " + concurrentLinkedQueue.size()); // 1
    }
}
