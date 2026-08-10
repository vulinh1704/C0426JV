package queue_collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        Queue<String> myQueue = new LinkedList<>();
//        myQueue.offer("Ning");
//        myQueue.offer("Lân");
//        myQueue.offer("Đat");
//        myQueue.offer("Hưng");

//        System.out.println(myQueue.peek()); // Lấy ra phần tử đầu tiên được thêm nhưng không xóa
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.poll()); // Ning
//        System.out.println(myQueue.poll()); // Lân
//        System.out.println(myQueue.poll()); // Đạt
//        System.out.println(myQueue.poll()); // Hưng

//        Queue<Integer> myQueue = new PriorityQueue<>();
//        // Hàng đợi ưu tiên
//        myQueue.offer(24);
//        myQueue.offer(12);
//        myQueue.offer(1);
//        myQueue.offer(-1);
//        myQueue.offer(-5);
//
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());

        ArrayDeque<String> myQueue = new ArrayDeque<>();
        myQueue.offer("Ning");
        myQueue.offer("Lân");
        myQueue.offer("Đạt");
        myQueue.offer("Hưng");

        System.out.println(myQueue.pollFirst()); // lấy ra đúng thứ dự
        System.out.println(myQueue.pollLast()); // lấy ra đầu còn lại
        System.out.println(myQueue.pollLast());
    }
}
