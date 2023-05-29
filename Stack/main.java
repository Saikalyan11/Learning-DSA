package Stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<String> nums = new Stack<String>();

        nums.push("I'm fine");
        nums.push("how are you");
        nums.push("there");
        nums.push("hi");

        System.out.println("peinting all " + nums);

        System.out.println("removing " + nums.pop());
        System.out.println("removing " + nums.pop());

        System.out.println("looking all" + nums.peek());

    }
}
