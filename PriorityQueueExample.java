
import java.util.PriorityQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeheni
 */
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        // Add elements to the queue
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(40);
        
        System.out.println("Initial PriorityQueue: " + priorityQueue);
        
        // Peek at the head of the queue (without removing)
        System.out.println("Head of the queue: " + priorityQueue.peek());
        
        // Remove elements from the queue (in priority order)
        System.out.println("\nRemoving elements:");
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removed: " + priorityQueue.poll());
        }
        
        // PriorityQueue with custom comparator (descending order)
        PriorityQueue<Integer> descendingQueue = new PriorityQueue<>((a, b) -> b - a);
        descendingQueue.add(30);
        descendingQueue.add(10);
        descendingQueue.add(50);
        
        System.out.println("\nDescending order PriorityQueue:");
        while (!descendingQueue.isEmpty()) {
            System.out.println("Removed: " + descendingQueue.poll());
        }
    }
}
