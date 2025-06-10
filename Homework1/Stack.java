package Classwork;

public class Stack {
    int top;
    int size;
    char[] stack;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new char[size];
    }

    public boolean push(char x) {
        if (!isFull()) {
            stack[++top] = x;
            return true;
        }
        return false;
    }

    public char pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return '!';
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public char peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return '!';
    }
}