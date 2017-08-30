package com.tutorial;
import com.tutorial.interfacebank.*;

public class CustomStack<T> implements IStack<T> {

    private static Integer default_size = 10;
    private Integer size;
    private Integer current_idx;
    private T[] stack;

    public CustomStack(){
        this(default_size);
    }

    public CustomStack(Integer size){
        this.size = size;
        current_idx = -1;
        stack = (T[]) new Object[size];
    }

    @Override
    public Integer push(T input) {
        if (isFull()) return -1;

        current_idx++;
        stack[current_idx] = input;
        return current_idx + 1;
    }

    @Override
    public T pop() {
        if (current_idx == -1) return null;

        T result = stack[current_idx];
        stack[current_idx] = null;
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
    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= current_idx; i++) {
            System.out.print("idx[" + i + "]: " + stack[i] + " ");
        }
        System.out.println();
    }
}
