package dataStructures.stack;

import java.util.EmptyStackException;

public class Stack {
    private int[] arr;
    private int top = -1;

    public Stack(int size) {
        this.arr = new int[size];
    }

    public void push(int n){
        if(top == arr.length){
            throw new StackOverflowError("Stack overflow");
        }
        arr[++top] = n;
    }

    public int pop(){
        if(top == -1){
            throw new EmptyStackException();
        }
        //also need to delete that element
        int x = arr[top];
        arr[top--] = 0;
        return x;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Creating a stack of size 5

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);

        // Peeking the top element

        // Popping elements from the stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.pop(); // Trying to pop from an empty stack

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

