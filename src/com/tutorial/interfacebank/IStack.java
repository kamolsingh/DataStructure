package com.tutorial.interfacebank;

public interface IStack<T> {
    public Integer push(T input);
    public T pop();
    public Integer getSize();
    public Boolean isFull();
    public void printStack();
}
