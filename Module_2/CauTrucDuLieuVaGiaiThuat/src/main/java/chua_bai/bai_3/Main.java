package chua_bai.bai_3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // So sánh thao tác chèn: linkedList tôi ưu hơn arraylist
        /*
        ArrayList<Integer> arr = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 10000; i++) {
            arr.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Execution time for ArrayList: " + duration + " ms");


        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime2 = System.currentTimeMillis();
        for (int i = 1; i < 10000; i++) {
            linkedList.add(0, i); // thao tác chèn
        }
        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;
        System.out.println("Execution time for LinkedList: " + duration2 + " ms");
         */


        // Lấy ra 1 phần tử ngẫu: arraylist sẽ tối ưu hơn.
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            arr.add(0, i);
        }
        long startTime = System.nanoTime();
        System.out.println(arr.get(1000));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time for ArrayList: " + duration + " ns");


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 10000; i++) {
            linkedList.add(0, i); // thao tác chèn
        }
        long startTime2 = System.nanoTime();
        System.out.println(linkedList.get(1000));
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Execution time for LinkedList: " + duration2 + " ns");
    }
}
