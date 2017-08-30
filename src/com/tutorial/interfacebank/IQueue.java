package com.tutorial.interfacebank;

public interface IQueue<T> {
    public Integer enqueue(T input);
    public T dequeue();
    public Integer getSize();
    public Boolean isFull();
    public void printQueue();
}
