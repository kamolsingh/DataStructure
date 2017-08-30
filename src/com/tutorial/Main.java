package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // Stack - testing code
	    CustomStack<Integer> stackA = new CustomStack<>(10);
	    // push 10 to 50
        stackA.push(10); stackA.printStack();
        stackA.push(20); stackA.printStack();
        stackA.push(30); stackA.printStack();
        stackA.push(40); stackA.printStack();
        stackA.push(50); stackA.printStack();


        // pop stack 2 times
        stackA.pop(); stackA.printStack();
        stackA.pop(); stackA.printStack();


        // pop another time and push one more
        stackA.pop(); stackA.printStack();
        stackA.push(60); stackA.printStack();


        System.out.println("");
        // Queue - testing code
        CustomQueue<String> queueA = new CustomQueue<>(15);
        // enqueue 6 elements
        queueA.enqueue("Arizona");
        queueA.printQueue();
        queueA.enqueue("California");
        queueA.printQueue();
        queueA.enqueue("New York");
        queueA.printQueue();
        queueA.enqueue("Washington");
        queueA.printQueue();
        queueA.enqueue("Michigan");
        queueA.printQueue();
        queueA.enqueue("Texas");
        queueA.printQueue();

        // dequeue two times
        queueA.dequeue();
        queueA.printQueue();
        queueA.dequeue();
        queueA.printQueue();

        // enqueue another two elements and dequeue one time
        queueA.enqueue("Florida");
        queueA.printQueue();
        queueA.enqueue("Oregon");
        queueA.printQueue();
        queueA.dequeue();
        queueA.printQueue();

    }
}
