package com.tutorial;

import com.tutorial.interfacebank.ILinkedList;

public class CustomLinkedList<T1, T2> implements ILinkedList<T1, T2>
{
    //Two way links
    class Node<T1> {
        T1 element;
        Node previous;
        Node next;

        Node(T1 value){
            previous = null;
            next = null;
            element = value;
        }

        Node getNext() {
            return next;
        }
        Node getPrevious(){
            return previous;
        }
        T1 getElement(){
            return element;
        }
    }

    private Node[] linkedlist;
    private Integer size;
    private Node head;
    private Node tail;



    @Override
    public Integer addToTail(T1 input) {
        return size;
    }

    @Override
    public Integer addToHead(T1 input) {
        return size;
    }

    @Override
    public Integer addAfter(T1 input, T2 position) {
        return size;
    }

    @Override
    public T1 findNode(T2 input) {
        return null;
    }

    @Override
    public Boolean deleteNode(T1 input) {
        return null;
    }

    @Override
    public Boolean deleteHead() {
        if (head != null && head.getNext() != null){
            head.getNext().previous = null;
            head = head.getNext();
            size--;
            return true;
        } else if( head != null){
            head = null;
            size--;
            return true;
        } else {
            return false;
        }

        // check if tail relates to head
    }

    @Override
    public Boolean deleteTail() {
        return null;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public Boolean isFull() {
        return null;
    }
}
