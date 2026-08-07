package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
    public static void main(String[] args) {
        List<Integer> danhSach = new LinkedList<>();
        danhSach.add(1);
        danhSach.add(2);
        danhSach.add(34);
        danhSach.remove(0);
        danhSach.set(1, -1);

        System.out.println("Các phẩn tử: ");
        for(Integer item: danhSach) {
            System.out.println(item);
        }
    }
}
