package com.tutorial.interfacebank;

public interface ILinkedList<T1, T2> {
    public Integer addToTail(T1 input);
    public Integer addToHead(T1 input);
    public Integer addAfter(T1 input,T2 position);
    public T1 findNode(T2 value);
    public Boolean deleteNode(T1 input);
    public Boolean deleteTail();
    public Boolean deleteHead();
    public Integer getSize();
    public Boolean isFull();
}
