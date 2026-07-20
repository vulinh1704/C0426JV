import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String name = "Ning";
//        String name1 = "Ning1";
//        String name2 = "Ning2";
//        String name3 = "Ning3";
//        String name4 = "Ning4";
//        System.out.println(name);
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//        System.out.println(name4);

        // Mảng là 1 cấu trúc cho phép lưu trữ nhiều giá trị liên quan đến nhau.
        // <kieu_du_lieu>[] <ten_mang> = {<value_1>, <value_2>, ...}

        // Phần tử (Element là các giá trị có trong: "Ning", "Ning1", "Ning2",...)
        // Độ dài mảng (length): Số lượng phần tử có trong mảng: <ten_mang>.length
        // Chỉ số (index): là vị trí của các phần tử trong mảng (bắt đầu từ 0 và kết thức length - 1)
        String[] names = {"Ning", "Ning1", "Ning2", "Ning3"};
        // index            0        1       2        3
        System.out.println(names.length);

        // Truy xuất phần tử trong mảng: <ten_mang>[<index>];
        //names[2] = "Hưng"; // cập nhật 1 phần tử
        //System.out.println(names[2]);

        // Mảng trong Java là mảng TĨNH và sẽ không các hàm có sẵn để tương tác như JS (push, pop, replace, concat.,....)
        // Để có mảng động như JS thì trong Java sau sẽ có ArrayList.

        // Duyệt mảng
        /*
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
         */

        // In nhanh 1 mảng trong Java
        // System.out.println(Arrays.toString(names));

        int[] ages = new int[3]; // cách khai báo 2.
        /* Khi khai báo theo kiểu số 2 thì mảng sẽ tự tạo các phần tử
        với giá trị sẽ phụ thuộc vào kiểu dữ liệu:
        + int: 0
        + double: 0.0
        + String: null
        + boolean: false
         */
        System.out.println(Arrays.toString(ages));

        /*
         Bài tập: THực hiện xây dựng thêm sửa xóa tìm kiếm (CRUD)
         với mảng TĨNH trong Java.(Thuật toán) (có thể tham khảo code trên mạng)
         */
    }
}
