package Stack;

import java.util.Arrays;

public class stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        int data;
        data = stack[top - 1];
        return data;
    }

    @Override
    public String toString() {
        return "stack [stack=" + Arrays.toString(stack) + "]";
    }

    public int show() {
        for (int n : stack) {
            System.out.println(n + " ");
        }
        return top;
    }
}
