package OCJP8.chap3.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yevgeniya.zuyeva on 09.01.2017.
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(4));
        queue.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n peek: " + queue.peek());
        queue.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n poll: " + queue.poll());
        queue.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n poll: " + queue.poll());
        queue.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n peek: " + queue.peek()); //null

        System.out.println("------");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        stack.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n peek: " + stack.peek());
        stack.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n poll: " + stack.poll());
        stack.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n poll: " + stack.poll());
        stack.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n peek: " + stack.peek());
        stack.forEach((e) -> System.out.print(e + ", "));


        System.out.println("------");

        LinkedList<Integer> likedList = new LinkedList<>();
        likedList.push(10);
        likedList.push(4);
        likedList.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n peek: " + likedList.peek());
        likedList.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n poll: " + likedList.poll());
        likedList.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n poll: " + likedList.poll());
        likedList.forEach((e) -> System.out.print(e + ", "));

        System.out.println("\n peek: " + likedList.peek());
        likedList.forEach((e) -> System.out.print(e + ", "));


    }
}
