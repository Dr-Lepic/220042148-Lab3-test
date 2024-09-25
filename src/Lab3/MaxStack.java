package Lab3;

import java.util.Stack;

public class MaxStack {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;
    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty() || x > maxStack.peek()) {
            maxStack.push(x);
        }
    }

}
