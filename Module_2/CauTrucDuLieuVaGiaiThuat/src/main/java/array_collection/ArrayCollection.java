package array_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollection {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // Tĩnh: Cố định số lượng phần tử
        // KHÔNG CÓ các hàm CRUD với dữ liệu trong mảng => Tự viết hàm CRUD nêếu muốn dùng

        // => Sinh ra ArrayList: là 1 trong nhiều collection có sẵn ở Java tổ chức theo cấu trúc dữ liệu dạng mảng
        List<Integer> danhSach = new ArrayList<>();
        danhSach.add(1); // thêm
        danhSach.add(34);
        danhSach.add(32);

        danhSach.set(1, -1); // sửa vị trí 1 thành giá trị -1
        danhSach.remove(2); // xóa vị trí số 2
        System.out.println("Phần tử tại vị trí 0: " + danhSach.get(0));
        System.out.println("Số lượng phần tử: " + danhSach.size()); // lấy ra số lượng phần tử

        // for-each có thể sử dụng để lăp các Collection
        System.out.println("Các phần tử trong mảng: ");
        for(Integer item: danhSach) {
            System.out.println(item);
        }
    }
}
