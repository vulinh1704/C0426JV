package chua_bai.bai_5;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BenhNhan benhNhan = new BenhNhan("Tom", false);
        BenhNhan benhNhan01 = new BenhNhan("Javid", true);
        BenhNhan benhNhan02 = new BenhNhan("Peter", false);
        BenhNhan benhNhan03 = new BenhNhan("James", true);
        BenhNhan benhNhan04 = new BenhNhan("David", false);

        Queue<BenhNhan> hangCho = new PriorityQueue<>();
        hangCho.offer(benhNhan);
        hangCho.offer(benhNhan01);
        hangCho.offer(benhNhan02);
        hangCho.offer(benhNhan03);
        hangCho.offer(benhNhan04);

        System.out.println("Thứ tự khám bênh: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println(hangCho.poll());
        }
    }
}
