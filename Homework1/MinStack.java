package Classwork;

public class MinStack extends Stack {
    private Stack minStack;

    public MinStack(int size) {
        super(size);
        this.minStack = new Stack(size);
    }

    @Override
    public boolean push(char x) {
        if (!super.push(x)) {
            return false;
        }

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        return true;
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            return '!';
        }
        char popped = super.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    public char getMin() {
        return minStack.peek();
    }
}