package Stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<String> nums = new Stack<String>();

        // nums.push(40);
        // nums.push(30);
        // nums.push(20);
        // nums.push(10);
        // nums.push(70);

        System.out.println(nums.peek());
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
