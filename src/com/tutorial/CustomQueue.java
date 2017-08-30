package com.tutorial;

import com.tutorial.interfacebank.IQueue;

public class CustomQueue<T> implements IQueue<T> {
    private static Integer default_size = 10;
    private Integer size;
    private Integer current_idx;
    private T[] queue;

    public CustomQueue(){
        this(default_size);
    }

    public CustomQueue(Integer size){
        this.size = size;
        current_idx = -1;
        queue = (T[]) new Object[size];
    }

    @Override
    public Integer enqueue(T input) {
        current_idx++;
        queue[current_idx] = input;
        return current_idx + 1;
    }

    @Override
    public T dequeue() {
        if (current_idx == 0) return null;

        T result = queue[0];
        for (int i = 0; i < current_idx; i++) {
            queue[i] = queue[i+1];
        }
        queue[current_idx] = null;
        current_idx--;
        return result;
    }

    @Override
    public Integer getSize() {
        return current_idx + 1;
    }

    @Override
    public Boolean isFull() {
        return size == current_idx + 1;
    }

    @Override
    public void printQueue() {
        System.out.print("Queue > ");
        for (int i = 0; i <= current_idx; i++) {
            System.out.print("idx[" + i + "]: " + queue[i] + " ");
        }
        System.out.println();
    }

}
