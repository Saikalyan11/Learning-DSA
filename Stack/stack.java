package Stack;

import java.util.Arrays;

public class stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    @Override
    public String toString() {
        return "stack [stack=" + Arrays.toString(stack) + "]";
    }

}
