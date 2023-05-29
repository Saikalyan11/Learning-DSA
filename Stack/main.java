package Stack;

public class main {
    public static void main(String[] args) {
        stack nums = new stack();

        nums.push(40);
        nums.push(30);
        nums.push(20);
        nums.push(10);
        nums.push(70);

        System.out.println(nums.peek());

        nums.show();
    }
}
