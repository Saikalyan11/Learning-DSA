package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<String> que = new LinkedList<String>();

        que.offer("hi");
        que.offer("bye");
        que.offer("tata");
        que.offer("hello");
        que.add("kdjhfksjdgh");

        que.poll();
        que.poll();
        que.poll();

        que.peek();

        System.out.println(que.isEmpty());

        System.out.println(que.contains("hello"));

        System.out.println(que);
    }
}
