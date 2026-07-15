import java.util.Scanner;

public class HelloClass {
    // main + tab or psvm + tab: tạo ra hàm main để chạy chường trình
    public static void main(String[] args) {
        // gõ nhanh hiển thị dữ liệu trong terminal: sout + tab
//        System.out.println("Hello World");

        /*
         Khai báo biến:
         <kieu_du_lieu> <ten_bien> = <gia_tri>;
         Trong Java có kiểu dữ liệu khi khai báo và chỉ cho phép gán các giá trị của kiểu dữ liệu đó

         int number = 1; // khai báo 1 biến số nguyên
         String name = "Hello C04";
         // boolean isSick = 1; // lỗi cú pháp
         */

        /*
         Kiểu dữ liệu phổ biến trong java: int (số nguyên), String (chuỗi), boolean (true/false),
         double hoặc float (số thực), char (ký tự)

        int age = 10; // short,long,byte ( Phạm vi khai báo khác nhau. Ví dụ byte khai báo -128 dến 127. Phạm vi: long > int > short > byte)
        // byte b = -129; // error
        String str = "Hi";
        boolean isHandsome = true;
        double n = 4.5;
        float f = 4.6f;
        char c = 'n'; // character
        // Khai báo hằng số: thêm từ khóa final
        final double PI = 3.1412;
        // PI = 4.5; // lỗi
         */
        /*
         Toán tử trong Ja có:
         + Toán tử toán học: +  -  * /  %
         + Toán tử 1 ngôi: ++ -- (Tăng | giảm 1 đơn vị)
         + Toán tử sánh: >  <  >=  <=  ==  !=
         + Toán tử gán: =  +=  -=  /=  *=  %=
         + Toán tử logic: && || !

        int a = 10;
        int b = 20;
        //int c = a / b; // 10 / 20 = 0.5, vì kiểu dữ liệu c là số nguyên nên kết quả sẽ chỉ lấy phần nguên => c = 0;
        double c = (double) a / b; // ép kiểu => c = 0.5
        System.out.println(c);
         */

        /*
        Xuất dữ liệu:
        System.out.println();

        Nhập dữ liệu: (Chỉ có thể nhập qua Màn hình Terminal
        + Scaner là class có sẵn cung cấp các hàm có thể nhập hoặc xuất dữ liệu theo nhiều cách khác nhau (file, bàn phím,..)
         */
        // Khai báo 1 đối tượng để nhập dữ liệu từ bàn phím.
        Scanner input = new Scanner(System.in);
        // Nến có 1 sout chú thích người dùng nhập gì
        System.out.println("Input: ");
        // int number = input.nextInt(); // nhập số nguyên
        // double number = input.nextDouble(); // nhập số thực
        String data = input.nextLine(); // nhập chuỗi
        System.out.println("Your data is: ");
        System.out.println(data);
    }
}


// Đây là comment
/*
Đây là comment
nhiều dòng
*/